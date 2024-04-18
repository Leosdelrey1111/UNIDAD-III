package mx.utng.s29;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    List<Integer> transformar(Iterable<Integer> conjunto, Function<Integer, Integer> function){
        
        List<Integer> nuevaLista = new ArrayList<>();
        for (Integer value : conjunto) {
            nuevaLista.add(function.apply(value));
        }
        return nuevaLista;
    }

    Integer transformarYSumar(Iterable<Integer>conjunto, Function<Integer, Integer>function){
        Integer acumulador = 0;
        for (Integer value : conjunto) {
            acumulador+= function.apply(value);
        }
         return acumulador;
    }
}
