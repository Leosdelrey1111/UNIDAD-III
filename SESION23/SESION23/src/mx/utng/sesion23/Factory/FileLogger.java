package mx.utng.sesion23.Factory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
@Override
public void log(String msg) {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
        writer.write("Registro de archivo");
        writer.close();
    } catch (IOException e) {
        System.out.println("Error de I/O"+ e.getMessage());
    
    }
    
    }
}