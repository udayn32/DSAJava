import java.util.Scanner;
public class code{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        double width=0;
        double height=0;
        double area=0;
        System.out.println("Ente the width");
        width=scanner.nextDouble();
        System.out.println("Enter the width: ");
        height=scanner.nextDouble();
        area=width*height;
        System.out.println("The area os " +area+"cm²");
        
        scanner.close();
    }
}