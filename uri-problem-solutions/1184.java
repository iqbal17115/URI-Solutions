import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
      float[][] M=new float[12][12];
      float sum=0.0f;
      String O=input.nextLine();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j]=input.nextFloat();
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                sum=sum+M[i][j];
            }
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