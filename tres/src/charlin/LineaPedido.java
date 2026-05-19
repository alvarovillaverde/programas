package charlin;

public class LineaPedido {
    private int id=0;
    private int cantidad=0;
    private double subTotal=0;
    private Producto producto;

    public LineaPedido(int id, int cantidad, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto=producto;
        subTotal= producto.getPrecio()*cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }



    @Override
    public String toString() {
        return "LineaPedido{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", producto=" + producto +
                '}';
    }
}