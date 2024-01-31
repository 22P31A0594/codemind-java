import java.util.Scanner;
public class Exam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b;
        a=0;
        b=1;
        for(int i=1;i<=n;i++)
        { 
          System.out.printf("%d ",a);
          int c=a+b;
           a=b;
           b=c;
        }
    
    }
}