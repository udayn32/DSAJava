import java.util.Random;
public class random2 {
    public static void main(String args[])
    {
    Random random=new Random();

    Boolean isHeads;

    isHeads=random.nextBoolean();

    System.out.println(isHeads);


    if(isHeads)
    {
        System.out.println("Heads");
    }
    else{
        System.out.println("Tails");
    }



    
    
    
    }
}
