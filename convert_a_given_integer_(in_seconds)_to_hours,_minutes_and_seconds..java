import java.util.Scanner;
public class Exam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt();
        int p1=seconds%60;
        int p2=seconds/60;
        int p3=p2%60;
        p2=p2/60;
        System.out.println("H:M:S-"+ p2 +":" + p3 +":" + p1);
    } 
}