import java.util.Scanner;
public class Exam
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int bs=sc.nextInt();
    float da,hra;
    if(bs<=10000)
    {
        da=bs*0.8f;
        hra=bs*0.2f;
    }
    else if(bs<=20000)
    {
        da=bs*0.9f;
        hra=bs*0.25f;
    }
    else
    {
        da=bs*0.95f;
        hra=bs*0.30f;
    }
    System.out.printf("%.2f",(hra+da+bs));
}
}