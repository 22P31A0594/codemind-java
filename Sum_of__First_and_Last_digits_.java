import java.util.Scanner;
public class Exam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b,sum;
        b=n%10;
        int a=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
        }
        sum=a+b;
        System.out.printf("%d",sum);
    }
}