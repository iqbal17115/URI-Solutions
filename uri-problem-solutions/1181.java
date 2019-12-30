import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
     double[][] M=new double[12][12];
     int L;
     double sum=0.0;
     char ch;
      L=input.nextInt();
      ch=input.next().charAt(0);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j]=input.nextDouble();
            }
        }
       
        for (int i = 0; i < 12; i++) {
            sum=sum+M[L][i];
        }
        if(ch == 'S'){
            System.out.println(sum);
        }
        else if(ch == 'M'){
            sum=sum/12;
            System.out.println(sum);
        }
 
    }
 
}