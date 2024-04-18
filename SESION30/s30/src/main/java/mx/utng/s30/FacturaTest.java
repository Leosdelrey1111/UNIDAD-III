package mx.utng.s30;
import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

public class FacturaTest {
    public static void main(String[] args) {
        Factura f1 = new Factura("Computadora", 10000);
        Factura f2 = new Factura("Telefono", 5000);
        Factura f3 = new Factura("Impresora", 4000);
        Factura f4 = new Factura("Tv", 8000);

        List<Factura> facturas = new ArrayList<Factura>();
        facturas.add(f1);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);
        
        Factura fO = null;
        for (Factura factura : facturas) {
            if (factura.getImporte()==5000) {
               fO = factura;
               break;
            }
        }
        System.out.println(fO.getConcepto()+": "+fO.getImporte());
        

        //long x = facturas.stream().filter(s -> s.getImporte() > 4000).count();
        List<Factura> facturasEncontradas = facturas.stream().filter(s -> s.getImporte() > 4000).toList();
        System.out.println(facturasEncontradas);

      //  Factura fs = facturas.stream().filter(s -> s.getImporte() == 5000).findFirst().get();
       // System.out.println(fs.getConcepto()+": "+fs.getImporte());
    }
}
