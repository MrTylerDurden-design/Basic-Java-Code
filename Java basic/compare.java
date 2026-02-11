import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        System.out.println("Give any Number");
        int a=9;
        Scanner num=new Scanner(System.in);
        int b=num.nextInt();
        if(b>a){
            System.out.println("Your NUmber is Greaten than our Number "+a);
        }
        else{
            System.out.println("Our Number IS greater than your "+a);
        }
        num.close();
    }
    
}