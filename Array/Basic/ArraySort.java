package Array.basic;
class Solution{
 public boolean issorted(int[] arr, int n){
        
        for (int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
            
        }
        return true;
}
public class ArraySort {
   
    }
    public static void main(String[] args) {
    int[] arr={2,5,1,3,0};
    int n=arr.length;
    Solution obj = new Solution();
    System.out.println(obj.issorted(arr, n)?"True":"false");
   
 }
    
}
