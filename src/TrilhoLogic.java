import java.util.*;

// Usar input texto: attackpostponeduntiltwoamxyz
// Usar input chave: 3201456

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int NUM_COLUNAS = 7;

        String textoBase, textoEncriptado;
        char[] chave = new char[NUM_COLUNAS];

        System.out.println("Digite o texto base: ");
        textoBase = scan.nextLine();
        // Validar input

        System.out.println("\nDigite a chave numérica("+ NUM_COLUNAS +"digitos): ");
        chave = scan.next().toCharArray();
        // Validar input

        final int NUM_FILAS = (int) Math.ceil((double) textoBase.length() / NUM_COLUNAS); // numero de caracteres por coluna

        // System.out.println("\nTexto base:");
        // printTexto(textoBase);

        System.out.println("\nTexto base Matriz:");
        printTextoMatriz(textoBase, NUM_COLUNAS, NUM_FILAS);

        System.out.println("\nEncriptando o texto base...");
        textoEncriptado = codificarTexto(textoBase, NUM_COLUNAS, NUM_FILAS, chave);

        // System.out.println("\nTexto encriptado:");
        // printTexto(textoEncriptado);

        System.out.println("\nTexto encriptado Matriz:");
        printTextoMatriz(textoEncriptado, NUM_COLUNAS, NUM_FILAS);
        
        return;
    }

    public static void printTexto(String texto) {
        System.out.println(texto);
    }

    public static void printTextoMatriz(String texto, int numColunas, int numFilas) {
        for(int j = 0; j < numFilas; j++) {
            for(int k = 0; k < numColunas; k++) {
                int posicaoAtual = (j*numColunas) + k;
                System.out.print(getCharAt(texto, posicaoAtual));
            }
            System.out.println();
        }
    }


    public static String codificarTexto(String textoInicial, int numColunas, int numFilas, char[] chave) {
        char[][] matrizAux = new char[numColunas][numFilas];
        String textoFinal = "";

        // Dividir texto em colunas ordenadas pela chave
        for(int j = 0; j < numFilas; j++) {
            for(int k = 0; k < numColunas; k++) {
                int posicaoAtual = (j*numColunas) + k;
                matrizAux[chave[k]-'0'][j] = getCharAt(textoInicial, posicaoAtual);
            }
        }

        // Juntar tudo em uma string
        for(int j = 0; j < numColunas; j++) {
            for(int k = 0; k < numFilas; k++) {
                // System.out.print(matrizAux[j][k]);
                textoFinal += matrizAux[j][k];
            }
            // System.out.println();
        }

        return textoFinal;
    }

    // Retornar um espaço vazio se não houver um char na posição indicada
    public static char getCharAt(String texto, int pos) {
        try {
            return texto.charAt(pos);
        }
        catch(Exception e) {
            return ' ';
        }
    }
}