import java.util.Scanner;
public class Exam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q;i++)
        {
            String binaryNumber=sc.nextLine();
            int decimalNumber=Integer.parseInt(binaryNumber,2);
            System.out.println(Integer.toOctalString(decimalNumber));
        }
        }
    }