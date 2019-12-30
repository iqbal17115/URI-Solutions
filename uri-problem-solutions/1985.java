import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
     int p;
     float sum=0;
     p=input.nextInt();
     int[] reg=new int[p];
     int[] product=new int[p];
        for (int i = 0; i < p; i++) {
            reg[i]=input.nextInt();
            product[i]=input.nextInt();
        }
        for (int i = 0; i < p; i++) {
            if(reg[i] == 1001){
                sum=sum+(float) (1.50 * product[i]);
            }
            else if(reg[i] == 1002){
                sum=sum+(float) (2.50 * product[i]);
            }
            else if(reg[i] == 1003){
                sum=sum+(float) (3.50 * product[i]);
            }
            else if(reg[i] == 1004){
                sum=sum+(float) (4.50 * product[i]);
            }
            else if(reg[i] == 1005){
                sum=sum+(float) (5.50 * product[i]);
            }
            
        }
        System.out.printf("%.2f\n",sum);
 
    }
 
}