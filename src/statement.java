import java.util.Scanner;
public class statement {
    public static void main(String args[]){
        //if statement =performs a block of code if its condition is true.
        Scanner scanner=new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age=scanner.nextInt();

        String name;
        System.out.println("Enter your name");
        name=scanner.nextLine();
        Boolean isStudent;
        System.out.println("Are you a student (true/false)");
        isStudent=scanner.nextBoolean();

        //GROUP1
        if(name.isEmpty()){
            System.out.println("You didnt enter your name😒");
        }
        else{
            System.out.println("Hello" +name+ "!");

        }
        
        
        
        
        
        
        
        
        
        //GROUP 2
        if(age>=65){
            System.out.println("You are an senior👴");

        }
        else if(age>=18){
            System.out.println("you are a adult");
        }

        else if(age<0)
        {
            System.out.println("You havent been born yet");
        }
        else if(age==0){
            System.out.println("You are a baby");

        }
        else{
            System.out.println("you are a child");

               }

        //GROUP 3

        if(isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are not a student.👌");

        }
    }
     
}
