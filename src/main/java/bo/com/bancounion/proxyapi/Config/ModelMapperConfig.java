package bo.com.bancounion.proxyapi.Config;


import bo.com.bancounion.proxyapi.dto.ProductoDto;
import bo.com.bancounion.proxyapi.model.Producto;
import jakarta.inject.Singleton;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

@Singleton
public class ModelMapperConfig {
    private final ModelMapper modelMapper;

    public ModelMapperConfig() {
        this.modelMapper = new ModelMapper();
        customizeMapper();
    }

    private void customizeMapper() {
        // mapeo de Producto Entity a DTO
        modelMapper.addMappings(new PropertyMap<Producto, ProductoDto>() {
            @Override
            protected void configure() {
                map().setIdProducto(source.getIdProducto());
                map().setNombre(source.getNombre());
                map().setPrecio(source.getPrecio());
                map().setStock(source.getStock());
                // Puedes omitir otros campos que no desees mapear explícitamente
            }
        });

        modelMapper.addMappings(new PropertyMap<ProductoDto, Producto>() {
            @Override
            protected void configure() {
                map().setIdProducto(source.getIdProducto());
                map().setNombre(source.getNombre());
                map().setPrecio(source.getPrecio());
                map().setStock(source.getStock());
                map().setFechaVencimiento(source.getFechaVencimiento());
                // Puedes omitir otros campos que no desees mapear explícitamente
            }
        });

        // Configuración para mapeo de OtraEntity a OtraDTO
        /*modelMapper.addMappings(new PropertyMap<OtraEntity, OtraDTO>() {
            @Override
            protected void configure() {
                map().setId(source.getId());
                map().setCampo1(source.getCampo1());
                // Puedes omitir otros campos que no desees mapear explícitamente
            }
        });*/
    }
    public ModelMapper modelMapper() {
        return this.modelMapper;
    }


}
