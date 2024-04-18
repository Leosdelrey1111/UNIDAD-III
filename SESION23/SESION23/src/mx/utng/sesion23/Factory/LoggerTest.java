package mx.utng.sesion23.Factory;
import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //Crear un objeto logger
        LoggerFactory factory = new LoggerFactory();
        //el usuario tecleaara el tipo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el tipo de logger:(1)Archivo (2)Consola");
        int type = scanner.nextInt();
        scanner.close(); 
        //Crear el logger de acuerdo al tipo elegido por el usuario
        Logger logger = factory.getLogger(type);
        logger.log("Registro de eventos del sistema"); 
    }
    
}
