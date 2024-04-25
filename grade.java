import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>=80&&a<=99){
            System.out.println("is a grade");

        }
       else if(a>=60&&a<=79){
        System.out.println("is b grade");
       }
       else if (a>=40&&a<=59){
        System.out.println("is c grade");
       } 
       else{
        System.out.println("is fail");
       }
    }
}
