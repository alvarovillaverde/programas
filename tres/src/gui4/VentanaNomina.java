package gui4;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaNomina extends JFrame {

    private Container contenedor;
    private JTable tablaEmpleados;
    private JScrollPane scrollTabla;
    private ListaEmpleados lista;

    public VentanaNomina(ListaEmpleados lista) {
        this.lista = lista;
        inicio();
        setTitle("Consultar Nómina");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        // Cabeceras de columna asignadas según el String[][] de ListaEmpleados
        String[] columnas = {"Nombre", "Apellidos", "Salario Mensual"};
        
        // Obtiene la matriz de datos actualizada
        String[][] datos = lista.obtenerMatriz();

        tablaEmpleados = new JTable(datos, columnas);
        tablaEmpleados.setEnabled(false); // Deshabilitar edición directa en celdas

        scrollTabla = new JScrollPane(tablaEmpleados);
        contenedor.add(scrollTabla, BorderLayout.CENTER);
    }
}