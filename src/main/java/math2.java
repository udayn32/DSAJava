
import java.util.Scanner;
public class math2 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    double radius;
    double circumference;
    double area;
    double volume;

    System.out.println("Enter the raidius");
    radius=scanner.nextDouble();
    circumference=2*Math.PI*radius;
    System.out.printf("circumference is %.1fcm\n",circumference);
    area=Math.PI*Math.pow(radius,2);
    System.out.printf("The area is %.1fcm²\n", area);
    volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
    System.out.println("The volume is:"+volume+"cm³");
    


    scanner.close();
    }
}
