package gui3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaPiramide extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel labelBase, labelAltura, labelVolumen, labelSuperficie;
    private JTextField campoBase, campoAltura;
    private JButton botonCalcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        labelBase = new JLabel("Base (cms):");
        labelBase.setBounds(20, 20, 100, 23);
        campoBase = new JTextField();
        campoBase.setBounds(130, 20, 110, 23);

        labelAltura = new JLabel("Altura (cms):");
        labelAltura.setBounds(20, 55, 100, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(130, 55, 110, 23);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(20, 100, 220, 30);
        botonCalcular.addActionListener(this);

        labelVolumen = new JLabel("Volumen (cm³): ");
        labelVolumen.setBounds(20, 145, 220, 23);

        labelSuperficie = new JLabel("Superficie (cm²): ");
        labelSuperficie.setBounds(20, 170, 220, 23);

        contenedor.add(labelBase);
        contenedor.add(campoBase);
        contenedor.add(labelAltura);
        contenedor.add(campoAltura);
        contenedor.add(botonCalcular);
        contenedor.add(labelVolumen);
        contenedor.add(labelSuperficie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCalcular) {
            try {
                double base = Double.parseDouble(campoBase.getText());
                double altura = Double.parseDouble(campoAltura.getText());

                Piramide piramide = new Piramide(base, altura);

                labelVolumen.setText(String.format("Volumen (cm³): %.2f", piramide.getVolumen()));
                labelSuperficie.setText(String.format("Superficie (cm²): %.2f", piramide.getSuperficie()));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Introduce valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}