import java.util.Scanner;
public class percent{
    public static void main(String[] args){
        System.out.println("Enter the marks obtained");
        Scanner marks= new Scanner(System.in);
        System.out.println("MATHS NUMBER :");
        float num1= marks.nextFloat();
        System.out.println("SCIENCE NUMBER");
        float num2=marks.nextFloat();
        System.out.println("SST NUMBER");
        float num3=marks.nextFloat();
        System.out.println("ENGLISH NUMBER");
        float num4=marks.nextFloat();
        System.out.println("HINDI NUMBER");
        float num5=marks.nextFloat();
        float tot=num1+num2+num3+num4+num5;
        float p=tot/500;
        float perc=p*100;
        System.out.println("YOUR CGPA ACCORDING TO YOUR NUMBER:");
        System.out.println(perc);
        marks.close();

    }
    
}
