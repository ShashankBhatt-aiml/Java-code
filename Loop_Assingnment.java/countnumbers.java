package Loops;

public class countnumbers {
    public static void main(String[] args) {
        int count=0;
        for(int i =1;i<=60;i++){
            if(i%15==0){
                System.out.print(i+" ");
                count++;
            }

        }
            System.out.print("\n"+"counts of number divisible by both 3&5 is:"+count);
        
    }
    
}
