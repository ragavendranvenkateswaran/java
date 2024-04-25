import java.util.Scanner;
public class alphapet {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      char O=scan.next().charAt(0),P=scan.next().charAt(0),S=scan.next().charAt(0);
      
      
      
      if(O>='A'&&O<='Z'){
        System.out.println("is capital alphabet");
      }

       else if(P>='a'&&P<='z'){
            System.out.println("is small alphabet");
        }
            
 else if(S>='0'&&S<='9'){
        System.out.println("is  numbers ");
    
      }
      else{
        System.out.println("is special character");
      }
      }
}
