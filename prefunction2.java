public class prefunction2 {

        public static void main(String[] args) {  
        //declaring and initializing a string  
        String str = "method with whitespace as a delimiter         ";  
        int a[]={10,30,50,70,20};
        String noSpacestr=str.replaceAll("\\s","");
        String replaceString=str.replace("whitespace","redspace");
        //declaring an empty string array  
        String[] strArray = null;  
        //converting using String.split() method with whitespace as a delimiter  
        strArray = str.split(" ");  
        //printing the converted string array  
        for (int i = 0; i< strArray.length; i++){  
         
         
        

       }  
       System.out.println(str.length());
       System.out.println(str.toLowerCase());
      System.out.println(noSpacestr.length());
      System.out.println(replaceString);
    int a=20;
    for(int i=10;i<a;i++){
        System.out.println((byte)(Math.random()*20+10));
        
    }
    System.out.println(Math.pow(2,3));
    System.out.println(Math.sqrt(30));
    
        }  
}

