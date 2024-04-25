public class forloop {
 public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
   for( int i=0;i<a.length;){
    int temp=a[i];
      a[i]=a[i+1];
      a[i+1]=temp;
      i =i+2;      
 }  

 for (int j=0;j<a.length;j++){
 
   System.out.println(a[j]);

 }
}
}