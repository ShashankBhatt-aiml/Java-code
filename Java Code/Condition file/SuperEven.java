package Conditions;
import java.util.*;

public class SuperEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        if(a%4==0){
            System.out.println(" Super Even");
        }
        else if(a%2==0){
            System.out.println(" Even");
        } 
        else{
            System.out.println("Odd");
        }
        

    }



    
}
