package gui5;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaSalida extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel lblHabitacion, lblFechaIngreso, lblFechaSalida, lblCantidadDias, lblTotal;
    private JTextField txtFechaSalida;
    private JButton btnCalcular, btnRegistrarSalida;
    
    private Hotel hotel;
    private Habitacion habitacion;
    private SimpleDateFormat conversorFecha = new SimpleDateFormat("yyyy/MM/dd");
    private SimpleDateFormat conversorEntrada = new SimpleDateFormat("yyyy-MM-dd");

    public VentanaSalida(Hotel hotel, int numeroHabitacion) {
        this.hotel = hotel;
        this.habitacion = Hotel.listaHabitaciones.get(numeroHabitacion - 1);
        inicio();
        setTitle("Salida huésped");
        setSize(290, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lblHabitacion = new JLabel("Habitación: " + habitacion.getNumeroHabitacion());
        lblHabitacion.setBounds(25, 20, 200, 23);
        contenedor.add(lblHabitacion);

        // Lee la fecha guardada del check-in a través del método de Hotel.java
        String fechaIngStr = hotel.buscarFechaIngresoHabitacion(habitacion.getNumeroHabitacion());
        lblFechaIngreso = new JLabel("Fecha de ingreso: " + fechaIngStr);
        lblFechaIngreso.setBounds(25, 50, 240, 23);
        contenedor.add(lblFechaIngreso);

        lblFechaSalida = new JLabel("Fecha de salida (aaaa-mm-dd):");
        lblFechaSalida.setBounds(25, 80, 240, 23);
        txtFechaSalida = new JTextField();
        txtFechaSalida.setBounds(25, 105, 225, 23);
        contenedor.add(lblFechaSalida); contenedor.add(txtFechaSalida);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(25, 140, 225, 30);
        btnCalcular.addActionListener(this);
        contenedor.add(btnCalcular);

        lblCantidadDias = new JLabel("Cantidad de días: ");
        lblCantidadDias.setBounds(25, 185, 240, 23);
        contenedor.add(lblCantidadDias);

        lblTotal = new JLabel("Total: $");
        lblTotal.setBounds(25, 210, 240, 23);
        contenedor.add(lblTotal);

        btnRegistrarSalida = new JButton("RegistrarSalida");
        btnRegistrarSalida.setBounds(25, 240, 225, 30);
        btnRegistrarSalida.setEnabled(false); // Inactivo por seguridad hasta realizar la liquidación
        btnRegistrarSalida.addActionListener(this);
        contenedor.add(btnRegistrarSalida);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                // Parseamos la fecha del cuadro gráfico usando guiones (el estándar visual)
                Date fechaSal = conversorEntrada.parse(txtFechaSalida.getText().trim());
                Huesped huesped = habitacion.getHuesped();
                
                if (fechaSal.before(huesped.getFechaIngreso())) {
                    JOptionPane.showMessageDialog(this, "La salida no puede ser anterior al ingreso.", "Error Cronológico", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                huesped.setFechaSalida(fechaSal);
                int dias = huesped.obtenerDiasAlojamiento();
                
                // Si entra y sale en la misma jornada se liquida 1 noche de servicio base
                if (dias <= 0) {
                    dias = 1;
                }

                double costeTotal = dias * habitacion.getPrecioDia();

                lblCantidadDias.setText("Cantidad de días: " + dias);
                lblTotal.setText("Total: $" + costeTotal);
                
                btnRegistrarSalida.setEnabled(true); // Se habilita el borrado

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Verifica el formato ingresado (aaaa-mm-dd).", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == btnRegistrarSalida) {
            // Check-out definitivo: Desvinculamos al cliente y habilitamos la habitación
            habitacion.setHuesped(null);
            habitacion.setDisponible(true);
            
            JOptionPane.showMessageDialog(this, "Salida tramitada con éxito. Habitación libre.", "Información", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }
}