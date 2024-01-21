import java.util.Scanner;
public class Exam
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=2*y;
    if(z<=x)
    System.out.println("YES");
    else
    System.out.println("NO");
}

}