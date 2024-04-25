import java.util.Scanner;
public class tablescan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a4=scan.nextLine(),a5=scan.nextLine(),a6=scan.nextLine();
        int b=scan.nextInt(),b1=scan.nextInt();
        short c=scan.nextShort(),c1= c=scan.nextShort();
        byte d=scan.nextByte(),d1=scan.nextByte();
        long total=scan.nextLong();
        System.out.println("bill no 2145");
         System.out.println("product            price             quatity        subtotal                "  );
         int res;
         res=b*b1;  
         System.out.println(""+a4+"                   "+b+"                   "+b1+"                       " +res     );
         res=c*c1;  
        System.out.println("" +a5+"                   "+c+"                     "+c1+"                     " +res    );
         res=d*d1;
       System.out.println("" +a6+"                    "+d+"                       "+d1+"                   "   +res        );  
       res=(b*b1)+(c*c1)+(d*d1); 
      System.out.println(                                                                                       +res);
    
}
    
}
