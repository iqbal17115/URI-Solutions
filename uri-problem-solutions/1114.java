import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner input=new Scanner(System.in);  
        int num;
        while((num=input.nextInt()) != 2002){
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
 
    }
 
}