import java.util.*;
public class function5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char a[]={'-','-','-','-','-','-','-','-','-'};
        char p='O';
        for(int j=0;j<9;j++){
            int b=scan.nextInt();
            if(!move(a, b, p)) {
                j--;
                continue;
            }
            display(a,b,p);
            if(winner (a,p,b)){
                System.out.println("The winner is "+p);
                break;
            }
           
            p=player(p);
        }
    }

    public static void display(char a[],int b,char play){
        int  c=0;
        for (int i=0;i<a.length;i++){
            if(c%3==0&& c!=0){
                System.out.println();
            }  
            System.out.print(a[i]);   
            c++; 
        }
    }
    public static char player( char p){
        if(p=='X'){
            return'O';
        }
        else{
            return'X';
        }
    }
    public static boolean winner(char a[],char p,int b){
        if(a[0]==p&&a[1]==p&&a[2]==p||a[3]==p&&a[4]==p&&a[5]==p||a[6]==p&&a[7]==p&&a[8]==p){
            return true;
        }
        else if (a[0]==p&&a[3]==p&&a[6]==p||a[1]==p&&a[4]==p&&a[7]==p||a[2]==p&&a[5]==p&&a[8]==p) {
            return true;
            } 
        else if(a[0]==p&&a[4]==p&&a[8]==p||a[2]==p&&a[4]==p&&a[6]==p){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean move(char a[], int b, char p){
    
        if(a[b-1]=='-'){
            a[b-1]=p;
            return true;
        }
        else{
            System.out.println("invalid move:"+p);
        return false;
        }
    }
}
       
        
