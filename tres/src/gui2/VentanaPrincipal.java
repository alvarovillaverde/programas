package gui2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    
    // Etiquetas para identificar los campos de texto
    private JLabel nota1, nota2, nota3, nota4, nota5;
    // Campos de entrada de texto para las notas
    private JTextField campoNota1, campoNota2, campoNota3, campoNota4, campoNota5;
    
    // Botones de la interfaz
    private JButton calcular, limpiar;
    
    // Etiquetas donde se mostrarán los resultados de los cálculos
    private JLabel promedio, desviacion, mayor, menor;

    public VentanaPrincipal() {
        inicio();
        setTitle("Notas");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        // --- ENTRADAS DE NOTAS (Etiquetas y Campos de texto) ---
        nota1 = new JLabel("Nota 1:");
        nota1.setBounds(20, 20, 100, 23);
        campoNota1 = new JTextField();
        campoNota1.setBounds(120, 20, 125, 23);

        nota2 = new JLabel("Nota 2:");
        nota2.setBounds(20, 50, 100, 23);
        campoNota2 = new JTextField();
        campoNota2.setBounds(120, 50, 125, 23);

        nota3 = new JLabel("Nota 3:");
        nota3.setBounds(20, 80, 100, 23);
        campoNota3 = new JTextField();
        campoNota3.setBounds(120, 80, 125, 23);

        nota4 = new JLabel("Nota 4:");
        nota4.setBounds(20, 110, 100, 23);
        campoNota4 = new JTextField();
        campoNota4.setBounds(120, 110, 125, 23);

        nota5 = new JLabel("Nota 5:");
        nota5.setBounds(20, 140, 100, 23);
        campoNota5 = new JTextField();
        campoNota5.setBounds(120, 140, 125, 23);

        // --- BOTONES ---
        calcular = new JButton("Calcular");
        calcular.setBounds(20, 180, 100, 23);
        calcular.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(145, 180, 100, 23);
        limpiar.addActionListener(this);

        // --- ENTIDAD DE RESULTADOS (Etiquetas iniciales vacías) ---
        promedio = new JLabel("Promedio = ");
        promedio.setBounds(20, 220, 220, 23);

        desviacion = new JLabel("Desviación estándar = ");
        desviacion.setBounds(20, 245, 220, 23);

        mayor = new JLabel("Nota mayor = ");
        mayor.setBounds(20, 270, 220, 23);

        menor = new JLabel("Nota menor = ");
        menor.setBounds(20, 295, 220, 23);

        // --- AÑADIR AL CONTENEDOR ---
        contenedor.add(nota1);
        contenedor.add(campoNota1);
        contenedor.add(nota2);
        contenedor.add(campoNota2);
        contenedor.add(nota3);
        contenedor.add(campoNota3);
        contenedor.add(nota4);
        contenedor.add(campoNota4);
        contenedor.add(nota5);
        contenedor.add(campoNota5);
        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviacion);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            calcularResultados();
        }
        if (evento.getSource() == limpiar) {
            limpiarCampos();
        }
    }

    private void calcularResultados() {
        try {
            // Instanciamos la clase Notas de la lógica de negocio
            Notas notas = new Notas();

            // Rescatamos los valores escritos, los pasamos a double y los metemos en el array
            notas.listaNotas[0] = Double.parseDouble(campoNota1.getText());
            notas.listaNotas[1] = Double.parseDouble(campoNota2.getText());
            notas.listaNotas[2] = Double.parseDouble(campoNota3.getText());
            notas.listaNotas[3] = Double.parseDouble(campoNota4.getText());
            notas.listaNotas[4] = Double.parseDouble(campoNota5.getText());

            // Realizamos los cálculos usando los métodos matemáticos de Notas.java
            // formateando a un máximo de 2 decimales string por estética
            promedio.setText(String.format("Promedio = %.2f", notas.calcularPromedio()));
            desviacion.setText(String.format("Desviación estándar = %.2f", notas.calcularDesviacion()));
            mayor.setText(String.format("Nota mayor = %.2f", notas.calcularMayor()));
            menor.setText(String.format("Nota menor = %.2f", notas.calcularMenor()));

        } catch (NumberFormatException ex) {
            // Si algún campo está vacío o contiene letras se captura el error de casteo
            JOptionPane.showMessageDialog(this, 
                    "Por favor, introduce valores numéricos válidos en todas las notas.", 
                    "Error de Formato", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        // Vaciamos los cuadros de texto de la interfaz
        campoNota1.setText("");
        campoNota2.setText("");
        campoNota3.setText("");
        campoNota4.setText("");
        campoNota5.setText("");

        // Restauramos los textos de resultados a su estado por defecto
        promedio.setText("Promedio = ");
        desviacion.setText("Desviación estándar = ");
        mayor.setText("Nota mayor = ");
        menor.setText("Nota menor = ");
    }
}