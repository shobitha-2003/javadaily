public class alphabetTriangle {
    public static void main(String[] args) {
        int n=5;
        int A = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)(A+j)+" ");
            }
            System.out.println();
        }
    }
}
