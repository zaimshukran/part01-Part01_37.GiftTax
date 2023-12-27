
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int value = Integer.parseInt(scan.nextLine());
        
        if(value > 1_000_000){
            System.out.println("Tax: " + (142_100 + (value-1_000_000) * 0.17));
        }else if(value > 200_000){
            System.out.println("Tax: " + (22_100 + (value-200_000) * 0.15));
        }else if(value > 55_000){
            System.out.println("Tax: " + (4_700 + (value-55_000) * 0.12));
        }else if(value > 25_000){
            System.out.println("Tax: " + (1700 + (value-25_000) * 0.10));
        }else if(value > 5_000){
            System.out.println("Tax: " + (100 + (value-5_000) * 0.08));
        }else{
            System.out.println("No tax!");
        }
    }
}
