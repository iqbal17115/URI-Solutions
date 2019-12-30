import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         float S=0;
        for (float i = 1,j=1; i <= 39; i+=2,j=j+j) {
            S=S+(i/j);
        }
        System.out.printf("%.2f\n",S);
 
    }
 
}