import java.lang.reflect.Array;
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=250;
        arr[3]=2;
        arr[4]=256;
        System.out.println(arr[3]);
        //input using for loop
 //       for (int i=0;i<arr.length;i++){
 //           arr[i]= sc.nextInt();

  //      }
//        System.out.println(Arrays.toString(arr));
//     for(int num:arr){
 //        System.out.println(num + "");//here num represents element in an array
 //    }
        String[] str=new String[5];
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));


        str[1]="uday";


        System.out.println(Arrays.toString(str));

    }

}
