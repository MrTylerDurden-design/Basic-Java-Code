import java.util.Scanner;
public class valid {
    public static void main(String[] args){
        Scanner val= new Scanner(System.in);
        System.out.println("Enter the number");

        if (val.hasNextInt()){
            int a =val.nextInt();
            System.out.println(a+ " is an Integer");

        }
         else{
            String b=val.next();
            System.out.println(b+ " the term is invalid");

        }

        val.close();


    }
    
}
