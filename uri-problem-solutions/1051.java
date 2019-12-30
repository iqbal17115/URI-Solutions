import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner input=new Scanner(System.in);
     float num,value1,value2,value3,value4,value5,result,r1,r2,r3;
     num=input.nextFloat();
     if(num >= 0.0 && num <=2000.0){
         System.out.println("Isento");
     }
     else if(num >= 2000.01 && num<= 3000.00){
         value1=(float) (num-2000.00);
         result=(value1*8)/100;
         System.out.printf("R$ %.2f\n",result);
     }
     else if(num >= 3000.01 && num <= 4500.00){
         value1=(float) (num-2000.00);
         value2=value1-1000;
         value3=1000;
         r1=(value3*8)/100;
         r2=(value2*18)/100;
         result=r1+r2;
         System.out.printf("R$ %.2f\n",result);
     }
     else{
         value1=(float) (num-2000.00);
         value2=value1-1000;
         value3=1000;
         value4=value2-1500;
         value5=1500;
         r1=(value3*8)/100;
         r2=(value5*18)/100;
         r3=(value4*28)/100;
         result=r1+r2+r3;
         System.out.printf("R$ %.2f\n",result);
     }
 
    }
 
}