import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       int day,month;
       int[] M=new int[12];
       M[0]=31;
       M[1]=29;
       M[2]=31;
       M[3]=30;
       M[4]=31;
       M[5]=30;
       M[6]=31;
       M[7]=31;
       M[8]=30;
       M[9]=31;
       M[10]=30;
       M[11]=25;
       while(input.hasNext()){
           month=input.nextInt();
           day=input.nextInt();
           if(month == 12 && day== 25){
               System.out.println("E natal!");
           }
           else if(month == 12 && day == 24){
               System.out.println("E vespera de natal!");
           }
           else if(month == 12 && day > 25){
               System.out.println("Ja passou!");
           }else{
               int x=M[month-1]-day;
               for (int i = month; i < 12; i++) {
                   x=x+M[i];
               }
               System.out.println("Faltam "+x+" dias para o natal!");
           }
       } 
 
    }
 
}