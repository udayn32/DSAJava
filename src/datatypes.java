class datatypes{
public static void main(String args[])
{
int  age=30;
int year=2025;
int quantity=1;
double price=19;
double gpa=3.5;
double temp=-12.5;
System.out.println(price);
System.out.println("the year is " +year);
char grade='A';
char Symbol='!';
System.out.println(grade);

boolean isStudent=false;
boolean forSale=false;
boolean isOnline=true;
System.out.println(isStudent);
String name="uday";
String food="pizza";
System.out.println("your favorite food is " +food);
String email="fake123@gmail.com";
System.out.println("your email is"+ email);
String car="Mustang";
String color="Red";
char currency='$';
System.out.println(name);

//System.out.println("hello"+ name);
//System.out.println("You are "+ age+"years old");
//System.out.println("Your gpa "+ gpa+"is 10");
//System.out.println("your average letter grade is "+ grade);
System.out.println("your choice is "+ color + " " + year + "" + car);
System.out.println("The price is " + currency + price);
  if(isStudent){
    System.out.println("you are a student");

  }
  else{
    System.out.println("you are not a student");
  }

}
}