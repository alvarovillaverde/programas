package gui4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaAgregarEmpleado extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel lblNombre, lblApellidos, lblCargo, lblGenero, lblSalario, lblDias, lblOtros, lblSalud, lblPension;
    private JTextField txtNombre, txtApellidos, txtSalario, txtDias, txtOtros, txtSalud, txtPension;
    
    // CORREGIDO: Combos tipados con los enumerados de Empleado
    private JComboBox<Empleado.Cargo> comboCargo;
    private JComboBox<Empleado.Genero> comboGenero;
    
    private JButton btnAceptar, btnCancelar;
    private ListaEmpleados lista;

    public VentanaAgregarEmpleado(ListaEmpleados lista) {
        this.lista = lista;
        inicio();
        setTitle("Agregar Empleado");
        setSize(320, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        int y = 20;
        int separacion = 35;

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, y, 110, 23);
        txtNombre = new JTextField();
        txtNombre.setBounds(140, y, 140, 23);
        contenedor.add(lblNombre); contenedor.add(txtNombre);

        y += separacion;
        lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(20, y, 110, 23);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(140, y, 140, 23);
        contenedor.add(lblApellidos); contenedor.add(txtApellidos);

        y += separacion;
        lblCargo = new JLabel("Cargo:");
        lblCargo.setBounds(20, y, 110, 23);
        // CORREGIDO: Pasa el array de valores del enum directamente
        comboCargo = new JComboBox<>(Empleado.Cargo.values());
        comboCargo.setBounds(140, y, 140, 23);
        contenedor.add(lblCargo); contenedor.add(comboCargo);

        y += separacion;
        lblGenero = new JLabel("Género:");
        lblGenero.setBounds(20, y, 110, 23);
        // CORREGIDO: Pasa el array de valores del enum directamente
        comboGenero = new JComboBox<>(Empleado.Genero.values());
        comboGenero.setBounds(140, y, 140, 23);
        contenedor.add(lblGenero); contenedor.add(comboGenero);

        y += separacion;
        lblSalario = new JLabel("Salario Diario:");
        lblSalario.setBounds(20, y, 110, 23);
        txtSalario = new JTextField();
        txtSalario.setBounds(140, y, 140, 23);
        contenedor.add(lblSalario); contenedor.add(txtSalario);

        y += separacion;
        lblDias = new JLabel("Días Trabajados:");
        lblDias.setBounds(20, y, 110, 23);
        txtDias = new JTextField();
        txtDias.setBounds(140, y, 140, 23);
        contenedor.add(lblDias); contenedor.add(txtDias);

        y += separacion;
        lblOtros = new JLabel("Otros Ingresos:");
        lblOtros.setBounds(20, y, 110, 23);
        txtOtros = new JTextField();
        txtOtros.setBounds(140, y, 140, 23);
        contenedor.add(lblOtros); contenedor.add(txtOtros);

        y += separacion;
        lblSalud = new JLabel("Pago por Salud:");
        lblSalud.setBounds(20, y, 110, 23);
        txtSalud = new JTextField();
        txtSalud.setBounds(140, y, 140, 23);
        contenedor.add(lblSalud); contenedor.add(txtSalud);

        y += separacion;
        lblPension = new JLabel("Aporte Pensión:");
        lblPension.setBounds(20, y, 110, 23);
        txtPension = new JTextField();
        txtPension.setBounds(140, y, 140, 23);
        contenedor.add(lblPension); contenedor.add(txtPension);

        y += 40;
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(30, y, 110, 30);
        btnAceptar.addActionListener(this);
        contenedor.add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(160, y, 110, 30);
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
                String nombre = txtNombre.getText();
                String apellidos = txtApellidos.getText();
                
                // CORREGIDO: Recuperamos el enum seleccionado directamente sin conversiones raras
                Empleado.Cargo cargoElegido = (Empleado.Cargo) comboCargo.getSelectedItem();
                Empleado.Genero generoElegido = (Empleado.Genero) comboGenero.getSelectedItem();
                
                double salario = Double.parseDouble(txtSalario.getText());
                int dias = Integer.parseInt(txtDias.getText());
                double otros = Double.parseDouble(txtOtros.getText());
                double salud = Double.parseDouble(txtSalud.getText());
                double pension = Double.parseDouble(txtPension.getText());

                // Pasamos los objetos Enum directamente al constructor original
                Empleado nuevo = new Empleado(
                    nombre, apellidos, cargoElegido, generoElegido, 
                    salario, dias, otros, salud, pension
                );

                lista.contratarEmpleado(nuevo);

                JOptionPane.showMessageDialog(this, "Empleado agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, introduce valores numéricos correctos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}