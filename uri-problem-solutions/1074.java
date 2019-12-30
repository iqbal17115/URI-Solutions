import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
            Scanner input=new Scanner(System.in);
    int sizeOfArray;
    sizeOfArray=input.nextInt();
    int[] array=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i]=input.nextInt();
        }
        for (int i = 0; i < sizeOfArray; i++) {
            if(array[i]%2 ==0 && array[i]>0){
                System.out.println("EVEN POSITIVE");
            }
            else if(array[i]%2 ==0 && array[i]<0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(array[i]%2 !=0 && array[i]>0){
                System.out.println("ODD POSITIVE");
            }
            else if(array[i]%2 !=0 && array[i]<0){
                System.out.println("ODD NEGATIVE");
            }
            else if(array[i] == 0){
                System.out.println("NULL");
            }
        }
 
    }
 
}