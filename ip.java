import java.util.Scanner;
public class ip{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        char a=scan.next().charAt(2);
        System.out.println(a);
        int B=scan.nextInt(),b1=scan.nextInt();
         System.out.println(B);
         byte c=scan.nextByte();
          System.out.println(c);
        short d=scan.nextShort();
         System.out.println(d);
         long e=scan.nextLong();
          System.out.println(e);
          float f=scan.nextFloat();
           System.out.println(f);
           double g=scan.nextDouble();
            System.out.println(g);
         boolean h=scan.nextBoolean();
          System.out.println(h);
          String i=scan.nextLine();
           i=scan.nextLine();
          System.out.println(i);     
}
}