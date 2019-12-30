import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          for (int I = 1; I <=10; I=I+2) {
            if(I==10){
                break;
            }
            for (int J = 7; J >= 5; J--) {
                System.out.print("I="+I+" ");
                System.out.println("J="+J);
            }
        }
 
    }
 
}