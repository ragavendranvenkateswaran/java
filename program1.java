public class program1 {
    public static void main(String[] args) {
      String a="ab";
      String b="ababab";
      
    // for(int i=1;i==0;){
    //      for(int j=0;j<b.length();){
    //         i
    //      }

    // }
    int i=0;
    int c=0;
    while(i!=-1){
        c++;
       i= b.indexOf(a,i+a.length());//0  second 2,third 4 ,forth -1
    }
   
  System.out.println(c);
    }

 }
        
         
    

