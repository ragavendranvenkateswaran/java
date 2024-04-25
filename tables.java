import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the range");
        int a=scan.nextInt();
         int i=1;
         System.out.println("enter the number");
        int b=scan.nextInt();
           while(i<=a){
            System.out.println(b+"*"+i+"="+b*i);
            i++;
        }
    }
}
