import java.util.Scanner;
public class child {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a="child";
        System.out.println("enter the age");
        byte b=scan.nextByte();
        System.out.println("enter the hemo level");
        float c=scan.nextFloat();
        if(a=="child"){
            if(b>=6&&b<=12){
                if(c>=11.5&&c<=15.5){
                    System.out.println("normal");
                }
                else{
                    System.out.println("up normal");
                }
            }
            else if(b>=2&&b<=6){
                if(c>=11.5&&c<=15.5){
                    System.out.println("normal");
                }
                else{
                    System.out.println("upnormal");
                }
            }
            else if(b>=0.5&&b<=2){
                if(c>=10.5&&c<=13.5){
                    System.out.println("normal");
                }
                else{
                    System.out.println("upnormal");
                }
            }
            else if(b>=2&&b<=6){
                if(c>=9.5&&c<=14.0){
                    System.out.println("normal");
                }
                else{
                    System.out.println("upnormal");
                } 
            }
             else if(b>=1&&b<=2){
                if(c>=9.5&&c<=14.0){
                    System.out.println("normal");
                }
                else{
                    System.out.println("upnormal");
                }   
            }
            else if(b<=1){
                if(c>=10.0&&c<=20.0){
                    System.out.println("normal");
                }
                else{
                    System.out.println("upnormal");
                } 
            }
            
           else{
                System.out.println("invalid age");
            }
        }
        
    }
}
