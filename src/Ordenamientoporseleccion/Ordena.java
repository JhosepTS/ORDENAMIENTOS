
package Ordenamientoporseleccion;
//Jhosep TS
public class Ordena {
    //Ordenamiento por selección
    public static void seleccion(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    Integer aux = data[j];
                    data[j] = data[i];
                    data[i] = aux;
                }
            }
        }
    }
}
