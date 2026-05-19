package gui1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private ListaPersona lista; // modelo de datos
    private Container contenedor;  // vista
    private JLabel nombre, apellidos, teléfono, dirección; // etiquetas static atrib
    private JTextField campoNombre, campoApellidos, campoTeléfono, campoDirección; // campos enter text
    private JButton añadir, eliminar, borrarLista, cargarLista, guardarLista; // botones
    private JList<String> listaNombres;  // lista especifica
    private DefaultListModel<String> modelo; // objeto modelo vista
    private JScrollPane scrollLista;  // barra desplazamiento

    public VentanaPrincipal(){
        lista = new ListaPersona(); // crea la lista de personas
        // llamada a la preparacion de la venta
        inicio(); 
        setTitle("Personas"); // titulo de la ventana
        setSize(270,400); // tamaño
        setLocationRelativeTo(null); // posicion en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion del boton de cerrar
        setResizable(false);  // tamaño de la ventana fijo
    }

    private void inicio() {
        contenedor = getContentPane();  // obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // panel sin layout 

        // establece la etiqueta y el campo nombre
        nombre = new JLabel(); 
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23); 
        campoNombre = new JTextField();
        campoNombre.setBounds(105, 20, 135, 23);

        // establece la etiqueta y el campo apellidos
        apellidos = new JLabel();
        apellidos.setText("Apellidos:"); 
        apellidos.setBounds(20, 50, 135, 23);
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23);

        // establece la etiqueta y el campo numero
        teléfono = new JLabel();
        teléfono.setText("Teléfono:");
        teléfono.setBounds(20, 80, 135, 23); 
        campoTeléfono = new JTextField();
        campoTeléfono.setBounds(105, 80, 135, 23);

        // establece la etiqueta y el campo direccion
        dirección = new JLabel();
        dirección.setText("Dirección:");
        dirección.setBounds(20, 110, 135, 23); 
        campoDirección = new JTextField();
        campoDirección.setBounds(105, 110, 135, 23);

        // establece la boton y el campo añadir
        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105, 150, 80, 23); 
        añadir.addActionListener(this);

        // establece la boton y el campo eliminar
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23); 
        eliminar.addActionListener(this);

        // establece la boton y el campo borrar lista
        borrarLista = new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23); 
        borrarLista.addActionListener(this);

        // establece la boton y el campo cargar lista
        cargarLista = new JButton();
        cargarLista.setText("Cargar Lista");
        cargarLista.setBounds(130, 330, 120, 23); 
        cargarLista.addActionListener(this);

        // establece la boton y el campo guardar lista
        guardarLista = new JButton();
        guardarLista.setText("Guardar Lista");
        guardarLista.setBounds(5, 330, 120, 23); 
        guardarLista.addActionListener(this);

        // establece la lista grafica
        listaNombres = new JList<String>();
        // establece que solo se puede seleccionar un elemento de la lista
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel<>();
        
        // 
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190 ,220, 80);
        scrollLista.setViewportView(listaNombres);

        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(teléfono);
        contenedor.add(campoTeléfono);
        contenedor.add(dirección);
        contenedor.add(campoDirección);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
        contenedor.add(cargarLista);
        contenedor.add(guardarLista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) { // al pulsar el boton añadir 
            añadirPersona(); // se invoca añadir persona
        }
        if (evento.getSource() == eliminar) { // al pulsar el boton eliminar
            eliminarNombre(listaNombres.getSelectedIndex()); // se invoca el metodo eliminar
        }
        if (evento.getSource() == borrarLista) { // al pusar el boton borrar lista
            borrarLista(); // se invoca borrar lista
        }
        if (evento.getSource() == cargarLista) {
            cargarColeccion();
        }
        if (evento.getSource() == guardarLista) {
            guardarColeccion();
        }
    }

    private void añadirPersona() {
        // se obtienen los datos ingresados y se crea una persona
        Persona p = new Persona(campoNombre.getText(),
                campoApellidos.getText(),
                campoTeléfono.getText(), campoDirección.getText());
        lista.anadirPersona(p); // se añade al arraylist
        
        String elemento = campoNombre.getText() + "-" + campoApellidos.getText() +
                "-" + campoTeléfono.getText() + "-" + campoDirección.getText();
        modelo.addElement(elemento); 
        listaNombres.setModel(modelo);

        // una vez añadido se restean los campos de texto
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTeléfono.setText("");
        campoDirección.setText("");
    }

    private void eliminarNombre(int indice) {
        if (indice >= 0) { // si existe la posicion
            modelo.removeElementAt(indice); // se elimina la persona de la lista grafica
            lista.eliminarPersona(indice);  // se elimina la persona del arraylist
        } else { 
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista(); // elimina la parte del modelo
        modelo.clear();  // elimina la parte grafica
    }

    private void cargarColeccion() {
        lista.cargarColeccion();
        modelo.clear();

        for (Persona persona : lista.listaPersona) {
            String elemento = persona.nombre + "-" + persona.apellidos + "-" + persona.dirección + "-" + persona.teléfono;
            modelo.addElement(elemento);
        }
    }

    private void guardarColeccion() {
        lista.guardarColeccion();
    }
}