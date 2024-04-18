package mx.utng.sesion24.DP.Factory;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

//Declaro una clase que crea JFrame (ventana básica)
public class Cliente extends JFrame {

    //Declaro dos elementos de formulario 
    private JTextField txtUsuario;
    private JPasswordField txtJPassword;
   
    //Creando los elementos de inicio de ventana 
    public Cliente() {

        //Llamo al constructor de JFrame colocandole un titulo
        super("login");

        //Pongo una operacion para cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Coloco dimensiones de ancho y alto
        setSize(300, 150);

        //Defino un contenedor de elementos visuales
        JPanel panel1 = new JPanel();

        //Al panel le doy un diseño
        panel1.setLayout(new GridLayout(3, 2));

        //Etiqueta para el Usuario
        JLabel lblUsuario = new JLabel("Usuario: ");
        
        //Etiqueta para el password
        JLabel lblPassword = new JLabel("Password: ");

        //Creamoas/iniciamos las cajas de texto
        txtUsuario = new JTextField();
        txtJPassword = new JPasswordField();

        //Creamos un boton 
        JButton btnLogin = new JButton("Login");

        //Colocamos una accon al boton
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] caraPassword = txtJPassword.getPassword();
                String password = new String(caraPassword);

                if (validarLogin(usuario, password)) {
                    JOptionPane.showMessageDialog(Cliente.this, "Login correcto!", "Validacion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Cliente.this, "Usuario o conrtraseña incorrectos!!!");                    
                }

                System.out.printf("Usuario: "+usuario+ " %nPassword: "+password);
            }
        }
        );

        //añadimos los elementos visueles al contenedor
        panel1.add(lblUsuario);
        panel1.add(txtUsuario);
        panel1.add(lblPassword);
        panel1.add(txtJPassword);    
        panel1.add(btnLogin);  
        
        //Agregabdo a la ventana el panel con los elementos visuales
        add(panel1);
        setVisible(true);

        //Centrar la ventana
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Cliente();
    }

    private boolean validarLogin(String Usuario, String Password){
        return Usuario.equals("utng") && Password.equals("Leosdelrey");
    }
}
