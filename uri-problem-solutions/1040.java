import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
               Scanner input=new Scanner(System.in);
       float N1,N2,N3,N4,N5,avrg,avrg1;
       N1=input.nextFloat();
       N2=input.nextFloat();
       N3=input.nextFloat();
       N4=input.nextFloat();
       avrg=((2*N1)+(3*N2)+(4*N3)+(1*N4))/10;
       if(avrg >= 7.0){
           System.out.printf("Media: %.1f\n",avrg);
           System.out.println("Aluno aprovado.");
       }else if(avrg >=5.0 && avrg<= 6.9){
           System.out.printf("Media: %.1f\n",avrg);
           System.out.println("Aluno em exame.");
           N5=input.nextFloat();
           System.out.printf("Nota do exame: %.1f\n",N5);
           avrg1=(avrg+N5)/2;
           if(avrg1 >= 5.0){
           System.out.println("Aluno aprovado.");
           }else{
               System.out.println("Aluno reprovado.");
           }
           System.out.printf("Media final: %.1f\n",avrg1);
       }
       else if(avrg < 5.0){
           System.out.printf("Media: %.1f\n",avrg);
           System.out.println("Aluno reprovado.");
       }
 
    }
 
}