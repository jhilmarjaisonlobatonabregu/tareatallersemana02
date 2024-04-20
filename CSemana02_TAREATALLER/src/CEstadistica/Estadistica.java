/*
    ELABORAR FUNCIONES ESTADÍSTICAS PARA N ELEMENTOS.
    media()
    moda()
    mediana()
    desviación estándar
*/
package CEstadistica;
/**
 *
 * @author USER
 */
public class Estadistica {
    
    // Método para calcular la media aritmética
    public float media(float[] numeros) { //se necesitara el vector para ingresar los numeros.
        float suma = 0;//va a sumar los elementos del vector
        float media;
        for (int i=0;i<numeros.length; i++) {
            suma += numeros[i]; //suma=suma+numeros[i] otra forma de sumar
        }
        media= suma / numeros.length;//se divide la suma de los elementos del vector entre la cantidad de elementos.
        return media;
    }
    
    // Método para calcular la moda
    public float moda(float[] numeros) {
        int cm = 0; // Contador de los elementos repetidos máximos
        float moda = numeros[0]; // Inicializar la moda con el primer elemento del arreglo
        int cont = 1;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == numeros[i - 1]) {
                cont++;
            } else {
                if (cont > cm) {
                    cm = cont;
                    moda = numeros[i - 1];
                }
            cont = 1;
            }
        }
        // Comprobar si el último número repetido es la moda
        if (cont > cm) {
            moda = numeros[numeros.length - 1];
        }
        return moda;
    }
    
    // Método para calcular la mediana
    public float mediana(float[] numeros) {
        if (numeros.length % 2 == 0) {
            int medio1 = numeros.length / 2;
            int medio2 = medio1 - 1;
            return (numeros[medio1] + numeros[medio2]) / 2;
        } else {
            return numeros[numeros.length / 2];
        }
    }
    
    // Método para calcular la desviación estándar
    public float desviacionEstandar(float[] numeros, float mediaA) {
        float media = mediaA;
        float sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria += Math.pow(numeros[i] - media, 2); // Aquí se debe restar cada número de la media
        }
        return (float) Math.sqrt(sumatoria / numeros.length);
    }
}
