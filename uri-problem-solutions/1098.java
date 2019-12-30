import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              int j,p,i,s,a,b,k;
        float x,y,z,w,c,d,e,f;
        for (i = 0,p=1,a=1; p <= 3;p++,a++, i++) {
            for (k =1,b=a; k <= 3;b++, k++) {
                System.out.println("I="+i+" J="+b);
            }
            if(i == 2){
                break;
            }
            x=(float) (i+.2);
            c=(float) (a+.2);
            for (k = 1; k <= 3; k++) {
                System.out.println("I="+x+" J="+c);
                c++;
            }
             y=(float) (i+.4);
             d=(float) (a+.4);
            for (k = 1; k <= 3; k++) {
                System.out.println("I="+y+" J="+d);
                d++;
            }
             z=(float) (i+.6);
             e=(float) (a+.6);
            for (k = 1; k <= 3; k++) {
                System.out.println("I="+z+" J="+e);
                e++;
            }
             w=(float) (i+.8);
             f=(float) (a+.8);
            for (k = 1; k <= 3; k++) {
                System.out.println("I="+w+" J="+f);
                f++;
            }
        }
 
    }
 
}