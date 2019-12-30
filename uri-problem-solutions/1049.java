import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
              Scanner input=new Scanner(System.in);
      String s1,s2,s3;
      s1=input.nextLine();
      s2=input.nextLine();
      s3=input.nextLine();
      if(s1.equals("vertebrado") && s2.equals("ave") && s3.equals("carnivoro")){
          System.out.println("aguia");
      }
      else if(s1.equals("vertebrado") && s2.equals("ave") && s3.equals("onivoro")){
          System.out.println("pomba");
      }
      else if(s1.equals("vertebrado") && s2.equals("mamifero") && s3.equals("onivoro")){
          System.out.println("homem");
      }
      else if(s1.equals("vertebrado") && s2.equals("mamifero") && s3.equals("herbivoro")){
          System.out.println("vaca");
      }
      else if(s1.equals("invertebrado") && s2.equals("inseto") && s3.equals("hematofago")){
          System.out.println("pulga");
      }
      else if(s1.equals("invertebrado") && s2.equals("inseto") && s3.equals("herbivoro")){
          System.out.println("lagarta");
      }
      else if(s1.equals("invertebrado") && s2.equals("anelideo") && s3.equals("hematofago")){
          System.out.println("sanguessuga");
      }
      else if(s1.equals("invertebrado") && s2.equals("anelideo") && s3.equals("onivoro")){
          System.out.println("minhoca");
      }
 
    }
 
}