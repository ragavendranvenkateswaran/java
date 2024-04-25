public class looparray {
    public static void main(String[]  args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int i=0;
        while(i<a.length/2){
           System.out.println(a[i]);
         System.out.println(a[i+a.length/2]);
         i++;
        }
    }
}
