import java.util.ArrayList;
import java.util.Scanner;
public class CurrencyExchanger {
    public static void main(String[] args) {
        ArrayList<Integer> coinDenomination = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of coin denomination array");
        int size=sc.nextInt();
        System.out.println("enter elements.....");
        for(int i=0;i<size;i++){
            coinDenomination.add(sc.nextInt());
        }
        System.out.println("enter your amount!");
        float userAmount=sc.nextFloat();
        System.out.println("Processing your change.....");
        //VendingMachine vendingMachine= new VendingMachine();
        VendingMachine.calculateChange(coinDenomination,1.25f,userAmount);
    }
}
