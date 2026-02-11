import java.util.Scanner;
import java.util.Random;
//program not completed
public class rps {
    public static void main(String[] args) {
        Random rand=new Random();
        int num =rand.nextInt(3);
        Scanner op=new Scanner(System.in);
        System.out.println("Choose number");
        int n=op.nextInt();
        if(n==num){
            System.out.println("Draw");
        }
    

op.close();

    }
    
}
 