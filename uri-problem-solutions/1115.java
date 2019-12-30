import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
    int X,Y;
    while(((X=input.nextInt())!=0) && ((Y=input.nextInt()) != 0)){
        if(X>0 && Y>0){
            System.out.println("primeiro");
        }
        else if(X > 0 && Y<0){
            System.out.println("quarto");
        }
        else if(X <0 && Y<0){
            System.out.println("terceiro");
        }
        else if(X<0 && Y>0){
            System.out.println("segundo");
        }
    }
 
    }
 
}