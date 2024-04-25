public class function4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        matrix(a);

    }
public static void matrix(int a[]){
    int c=0;
    for(int i=0;i<a.length;i++){
        
        if(c%3==0&& c!=0){
            System.out.println();   
        }
         System.out.print(a[i]);
    c++;
     
    }

}

}
