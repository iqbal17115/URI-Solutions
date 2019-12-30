import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
        int Ca,Ba,Pa,Cr,Br,Pr,result=0;
        Ca=input.nextInt();
        Ba=input.nextInt();
        Pa=input.nextInt();
        
        Cr=input.nextInt();
        Br=input.nextInt();
        Pr=input.nextInt();
        
        if(Cr > Ca){
            result=Cr-Ca;
        }
        if(Br > Ba){
            result += Br-Ba;
        }
        if(Pr > Pa){
            result += Pr-Pa;
        }
        System.out.println(result);
 
    }
 
}