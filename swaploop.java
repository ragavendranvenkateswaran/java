public class swaploop {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
      int i=0;
      while(i<a.length){
     int temp=a[i];
      a[i]=a[i+1];
      a[i+1]=temp;
      i =i+2;      
   
      }
      i=0;
      while(i<a.length){
        System.out.println(a[i]);
        i++;
      }
   
    }              
}
