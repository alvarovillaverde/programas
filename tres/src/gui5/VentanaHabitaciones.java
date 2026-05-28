package gui5;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class VentanaHabitaciones extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel[] etiquetasHabitaciones;
    private JLabel lblSeleccion;
    private JSpinner spinnerHabitacion;
    private JButton btnAceptar;
    private Hotel hotel;

    public VentanaHabitaciones(Hotel hotel) {
        this.hotel = hotel;
        inicio();
        setTitle("Habitaciones");
        setSize(620, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        etiquetasHabitaciones = new JLabel[10];
        int xInicial = 30;
        int yInicial = 20;
        int anchoElemento = 100;
        int altoElemento = 45;
        int separacionX = 115;
        int separacionY = 70;

        // Bucle para posicionar en dos filas las 10 etiquetas informativas
        for (int i = 0; i < 10; i++) {
            Habitacion hab = Hotel.listaHabitaciones.get(i);
            String estado = hab.getDisponible() ? "Disponible" : "No disponible";
            
            String textoHtml = "<html><b>Habitación " + hab.getNumeroHabitacion() + "</b><br>" + estado + "</html>";
            etiquetasHabitaciones[i] = new JLabel(textoHtml);
            
            int columna = i % 5;
            int fila = i / 5;
            
            int posX = xInicial + (columna * separacionX);
            int posY = yInicial + (fila * separacionY);
            
            etiquetasHabitaciones[i].setBounds(posX, posY, anchoElemento, altoElemento);
            contenedor.add(etiquetasHabitaciones[i]);
        }

        lblSeleccion = new JLabel("Habitación a reservar:");
        lblSeleccion.setBounds(180, 180, 140, 23);
        contenedor.add(lblSeleccion);

        // Spinner limitado para marcar exclusivamente del rango de habitaciones 1 a 10
        spinnerHabitacion = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        spinnerHabitacion.setBounds(325, 180, 50, 23);
        contenedor.add(spinnerHabitacion);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(410, 176, 100, 30);
        btnAceptar.addActionListener(this);
        contenedor.add(btnAceptar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            int numHabitacion = (int) spinnerHabitacion.getValue();
            Habitacion seleccionada = Hotel.listaHabitaciones.get(numHabitacion - 1);

            if (!seleccionada.getDisponible()) {
                JOptionPane.showMessageDialog(this, "La habitación seleccionada ya se encuentra ocupada.", "Habitación Ocupada", JOptionPane.WARNING_MESSAGE);
            } else {
                // Si está libre, abrimos el formulario de entrada pasándole la habitación a ocupar
                VentanaIngreso formIngreso = new VentanaIngreso(this, seleccionada);
                formIngreso.setVisible(true);
            }
        }
    }

    // Refresca la ventana gráfica al confirmar un check-in exitoso
    public void actualizarPanelHabitaciones() {
        for (int i = 0; i < 10; i++) {
            Habitacion hab = Hotel.listaHabitaciones.get(i);
            String estado = hab.getDisponible() ? "Disponible" : "No disponible";
            etiquetasHabitaciones[i].setText("<html><b>Habitación " + hab.getNumeroHabitacion() + "</b><br>" + estado + "</html>");
        }
    }
}