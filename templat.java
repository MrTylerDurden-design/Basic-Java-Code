import java.util.Scanner;
public class templat {
    public static void main(String[] args) {
        System.out.println("Write any Name");
        Scanner sc=new Scanner(System.in);
        String h=sc.next();
        String n="Dear name, Thanks a lot!!";
        String m=n.replace("name",h);
        System.out.println(m);
        //System.out.println(h);
        sc.close();
        
    }
    
}
