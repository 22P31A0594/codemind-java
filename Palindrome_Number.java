import java.util.Scanner;
public class Exam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int rev=0,temp;
        temp=n;
        while(n>0){
         int r=n%10;
         rev=(rev*10)+r;
         n=n/10;
        }
        if(temp==rev)
            System.out.println("True");
        else
           System.out.println("False");
        }
    }
}