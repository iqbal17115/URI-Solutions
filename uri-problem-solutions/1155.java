import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
          float sum=0;
        float f=1.0f,s=0;
        for (int i = 1; i <= 100; i++) {
           s=s+(1/f);
           f++;
        }
        System.out.printf("%.2f\n",s);
 
    }
 
}