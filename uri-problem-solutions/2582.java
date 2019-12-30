import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
           Scanner input=new Scanner(System.in);
        int C,X,Y;
        C=input.nextInt();
        for (int i = 0; i < C; i++) {
            X=input.nextInt();
            Y=input.nextInt();
            if((X+Y) == 0){
                System.out.println("PROXYCITY");
            }
            else if((X+Y)==1){
                System.out.println("P.Y.N.G.");
            }
            else if((X+Y)==2){
                System.out.println("DNSUEY!");
            }
            else if((X+Y)==3){
                System.out.println("SERVERS");
            }
            else if((X+Y)==4){
                System.out.println("HOST!");
            }
            else if((X+Y)==5){
                System.out.println("CRIPTONIZE");
            }
            else if((X+Y)==6){
                System.out.println("OFFLINE DAY");
            }
            else if((X+Y)==7){
                System.out.println("SALT");
            }
            else if((X+Y)==8){
                System.out.println("ANSWER!");
            }
            else if((X+Y)==9){
                System.out.println("RAR?");
            }
            else if((X+Y)==10){
                System.out.println("WIFI ANTENNAS");
            }
        }
 
    }
 
}