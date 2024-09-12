import java.util.Scanner;

public class CoconutIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of sweets per box (N): ");
        int N = sc.nextInt();
        
        System.out.println("Enter the number of sweets you need per day (E): ");
        int E = sc.nextInt();
        
        System.out.println("Enter the number of days you need to survive (D): ");
        int D = sc.nextInt();
        
        int totalSweetsNeeded = E * D;
        int buyingDays = D - (D/7);
        int NeededBoxes = (int) Math.ceil((double)totalSweetsNeeded/N);
        if(NeededBoxes<=buyingDays){
            System.out.println("The minimum boxes required is:"+NeededBoxes);
        }
        else
        System.out.println("-1");
    }
}
