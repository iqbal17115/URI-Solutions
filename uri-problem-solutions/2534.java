import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
        int N,Q,temp;
        
        while(input.hasNext()){
            N=input.nextInt();
            Q=input.nextInt();
            int x;
            int[] array1=new int[100];
            for (int i = 0; i < N; i++) {
                array1[i]=input.nextInt();
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(array1[i] > array1[j]){
                        temp=array1[i];
                        array1[i]=array1[j];
                        array1[j]=temp;
                    }
                }
            }
            for (int i = 0; i < Q; i++) {
                x=input.nextInt();
                System.out.println(array1[x-1]);
            }
        }
        input.close();
 
    }
 
}