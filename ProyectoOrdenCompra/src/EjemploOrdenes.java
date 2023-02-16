public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra compra1 = new OrdenCompra("Compra de gafas");

        compra1.setCliente(new Cliente("Emilia", "Prada"));

        compra1.addProducto(new Producto("Dr. Franklin", "Gafas de sol", 40));
        compra1.addProducto(new Producto("Arnette", "Gafas de sol", 120));
        compra1.addProducto(new Producto("D&G", "Gafas de sol", 140));
        compra1.addProducto(new Producto("Polaroid", "Gafas de sol", 90));

        OrdenCompra compra2 = new OrdenCompra("Compra de productos de higiene");

        compra2.setCliente(new Cliente("Gorka", "Lazkao"));

        compra2.addProducto(new Producto("Colgate", "Pasta de diente", 2));
        compra2.addProducto(new Producto("Estrella", "Limpiasuelos", 4));
        compra2.addProducto(new Producto("Kleenex", "Pañuelos de papel", 4));
        compra2.addProducto(new Producto("Vileda", "Valleta", 1));

        OrdenCompra compra3 = new OrdenCompra("Compra de calzado");

        compra3.setCliente(new Cliente("Amaia", "Benito"));

        compra3.addProducto(new Producto("NB", "Zapatillas deportivas", 120));
        compra3.addProducto(new Producto("Converse", "Zapatillas lona", 80));
        compra3.addProducto(new Producto("Adidas", "Zapatillas deportivas", 45));
        compra3.addProducto(new Producto("Nike", "Zapatillas deportivas", 110));

        OrdenCompra[] ordenes = {compra1, compra2, compra3};

        for(OrdenCompra orden:ordenes) {
            System.out.println("Datos de cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido() + ".");
            System.out.println("Descripción de compra: " + orden.getDescripcion() + ".");
            for (Producto prod : orden.getProductos()) {
                System.out.println(prod.getNombre() + " " + prod.getFabricante() + " " + prod.getPrecio() + "€.");
            }
            System.out.println("Fecha de compra: " + orden.getFecha() + ".");
            System.out.println("Id de compra: " + orden.getId());
            System.out.println("Total de la compra: " + orden.totalCompra(orden) + "€.");
            System.out.println("=============================================================");
        }
    }
}
