public class function {
    public static void main(String[] args) {
        int num4=welcome(50,50);
        System.out.println("the returned value is ="+welcome(7,8));
        System.out.println("the num4 isn "+(num4+1000));

    }
    public static String welcome(int num,int num1){
      int result =num+num1;
      System.out.println(result);
      return result;
    }
  
}

