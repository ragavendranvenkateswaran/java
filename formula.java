import java.util.Scanner;
public class formula {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
         int a=scan.nextInt(), b=scan.nextInt();
         int res;
          res=((a*a)+(b*b)+2*(a*b));
         System.out.println("formula:"+res);
        
    }
}
    

