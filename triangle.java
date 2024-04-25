import java.util.Scanner;
public class triangle{
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      float height=scan.nextFloat(),width=scan.nextFloat(),base=scan.nextFloat();
      float res;
      res=1/2f*base*height;
      System.out.println("area of triangle:"+res);
      res=(height*base)*2;
      System.out.println("perimeter of triangle:"+res);  
    }
    
}
