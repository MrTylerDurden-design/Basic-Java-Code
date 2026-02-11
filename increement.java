import java.util.Scanner;

public class increement {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Give any Number");
        int x=num.nextInt();
        int r=x;
        int y=++r*4; //First increment then after used
        System.out.println(y);
        int z=x++*4; //First use then after increment
        System.out.println(z);
        
        
        
        char a='B';
        char c=++a;
        System.out.println(c);


        num.close();
    

    }
    
}
