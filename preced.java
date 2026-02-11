import java.util.Scanner;

public class preced {
    public static void main(String[] args){
        Scanner val=new Scanner(System.in);
        System.out.println("Enter value of b ");
        float b=val.nextFloat();
        System.out.println("vale of c");
        float c=val.nextFloat();
        System.out.println("vale of a");
        float a =val.nextFloat();
        float u =(b*b-4*a*c)/(2*a);
        System.out.println("your answer");
        System.out.println(u);
        val.close();


    }
    
}
