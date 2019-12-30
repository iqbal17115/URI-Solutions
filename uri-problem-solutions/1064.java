import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          Scanner input=new Scanner(System.in);
           float[] array=new float[6];
           float avg,sum=0;
           int pos=0;
           for (int i = 0; i < 6; i++) {
            array[i]=input.nextFloat();
        }
           for (int i = 0; i < 6; i++) {
            if(array[i] > 0){
                sum=sum+array[i];
                pos++;
            }
        }
        avg=sum/pos;
        System.out.println(pos+" valores positivos");   
        System.out.printf("%.1f\n",avg);
 
    }
 
}