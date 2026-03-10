
package Array.basic;
import java.util.Scanner;

public class linear {
    public static int linearsearch(int arr[],int n ,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elments : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
      System.out.println("enter the value of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search : ");
   int k=sc.nextInt();
   int res=linearsearch(arr, n, k);
   System.out.println(res);

    }
    
}
