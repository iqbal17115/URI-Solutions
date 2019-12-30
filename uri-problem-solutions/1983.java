import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
     int n;
     n=input.nextInt();
     double[] note=new double[n];
     double max;
     int[] reg=new int[n];
        for (int i = 0; i < n; i++) {
            reg[i]=input.nextInt();
            note[i]=input.nextDouble();
        }
        max=note[0];
        for (int i = 0; i < n; i++) {
            if(max < note[i]){
                max=note[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(max == note[i]){
                if(max >= 8){
                    System.out.println(reg[i]);
                }else{
                    System.out.println("Minimum note not reached");
                }
            }
        }
 
    }
 
}