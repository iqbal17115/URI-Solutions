import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
     float [][] M=new float[12][12];
     String O=input.nextLine();
     int p=11;
     float sum=0.0f;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j]=input.nextFloat();
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 11; j >= p; j--) {
                sum=sum+M[i][j];
            }
            p--;
        }
         if(O.equals("S")){
            System.out.printf("%.1f\n",sum);
        }
        else if(O.equals("M")){
            sum=sum/66;
             System.out.printf("%.1f\n",sum);
        }
 
    }
 
}