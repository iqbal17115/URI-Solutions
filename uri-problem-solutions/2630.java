import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
             Scanner input=new Scanner(System.in);
        
            double T,R,G,B,r;
            int p=1;
            int x;
            T=input.nextInt();
            String str;
            int[] array=new int[3];
            for (int i = 0; i < T; i++) {
                str=input.next();
                R=input.nextDouble();
                G=input.nextDouble();
                B=input.nextDouble();
                if(str.equals("eye")){
                    R=(R*30)/100;
                    G=(G*59)/100;
                    B=(B*11)/100;
                    R=(R+G+B);
                    int c=(int) R;
                    System.out.printf("Caso #%d: %d\n",p,c);
                    p++;
                }
                else if(str.equals("mean")){
                    R=(R+G+B)/3;
                    int d=(int) R;
                    System.out.printf("Caso #%d: %d\n",p,d);
                    p++;
                }
                else if(str.equals("max")){
                    if(R >G && R >B){
                        r=R;
                    }else if(G >R && G >B){
                        r=G;
                    }else{
                        r=B;
                    }
                    int e=(int) r;
                    System.out.printf("Caso #%d: %d\n",p,e);
                    p++;
                }
                else if(str.equals("min")){
                    if(R < G && R < B){
                        r=R;
                    }else if(G < R && G < B){
                        r=G;
                    }else{
                        r=B;
                    }
                    int f=(int) r;
                    System.out.printf("Caso #%d: %d\n",p,f);
                    p++;
                }
            }
 
    }
 
}