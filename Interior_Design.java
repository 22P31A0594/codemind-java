import java.util.Scanner;
public class Exam
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int x2=sc.nextInt();
    int y1=sc.nextInt();
    int y2=sc.nextInt();
    int z=x1+x2;
    int e=y1+y2;
    if(z>e)
    System.out.println(e);
    else
    System.out.println(z);
}
}