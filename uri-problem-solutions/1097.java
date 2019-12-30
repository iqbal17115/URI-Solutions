import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        for (int I = 1,J=7; I < 10; I+=2,J+=2) {
            for (int m = J; m >= J-2; m--) {
                System.out.print("I="+I+" ");
                System.out.println("J="+m);
            }
        }
 
    }
 
}