package bo.com.bancounion.proxyapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductoDto {

    private Long idProducto;
    private String nombre;
    private BigDecimal precio;
    private Long stock;

    private LocalDate fechaVencimiento;

    public ProductoDto(String nombre, BigDecimal precio, Long stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public ProductoDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
