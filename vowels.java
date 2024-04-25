import java.util.Scanner;


public class vowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char vowels=scan.next().charAt(0);
        if(vowels=='a'||vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u'){
            System.out.println(vowels+"  is vowels");
        }
         else{
            System.out.println(vowels+"   is not vowels");
         }   
        

            }
        }

    

