import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
  int[] array=new int[5];
  int num=0;
        for (int i = 0; i < 5; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(array[i] % 2==0){
                num++;
            }
        }
        System.out.printf("%d valores pares\n",num);
 
    }
 
}