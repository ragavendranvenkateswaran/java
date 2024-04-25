import java.util.Scanner;
public class nesloop11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=1,c=1;
        for(int i=1;i<=a;i++){
            if(i%2==0){
                b=i*b;

            }
            else{
                c=i*c;
               
            }
        }
          System.out.println("even numbers"+b);
                System.out.println("odd numbers"+c);
    }
}
