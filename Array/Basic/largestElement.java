package Array.basic;

public class largest_Element {
    public static int findlargestElement(int[] arr, int n){
        int max=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
    int[] arr={2,5,1,3,0};
    int n=arr.length;
    int max=findlargestElement(arr, n);
System.out.println("The largest element element in tha array is " +max);
 }
    
}
