public class nesloop5 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.err.print(j);
            }
            System.out.println();
        }
    }
}
