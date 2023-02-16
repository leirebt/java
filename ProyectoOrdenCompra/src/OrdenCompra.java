import java.util.Date;

public class OrdenCompra {

    private Integer id;
    private static int idEstatico;
    private String descripcion;
    private Date fecha = new Date();
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++idEstatico;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        this.productos[indiceProductos++] = producto;
        if(indiceProductos == 4) {
            indiceProductos = 0;
        }
    }
    
    public double totalCompra(OrdenCompra compra) {
        double total = 0;
        for (Producto producto:compra.getProductos()) {
            total += producto.getPrecio();
        }
        return  total;
    }
}
