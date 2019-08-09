public class Text4 {
    public static void main(String[] args) {
		 int x = 11;
        int y = 11;
        for(int i = 0 ; i<x ; i++){
            System.out.print("*");
            for(int j = 0 ;j<y-1; j++){
                if( i==0 | i== (x-1) ){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println("*");
        }
    }
}
