package gui3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCubo extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel labelLado, labelVolumen, labelSuperficie;
    private JTextField campoLado;
    private JButton botonCalcular;

    public VentanaCubo() {
        inicio();
        setTitle("Cubo");
        setSize(280, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        labelLado = new JLabel("Lado (cms):");
        labelLado.setBounds(20, 20, 100, 23);
        campoLado = new JTextField();
        campoLado.setBounds(130, 20, 110, 23);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(20, 60, 220, 30);
        botonCalcular.addActionListener(this);

        labelVolumen = new JLabel("Volumen (cm³): ");
        labelVolumen.setBounds(20, 105, 220, 23);

        labelSuperficie = new JLabel("Superficie (cm²): ");
        labelSuperficie.setBounds(20, 130, 220, 23);

        contenedor.add(labelLado);
        contenedor.add(campoLado);
        contenedor.add(botonCalcular);
        contenedor.add(labelVolumen);
        contenedor.add(labelSuperficie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCalcular) {
            try {
                double Lado = Double.parseDouble(campoLado.getText());

                Cubo cubo = new Cubo(Lado);

                labelVolumen.setText(String.format("Volumen (cm³): %.2f", cubo.getVolumen()));
                labelSuperficie.setText(String.format("Superficie (cm²): %.2f", cubo.getSuperficie()));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Introduce un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
