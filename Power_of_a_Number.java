import java.util.Scanner;
public class Exam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=sc.nextInt();
        double k=Math.pow(x,y);
        double l=k%m;
        System.out.printf("%.0f",l);
    }
}