import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       double n=3.14;
       while(input.hasNext()){
           double V,D,r,area,height;
           V=input.nextDouble();
           D=input.nextDouble();
           r=D/2;
           area=n*r*r;
           height=V/area;
           System.out.printf("ALTURA = %.2f\n",height);
           System.out.printf("AREA = %.2f\n",area);
       }
       input.close();
 
    }
 
}