package recursividad;

public class ejercicio1 {

    public static void main(String[] args) {
        int[] numeros = { 6, 5, 9, 10, 2, -10, 78};
        System.out.println("Máximo según la version 1: " + maximoRecursivo(numeros,0,numeros[0]));
        System.out.println("Mínimo según la version 1: " + minimoRecursivo(numeros,0,numeros[0]));
        System.out.println("Máximo según la version 2: " + maximoRecursivo2(numeros,0));
        System.out.println("Mínimo según la version 2: " + minimoRecursivo2(numeros,0));
    }


    public static int maximoRecursivo(int[] numeros, int indice, int max){

        if (indice != numeros.length){
            if (numeros[indice] > max) {
                max = maximoRecursivo(numeros, indice +1,numeros[indice]);
            
            }
                else{
                    max = maximoRecursivo(numeros, indice +1, max);
                }
        }

        return max;
    }


    public static int minimoRecursivo(int[] numeros, int indice, int min){

        if (indice != numeros.length){
            if (numeros[indice] < min) {
                min = minimoRecursivo(numeros, indice +1,numeros[indice]);
            
            }
                else{
                    min = minimoRecursivo(numeros, indice +1, min);
                }
        }

        return min;
    }

    
    public static int maximoRecursivo2(int[] numeros, int indice){
        int maximo = Integer.MIN_VALUE;
        if (indice != numeros.length){
           maximo = Math.max(numeros[indice],maximoRecursivo2(numeros,indice +1));
        }

        return maximo;
    }


    public static int minimoRecursivo2(int[] numeros, int indice){
        int minimo = Integer.MAX_VALUE;
        if (indice != numeros.length){
           minimo = Math.min(numeros[indice],minimoRecursivo2(numeros,indice +1));
        }

        return minimo;
    }

}
