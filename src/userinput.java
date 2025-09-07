import java.util.Scanner;
public class userinput{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("enter age");
        int age=scanner.nextInt();
        System.out.println("what is your gpa");
        double gpa=scanner.nextDouble();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent=scanner.nextBoolean();
        System.out.println("Hello" +name);
        System.out.println("you are" +age+ "years old");
        System.out.println("your gpa is: " +gpa);
        System.out.println("Student: " +isStudent);
        

        if(isStudent){
            System.out.println("you are a enrolled as astudent");

        }
        else{
            System.out.println("you are not a student");
        }

        scanner.close();
    }
}