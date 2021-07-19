import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int [] array;
        array = new int[5];

//continue a solução
        for (int i=0; i<5; i++) {
            array[i]=leitor.nextInt();
            if (array[i] % 2 == 0)
            par++;
            if (array[i] % 2 == 1 || array[i] % 2 == -1 )
            impar++;
            if(array[i] < 0)
            negativo++;
        	if(array[i] > 0)
        	positivo++;
        }
//insira suas variaveis corretamente
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }
	
}