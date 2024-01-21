import java.util.Scanner;
public class Exam
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=4*x;
    if(y<=1000)
    System.out.println("YES");
    else
    System.out.println("NO");
}

}