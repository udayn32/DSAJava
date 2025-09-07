import java.util.Scanner;
public class shoppingcart {
    public  static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.println("what item would you like to buy?:");
        item=scanner.nextLine();

        System.out.println("waht is the price of each");
        price=scanner.nextDouble();

        System.out.println("how many would you like?");
        quantity=scanner.nextInt();

        total=price*quantity;
        System.out.println(total);
        System.out.println("\nYou have bought" +quantity+ ""+item+"/s");
        System.out.println("Your total is "+currency + total);

        scanner.close();
    }


    
}
