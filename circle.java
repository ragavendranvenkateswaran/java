import java.util.Scanner;
 public class circle {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     float radius=scan.nextFloat(),pi=3.14f;
     float res;
     res=pi*radius*radius;
     System.out.println("area of circle:"+res);
     res=2*pi*radius;
     System.out.println("perimeter of circle:"+res);
    }
 }



    

