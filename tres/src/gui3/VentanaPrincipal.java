package gui3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private JButton botonCilindro, botonEsfera, botonPiramide, botonCubo, botonPrisma;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras Geométricas");
        setSize(280, 290); // Ventana más alta para albergar los 5 botones cómodamente
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // Botón Cilindro
        botonCilindro = new JButton("Cilindro");
        botonCilindro.setBounds(40, 20, 180, 30);
        botonCilindro.addActionListener(this);

        // Botón Esfera
        botonEsfera = new JButton("Esfera");
        botonEsfera.setBounds(40, 65, 180, 30);
        botonEsfera.addActionListener(this);

        // Botón Pirámide
        botonPiramide = new JButton("Pirámide");
        botonPiramide.setBounds(40, 110, 180, 30);
        botonPiramide.addActionListener(this);

        // Botón Cubo
        botonCubo = new JButton("Cubo");
        botonCubo.setBounds(40, 155, 180, 30);
        botonCubo.addActionListener(this);

        // Botón Prisma
        botonPrisma = new JButton("Prisma Rectangular");
        botonPrisma.setBounds(40, 200, 180, 30);
        botonPrisma.addActionListener(this);

        // Añadir componentes al contenedor
        contenedor.add(botonCilindro);
        contenedor.add(botonEsfera);
        contenedor.add(botonPiramide);
        contenedor.add(botonCubo);
        contenedor.add(botonPrisma);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCilindro) {
            VentanaCilindro cilindro = new VentanaCilindro();
            cilindro.setVisible(true);
        }
        if (e.getSource() == botonEsfera) {
            VentanaEsfera esfera = new VentanaEsfera();
            esfera.setVisible(true);
        }
        if (e.getSource() == botonPiramide) {
            VentanaPiramide piramide = new VentanaPiramide();
            piramide.setVisible(true);
        }
        if (e.getSource() == botonCubo) {
            VentanaCubo cubo = new VentanaCubo();
            cubo.setVisible(true);
        }
        if (e.getSource() == botonPrisma) {
            VentanaPrisma prisma = new VentanaPrisma();
            prisma.setVisible(true);
        }
    }
}