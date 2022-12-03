
package Ordenacionporintercambio;
//Jhosep TS
public class TestOrdenar {
    public static void main(String[] args) {
      Integer[] vals = {47, 52, 82, 17, 54, 37, 15, 38};
        Ordena.burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
    
}
