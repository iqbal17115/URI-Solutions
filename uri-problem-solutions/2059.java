import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
      int p,j1,j2,r,a,sum;
      p=input.nextInt();
      j1=input.nextInt();
      j2=input.nextInt();
      r=input.nextInt();
      a=input.nextInt();
      sum=j1+j2;
      int v=0;
     if((sum%2 == 0 && p == 1) || (sum%2 != 0 && p == 0)){
         v=1;
     }
     else{
         v=2;
     }
     if((r == 1 && a == 0) || (r == 0 && a == 1)){
         v=1;
     }
     else if(r == 1 && a==1){
         v=2;
     }
        System.out.println("Jogador "+v+" ganha!");
 
    }
 
}