import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
float[] array=new float[6];
int num=0;
for(int i=0;i<6;i++){
    array[i]=input.nextFloat();
}
        for (int i = 0; i < 6; i++) {
           if(array[i] > 0){
               num++;
           } 
        }
        System.out.println(num+" valores positivos");
 
    }
 
}