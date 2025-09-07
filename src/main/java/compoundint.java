import java.util.Scanner;
public class compoundint {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double principle;
        double rate;
        int timeCompunded;
        int years;
        double amount;
        System.out.println("Enter the priciple amount");
        principle=scanner.nextDouble();

        System.out.print("Enter the interest rate(in %)");
        rate=scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year:");
        timeCompunded=scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years=scanner.nextInt();

        amount=principle*Math.pow(1+rate/timeCompunded,timeCompunded*years);

        System.out.printf("The amount after %d years is $%.2f ",years,amount);
        scanner.close();
    }
    
}
