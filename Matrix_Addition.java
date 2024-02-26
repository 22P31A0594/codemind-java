import java.util.Scanner;
import java.util.Arrays;
public class Muls{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        int l=sc.nextInt();
        int[][] arr1=new int[k][l];
        for(int i=0;i<k;i++){
            for(int j=0;j<l;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}