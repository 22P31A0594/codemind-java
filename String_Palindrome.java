import java.util.Scanner;
public class exam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean ispalin=true;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            ispalin=false;
            break;
        }
        if(ispalin==true)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        
    }
}