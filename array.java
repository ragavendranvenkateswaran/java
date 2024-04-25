public class array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int temp=a[0];
         a[0]=a[5];
          a[5]=temp;
        int b=a[1];
         a[1]=a[4];
           a[4]=b;
        int c=a[2];
          a[2]=a[3];
          a[3]=c;
        
          System.out.println(a[0]);
           System.out.println(a[1]);
              System.out.println(a[2]);
                 System.out.println(a[3]);
                    System.out.println(a[4]);
                     System.out.println(a[5]);
                      

        }
    }