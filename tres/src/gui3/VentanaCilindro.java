package gui3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCilindro extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel labelRadio, labelAltura, labelVolumen, labelSuperficie;
    private JTextField campoRadio, campoAltura;
    private JButton botonCalcular;

    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo cierra esta ventana
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        labelRadio = new JLabel("Radio (cms):");
        labelRadio.setBounds(20, 20, 100, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(130, 20, 110, 23);

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

        contenedor.add(labelRadio);
        contenedor.add(campoRadio);
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
                double radio = Double.parseDouble(campoRadio.getText());
                double altura = Double.parseDouble(campoAltura.getText());

                Cilindro cilindro = new Cilindro(radio, altura);

                labelVolumen.setText(String.format("Volumen (cm³): %.2f", cilindro.getVolumen()));
                labelSuperficie.setText(String.format("Superficie (cm²): %.2f", cilindro.getSuperficie()));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Introduce valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}