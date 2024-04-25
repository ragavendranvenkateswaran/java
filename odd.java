public class odd {
    public static void main(String[] args) {
        int a[]={5,10,15,20,25,30};
        int i=0;
        int b=0,c=0;
       while (i<=5) {
        if(a[i]%2==0){
        b=a[i]+b;
    
    }
        else{
       c=a[i]+c;
        }
      i++;
    }  
      System.out.println( "even number total:"+b);
      System.out.println("odd number total:"+c);
       
    }
}
