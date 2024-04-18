package mx.utng.retoSesion19;

public class SumaPrimerosNumeros {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("la sum de los primeros 100 numeros es: "+suma);
    }
    
}
