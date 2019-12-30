import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
    float[][] M=new float[12][12];
    double sum=0.0,average;
    String O;
    int y=4;
    O=input.nextLine();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j]=input.nextFloat();
            }
        }
        for (int i = 1; i < 11; i++) {
            if(i < 6){
            for (int j = 11,x=0; x < i; j--,x++) {
                sum=sum+M[i][j];
            }
            }
            else if(i == 6){
                for (int j = 11,q=0; q< i-1; j--,q++) {
                    sum=sum+M[i][j];
                }
            }
            else{
                int z=0;
                for (int m = 11; z<y; m--) {
                sum=sum+M[i][m];
                z++;
            }
                y--;
            }
        }
         if(O.equals("S")){
             System.out.printf("%.1f\n",sum);
         }  
         else if(O.equals("M")){
             average=sum/30;
             System.out.printf("%.1f\n",average);
         }
 
    }
 
}