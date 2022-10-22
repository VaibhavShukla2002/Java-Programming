import java.util.*;

public class Main{

    public static void main(String[] Args){

        Scanner object = new Scanner(System.in);

        int a = object.nextInt();

        int b = object.nextInt();

        if(a==b){
 
           System.out.println("Equal");

        }else if(a<b){

            System.out.println("a is lesser than b");

        }else{

            System.out.println("a is greater than b");

        }

    }

}