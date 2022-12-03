
package Ordenamientoporseleccion;
//Jhosep TS
public class TestOrdenar {
    public static void main(String[] args) {
       Integer[] vals = {5, 80, 85, 16, 54, 37, 32, 33};
        Ordena.seleccion(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
    
}
