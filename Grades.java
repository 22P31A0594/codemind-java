import java.util.*;
public class Exam
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int phy=sc.nextInt();
    int che=sc.nextInt();
    int bio=sc.nextInt();
    int mat=sc.nextInt();
    int cs=sc.nextInt();
    float tot=phy+che+bio+mat+cs;
    float per=((tot/500)*100);
    if(per>=90)
    System.out.println("Grade A");
    else if(per>=80)
    System.out.println("Grade B");
    else if(per>=70)
    System.out.println("Grade C");
    else if(per>=60)
    System.out.println("Grade D");
    else if(per>=40)
    System.out.println("Grade E");
    else 
    System.out.println("Grade F");
}
}
