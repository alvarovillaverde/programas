package gui3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaEsfera extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel labelRadio, labelVolumen, labelSuperficie;
    private JTextField campoRadio;
    private JButton botonCalcular;

    public VentanaEsfera() {
        inicio();
        setTitle("Esfera");
        setSize(280, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        labelRadio = new JLabel("Radio (cms):");
        labelRadio.setBounds(20, 20, 100, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(130, 20, 110, 23);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(20, 60, 220, 30);
        botonCalcular.addActionListener(this);

        labelVolumen = new JLabel("Volumen (cm³): ");
        labelVolumen.setBounds(20, 105, 220, 23);

        labelSuperficie = new JLabel("Superficie (cm²): ");
        labelSuperficie.setBounds(20, 130, 220, 23);

        contenedor.add(labelRadio);
        contenedor.add(campoRadio);
        contenedor.add(botonCalcular);
        contenedor.add(labelVolumen);
        contenedor.add(labelSuperficie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCalcular) {
            try {
                double radio = Double.parseDouble(campoRadio.getText());

                Esfera esfera = new Esfera(radio);

                labelVolumen.setText(String.format("Volumen (cm³): %.2f", esfera.getVolumen()));
                labelSuperficie.setText(String.format("Superficie (cm²): %.2f", esfera.getSuperficie()));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Introduce un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}