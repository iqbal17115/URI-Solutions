import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
int start,end,temp1=0;
start=input.nextInt();
end=input.nextInt();
if(start < end){
    temp1=end-start;
    System.out.println("O JOGO DUROU "+temp1+" HORA(S)");
}
else if(start > end){
    temp1=(24-start)+end;
    System.out.println("O JOGO DUROU "+temp1+" HORA(S)");
}
else if(start == end){
    temp1=24;
    System.out.println("O JOGO DUROU "+temp1+" HORA(S)");
}
 
    }
 
}