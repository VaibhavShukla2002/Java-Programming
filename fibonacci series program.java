//Fibonacci series program


import java.util.*;

public class Main{

    public static void main(String Args[]){

        int n1=0,n2=1,n3,i,count=05;

        System.out.println(n1+" "+n2);

        for(i=2;i<count;i++){

            n3=n1+n2;

            System.out.println(" "+n3);

            n1=n2;

            n2=n3;

        }

    }

}