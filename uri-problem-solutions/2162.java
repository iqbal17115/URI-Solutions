import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input=new Scanner(System.in);
     int N,value=1;
     int[] Hi=new int[10000];
     N=input.nextInt();
        for (int i = 0; i < N; i++) {
            Hi[i]=input.nextInt();
        }
        if(N == 2){
            if(Hi[0] == Hi[1]){
               value=0; 
            }
        }
        else{
            for (int i = 2; i < N; i++) {
                if(Hi[i] >= Hi[i-1] && Hi[i-1] >= Hi[i-2]){
                    value=0;
                    break;
                }
                if(Hi[i] <= Hi[i-1] && Hi[i-1] <= Hi[i-2]){
                    value=0;
                    break;
                }
            }
        }
        System.out.println(value);
 
    }
 
}