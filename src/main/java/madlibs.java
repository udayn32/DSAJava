import java.util.Scanner;
public class madlibs {
    public static void main(String args[])
    {
    Scanner scanner=new Scanner(System.in);
    String adjective1;
    String noun1;
    String adjective2;
    String verb1;
    String adjective3;

    System.out.println("Enter an adjective (description)");
    adjective1=scanner.nextLine();
    System.out.println("Enter a noun (animal or person)");
    noun1=scanner.nextLine();
    System.out.println("Enter an adjective (description)");
    adjective2=scanner.nextLine();
    System.out.println("Enter a verb end with -ing (action)");
    verb1=scanner.nextLine();
    System.out.println("Enter an adjective (description)");
    adjective3=scanner.nextLine();
    
    
    System.out.println("\nToday I went to a " + adjective1+"zoo .");
    System.out.println("In a exhibit ,I saw a" + noun1 + ".");
    System.out.println(noun1 + "\nwas\n" +adjective2+"\nand "+verb1+"!");
    System.out.println("it was "+adjective3+"!");

    
    scanner.close();
    }
}
