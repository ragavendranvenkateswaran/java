public class array3 {
    public static void main(String[] args) {
       int a[]={5,6,11,2,1,3};
        for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               
            }
           
        }
      System.out.println(a[i]);  
    }
}
}