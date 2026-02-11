import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner tx=new Scanner(System.in);
        System.out.println("Enter you salary");
        float s=tx.nextFloat();
        if(s<=250000){
            System.out.println("you are free from tax");
        }
        else if(s<=500000){
            float h=(s*5)/100;
            System.out.println("You paid " +h);
        }
        else if(s<=1000000){
            float j=(s*20)/100;
            System.out.println("You paid" +j);
        }
        else{
            float r=(s*30)/100;
            System.out.println("You paid " +r);
        }
        tx.close();
    }
    
}
