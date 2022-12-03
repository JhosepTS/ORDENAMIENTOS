
package Ordenamientoporinserción;
//Jhosep TS
public class TestOrdenar {
    public static void main(String[] args) {
         Integer[] vals = {7, 50, 8, 14, 4, 38, 43, 35};
        Ordena.insercion(vals);        
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
    
}
