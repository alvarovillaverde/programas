package gui3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaPrisma extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel labelAncho, labelLargo, labelAlto, labelVolumen, labelSuperficie;
    private JTextField campoAncho, campoLargo, campoAlto;
    private JButton botonCalcular;

    public VentanaPrisma() {
        inicio();
        setTitle("Prisma Rectangular");
        setSize(280, 275);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        labelAncho = new JLabel("Ancho (cms):");
        labelAncho.setBounds(20, 20, 100, 23);
        campoAncho = new JTextField();
        campoAncho.setBounds(130, 20, 110, 23);

        labelLargo = new JLabel("Largo (cms):");
        labelLargo.setBounds(20, 55, 100, 23);
        campoLargo = new JTextField();
        campoLargo.setBounds(130, 55, 110, 23);

        labelAlto = new JLabel("Alto (cms):");
        labelAlto.setBounds(20, 90, 100, 23);
        campoAlto = new JTextField();
        campoAlto.setBounds(130, 90, 110, 23);

        botonCalcular = new JButton("Calcular");
        botonCalcular.setBounds(20, 135, 220, 30);
        botonCalcular.addActionListener(this);

        labelVolumen = new JLabel("Volumen (cm³): ");
        labelVolumen.setBounds(20, 180, 220, 23);

        labelSuperficie = new JLabel("Superficie (cm²): ");
        labelSuperficie.setBounds(20, 205, 220, 23);

        contenedor.add(labelAncho);
        contenedor.add(campoAncho);
        contenedor.add(labelLargo);
        contenedor.add(campoLargo);
        contenedor.add(labelAlto);
        contenedor.add(campoAlto);
        contenedor.add(botonCalcular);
        contenedor.add(labelVolumen);
        contenedor.add(labelSuperficie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCalcular) {
            try {
                double ancho = Double.parseDouble(campoAncho.getText());
                double largo = Double.parseDouble(campoLargo.getText());
                double alto = Double.parseDouble(campoAlto.getText());

                Prisma prisma = new Prisma(ancho, largo, alto);

                labelVolumen.setText(String.format("Volumen (cm³): %.2f", prisma.getVolumen()));
                labelSuperficie.setText(String.format("Superficie (cm²): %.2f", prisma.getSuperficie()));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Introduce valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}