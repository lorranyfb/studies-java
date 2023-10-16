import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {
        int [] valores = new int [3];
        valores [0] = 1;
        valores [1] = 2;
        valores [2] = 3;

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        String [] letras = new String [3];
        letras [0] = "A";
        letras [1] = "D";
        letras [2] = "K";

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        //outra maneira de declarar o array
        String [] cores = {"verde", "amarelo", "azul"};
        for (int i = 0; i < letras.length; i++) {
            //System.out.println(cores[i]); //ou
             System.out.println(Arrays.toString(cores));
        }

        //Para o maior e menor valoe
        int [] numeros = { 1, 52, 11, 8, 36, 5};
        int maior = numeros [0];
        int menor = numeros [0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros [i] > maior) {
                maior = numeros [i];
            } if (numeros [i] < menor) {
                menor = numeros [i];
            } media += numeros [i]; {
                System.out.println("Maior: " + maior);
                System.out.println("Menor: " + menor);
                System.out.println("Média: " + media/numeros.length);
            }
        }
    }       
}