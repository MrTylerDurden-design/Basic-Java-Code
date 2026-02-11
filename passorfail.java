import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        Scanner mark=new Scanner(System.in);
        System.out.println("Eneter your marks ");
        System.out.println("Subject 1 ");
        float sub1=mark.nextFloat();
        System.out.println("Subject 2");
        float sub2=mark.nextFloat();
        System.out.println("Subject 3");
        float sub3=mark.nextFloat();
        float p1=(sub1/60)*100;
        float p2=(sub2/60)*100;
        float p3=(sub3/60)*100;
        float tot=((sub1+sub2+sub3)/180)*100;
        if(p1<33){
            System.out.println("Your are Fail due to low mark in sub1");
        }
        else if(p2<33){
            System.out.println("Your are fail due to low mark in sub2");
        }
        else if(p3<33){
            System.out.println("You are fail due to low mark in sub3");
        }
        else if(tot<40){
            System.out.println("You are fail due to low mark overall");
        }
        else{
            System.out.println("Congratulation You cleared the Exam");
        }

        mark.close();

        }
    
}
