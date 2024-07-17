package bo.com.bancounion.proxyapi.exception;

import bo.com.bancounion.proxyapi.dto.ResponseData;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Provider
public class GlobalExceptionHandler implements ExceptionMapper<Throwable> {
    private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class.getName());

    @Override
    public Response toResponse (Throwable exception) {
        if (exception instanceof NotFoundException) {
            ResponseData<Object> errorResponse = new ResponseData(
                    Response.Status.NOT_FOUND.getStatusCode(),
                    "VALOR NO ENCONTRADO", // NO DATA FOUND
                    null,
                     exception.getMessage());
            return
                    Response.status(Response.Status.NOT_FOUND).entity(errorResponse).type(MediaType.APPLICATION_JSON).build();
        } else if(exception instanceof BusinessException) {

            ResponseData<Object> errorResponse = new ResponseData(
                    Response.Status.BAD_REQUEST.getStatusCode(),
                    "DATOS INCORRECTOS", // BAD REQUEST
                    null,
                    exception.getMessage());
            return
                    Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).type(MediaType.APPLICATION_JSON).build();

        } if (exception instanceof ConstraintViolation) {

            ConstraintViolationException cve = (ConstraintViolationException) exception;
            Set<String> messages = cve.getConstraintViolations().stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toSet());
            String result = String.join(", ", messages);
            ResponseData<Object> errorResponse = new ResponseData(
                    Response.Status.BAD_REQUEST.getStatusCode(),
                    "DATOS INCORRECTOS", // BAD REQUEST
                    null,
                    result);
            return
                    Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).type(MediaType.APPLICATION_JSON).build();

            /*return Response.status(Response.Status.BAD_REQUEST)
                    .entity(message)
                    .build();*/

        }else {
        ResponseData<Object> errorResponse = new ResponseData(
                Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(),
                "ERROR INTERNO", // BAD REQUEST
                null,
                exception.getMessage());
        return
                Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorResponse).type(MediaType.APPLICATION_JSON).build();

        }
    }
}
