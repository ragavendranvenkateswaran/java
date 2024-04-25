import java.util.Scanner;
public class hemoglobin {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the gender");
     char a=scan.next().charAt(0);
     System.out.println("enter the hemo level");
     float b=scan.nextFloat();
     System.out.println("enter the age");
     int c=scan.nextInt();
     if(a=='m'){
        if(c>12 && c<18){
            if(b>13.2 && b<15.1){
                System.out.println("normal");
            }
            else{
                System.out.println("abnormal");
            }

        }
        else if(c>18){
            if(b>13.6 && b<17.7){
                System.out.println("normal");
            }
            else{
                System.out.println("abnormal");
            }
        }
        else{
            System.out.println("invalid age");
        }

     }
     else if(a=='f'){
        if(c>12 && c<18){
            if(b>12 && b<16){
                System.out.println("normal");
            }
            else{
                System.out.println("abnormal");
            }
        }
        else if(c>18){
            if(b>12.1 && b<15.1){
                System.out.println("normal");
            }
            else{
                System.out.println("abnormal");
            }
        }
        else{
            System.out.println("invalid age");
        }
     }
     else{
        System.out.println("invalid gender");
     }
    
    }
}

    

      


   
    
    

