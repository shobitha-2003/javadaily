public class pattern9 {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++){
            for(int j=1;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int m=0;m<i;m++){
            System.out.print("*");
            }
            System.out.println();

            
        }
    }
    
}
