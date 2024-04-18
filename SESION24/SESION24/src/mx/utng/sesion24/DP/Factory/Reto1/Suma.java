package mx.utng.sesion24.DP.Factory.Reto1;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

//Declaro una clase que crea JFrame (ventana básica)
public class Suma extends JFrame {

    //Declaro dos elementos de formulario 
     private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    //Creando los elementos de inicio de ventana 
    public Suma() {

        //Llamo al constructor de JFrame colocandole un titulo
        super("Suma de dos números");

        //Pongo una operacion para cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Coloco dimensiones de ancho y alto
        setSize(300, 150);

        //Defino un contenedor de elementos visuales
        JPanel panel1 = new JPanel();

        //Al panel le doy un diseño
        panel1.setLayout(new GridLayout(5, 4));

        //Etiqueta para el numero 1
        JLabel lblNumero1 = new JLabel("Número 1: ");
       
        //Etiqueta para el numero2
        JLabel lblNumero2 = new JLabel("Número 2: ");
     
        //etiqueta para el resultado
        JLabel lblResultado = new JLabel("Resultado: ");

        //Creamoas/iniciamos las cajas de texto
        txtNumero1 = new JTextField(10);
        txtNumero2 = new JTextField(10);
        txtResultado = new JTextField(10);
        txtResultado.setEditable(false);
        //Creamos un boton 
        JButton btnSumar = new JButton("SUMAR");

        //Colocamos una accon al boton
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(txtNumero1.getText());
                int numero2 = Integer.parseInt(txtNumero2.getText());
                int resultado = numero1 + numero2;

                txtResultado.setText(String.valueOf(resultado));
                
                //AGREGAR LETRERO

                System.out.printf("Usuario: "+numero1+ " %nPassword: "+numero2);
            }
        }
        );

        //añadimos los elementos visueles al contenedor
        panel1.add(lblNumero1);
        panel1.add(txtNumero1);       
        panel1.add(lblNumero2);        
        panel1.add(txtNumero2);      
        panel1.add(lblResultado);    
        panel1.add(txtResultado);    
        panel1.add(btnSumar);
        
        //Agregabdo a la ventana el panel con los elementos visuales
        add(panel1);
        pack();
        setVisible(true);
        
        //Centrar la ventana
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Suma();
    }

}
