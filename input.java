import java.util.Scanner;

public class input{
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);

        System.out.print("enter your name");
        String name = var.nextLine();

        System.out.print("enter your age");
        int age = var.nextInt();

        System.out.println("Hello, "+ name +"!" );
        System.out.println("You are " + age + "years old");

        var.close();


    }


}