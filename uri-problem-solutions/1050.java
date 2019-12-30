import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input=new Scanner(System.in);
int code;
code=input.nextInt();
if(code==61){
    System.out.println("Brasilia");
}
else if(code==71){
    System.out.println("Salvador");
}
else if(code==11){
    System.out.println("Sao Paulo");
}
else if(code==21){
    System.out.println("Rio de Janeiro");
}
else if(code==32){
    System.out.println("Juiz de Fora");
}
else if(code==19){
    System.out.println("Campinas");
}
else if(code==27){
    System.out.println("Vitoria");
}
else if(code==31){
    System.out.println("Belo Horizonte");
}
else{
    System.out.println("DDD nao cadastrado");
}
 
    }
 
}