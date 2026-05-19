package charlin;

import java.util.ArrayList;

public class Orden {
    private int id=0;
    private ArrayList<LineaPedido> orden;
    private double totalOrden;

    public Orden(int id) {
        this.id = id;
        orden=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<LineaPedido> getOrdenes() {
        return orden;
    }

    public void setOrdenes(ArrayList<LineaPedido> ordenes) {
        this.orden = ordenes;
    }

    //Calcular el TotalDeOrden
    public void calcularTotalOrden(){
        for (LineaPedido pedidos: orden){
            this.totalOrden+= pedidos.getSubTotal();
        }
    }

    //Añadir Item a coleccion
    public void anadirItem(int id, int cantidad, Producto productos){
        orden.add(new LineaPedido(id, cantidad,  productos));
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "id=" + id +
                ", totalOrden=" + totalOrden +
                '}';
    }
}