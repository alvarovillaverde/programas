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

public class VentanaIngreso extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel lblTituloHab, lblFecha, lblSubHuesped, lblNombre, lblApellidos, lblDoc;
    private JTextField txtFecha, txtNombre, txtApellidos, txtDoc;
    private JButton btnAceptar, btnCancelar;
    
    private Habitacion habitacion;
    private VentanaHabitaciones ventanaPadre;
    private SimpleDateFormat conversorFecha = new SimpleDateFormat("yyyy-MM-dd");

    public VentanaIngreso(VentanaHabitaciones padre, Habitacion habitacion) {
        this.ventanaPadre = padre;
        this.habitacion = habitacion;
        inicio();
        setTitle("Ingreso");
        setSize(290, 320);
        setLocationRelativeTo(padre);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lblTituloHab = new JLabel("Habitación: " + habitacion.getNumeroHabitacion());
        lblTituloHab.setBounds(25, 20, 200, 23);
        contenedor.add(lblTituloHab);

        lblFecha = new JLabel("Fecha (aaaa-mm-dd):");
        lblFecha.setBounds(25, 50, 130, 23);
        txtFecha = new JTextField(conversorFecha.format(new Date())); // Pone la fecha actual por defecto
        txtFecha.setBounds(155, 50, 100, 23);
        contenedor.add(lblFecha); contenedor.add(txtFecha);

        lblSubHuesped = new JLabel("Huésped");
        lblSubHuesped.setBounds(25, 85, 200, 23);
        contenedor.add(lblSubHuesped);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(25, 115, 100, 23);
        txtNombre = new JTextField();
        txtNombre.setBounds(135, 115, 120, 23);
        contenedor.add(lblNombre); contenedor.add(txtNombre);

        lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(25, 145, 100, 23);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(135, 145, 120, 23);
        contenedor.add(lblApellidos); contenedor.add(txtApellidos);

        lblDoc = new JLabel("Doc. Identidad:");
        lblDoc.setBounds(25, 175, 100, 23);
        txtDoc = new JTextField();
        txtDoc.setBounds(135, 175, 120, 23);
        contenedor.add(lblDoc); contenedor.add(txtDoc);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(25, 225, 100, 30);
        btnAceptar.addActionListener(this);
        contenedor.add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(145, 225, 100, 30);
        btnCancelar.addActionListener(this);
        contenedor.add(btnCancelar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancelar) {
            this.dispose();
        }

        if (e.getSource() == btnAceptar) {
            try {
                String nombre = txtNombre.getText().trim();
                String apellidos = txtApellidos.getText().trim();
                int documento = Integer.parseInt(txtDoc.getText().trim());
                Date fechaIng = conversorFecha.parse(txtFecha.getText().trim());

                if (nombre.isEmpty() || apellidos.isEmpty()) {
                    throw new IllegalArgumentException();
                }

                // Vinculación de objetos en el modelo lógico
                Huesped nuevoHuesped = new Huesped(nombre, apellidos, documento);
                nuevoHuesped.setFechaIngreso(fechaIng);
                
                habitacion.setHuesped(nuevoHuesped);
                habitacion.setDisponible(false); // Deja de estar libre

                JOptionPane.showMessageDialog(this, "El huésped ha sido registrado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                ventanaPadre.actualizarPanelHabitaciones();
                this.dispose();

            } catch (java.text.ParseException ex) {
                JOptionPane.showMessageDialog(this, "Formato de fecha no admitido. Usa: aaaa-mm-dd", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El Documento de Identidad debe ser puramente numérico.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, "Rellene todos los campos obligatorios del huésped.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}