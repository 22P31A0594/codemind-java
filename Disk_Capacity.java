import java.util.Scanner;
public class Exam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        double d=(t*s*b*512);
        double e=2*d;
        System.out.printf("%.0f",e);
    }
}