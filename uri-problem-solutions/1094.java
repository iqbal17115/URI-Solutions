import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
       int N,sumOfR=0,sumOfS=0,sumOfC=0,value;
       String string;
       N=input.nextInt();
        for (int i = 0; i < N; i++) {
            value=input.nextInt();
            //input.nextLine();
            string=input.next();
            if(string.equals("C")){
                sumOfC=sumOfC+value;
            }
            else if(string.equals("R")){
                sumOfR=sumOfR+value;
            }
            else if(string.equals("S")){
                sumOfS=sumOfS+value;
            }
        }
        int total=sumOfC+sumOfR+sumOfS;
        System.out.printf("Total: %d cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",sumOfC);
        System.out.printf("Total de ratos: %d\n",sumOfR);
        System.out.printf("Total de sapos: %d\n",sumOfS);
        float cp,rp,sp;
        cp=(float) (sumOfC*100)/total;
        rp=(float) (sumOfR*100)/total;
        sp=(float) (sumOfS*100)/total;
        System.out.printf("Percentual de coelhos: %.2f %%\n",cp);
        System.out.printf("Percentual de ratos: %.2f %%\n",rp);
        System.out.printf("Percentual de sapos: %.2f %%\n",sp);
 
    }
 
}