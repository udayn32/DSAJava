import java.util.Scanner;
public class math1 {
    public static void main(String[] args){
        //hypo c=Math.sqrt(a²+b²)

        Scanner scanner=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter the lenth of side A");
        a=scanner.nextDouble();
        System.out.println("Enter the lenth of side B");
        b=scanner.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The length of side C is "+c+"cm²");


        scanner.close();

    }
    
}
