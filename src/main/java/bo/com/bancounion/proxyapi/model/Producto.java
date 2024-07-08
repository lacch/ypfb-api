package bo.com.bancounion.proxyapi.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Productos")
public class Producto {

    @Column (name = "ID_PRODUCTO", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column (name = "NOMBRE")
    private String nombre;

    @Column (name = "PRECIO")
    private BigDecimal Precio;

    @Column (name = "STOCK")
    private Long stock;

    @Column (name = "FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column (name = "ADICIONADO_POR")
    private String adicionadoPor;

    @CreationTimestamp
    @Column (name = "FECHA_ADICION")
    private LocalDate fecha_adicion;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return Precio;
    }

    public void setPrecio(BigDecimal precio) {
        Precio = precio;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getAdicionadoPor() {
        return adicionadoPor;
    }

    public void setAdicionadoPor(String adicionadoPor) {
        this.adicionadoPor = adicionadoPor;
    }

    public LocalDate getFecha_adicion() {
        return fecha_adicion;
    }

    public void setFecha_adicion(LocalDate fecha_adicion) {
        this.fecha_adicion = fecha_adicion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", Precio=" + Precio +
                ", stock=" + stock +
                ", fechaVencimiento=" + fechaVencimiento +
                ", adicionadoPor='" + adicionadoPor + '\'' +
                ", fecha_adicion=" + fecha_adicion +
                '}';
    }


}
