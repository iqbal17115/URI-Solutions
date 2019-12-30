import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
                Scanner input=new Scanner(System.in);
       int[] array=new int[5];
       int even=0,odd=0,positive=0,negative=0;
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
            if(array[i]%2 ==0){
                even++;
            }
            if(array[i]%2 !=0){
                odd++;
            }
            if(array[i] > 0){
                positive++;
            }
            if(array[i] < 0){
                negative++;
            }
        }
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+" valor(es) positivo(s)");
        System.out.println(negative+" valor(es) negativo(s)");
 
    }
 
}