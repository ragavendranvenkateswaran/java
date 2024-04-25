public class function2 {
    public static void main(String[] args) {
        int a[]={10,20,60,50,40,70,30};
        int b=0;
        function(a,b);
    }
    public static void function (int a[], int b){
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
        
            if(a[i]>a[j]){
                b=a[i];
                a[i]=a[j];
                a[j]=b;
            
            }
        }
            
    //    } for(int j=0;j<a.length;j++){
    //     System.out.println(a[j]);
           
    //     }
        System.out.println(b);


    }
}
}