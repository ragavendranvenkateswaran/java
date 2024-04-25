import java.util.Scanner; 
    class area{
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int length=scan.nextInt(),width=scan.nextInt();
            int res;
            res=length*width;
            System.out.println("area of rectangle:"+res);
            res=(length+width)*2;
            System.out.println("perimeter of rectangle"+res);

        }
    }
    

