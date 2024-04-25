import java.util.Scanner;
 public class age {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=2023;
       System.out.println("enter the birth year");
     int   year=scan.nextInt();
       int res;
        res=a-year;

        System.out.println("age:"+res);
    }   
 }