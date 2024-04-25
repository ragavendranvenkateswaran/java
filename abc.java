import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
        if (a>b&&a>c){
            System.out.println("a is greater");
        }
        else if(b>a&&b>c){
            System.out.println("b is greater");
        }
          
        else if(c>a&&c>b){
            System.out.println("c is greater");
        } 
        else{
            System.out.println("SOME DATA IS SAME VALUES");
        }
        }       
            }
        
    


