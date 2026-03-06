package Array.basic;
public class secondSmall {
    public static int findsecondsmall(int arr[],int n){
int small=Integer.MAX_VALUE;
int secondsmall=Integer.MAX_VALUE;

for(int i=0;i<n;i++){
    if(arr[i]<small){
    secondsmall=small;
    small=arr[i];
    }
    else if(arr[i]<secondsmall &&arr[i]!=small){
        secondsmall=arr[i];
    }
}

return secondsmall;
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,7,8};
        int n=arr.length;
        int ans=findsecondsmall(arr, n);
        System.out.println("Second smalles is : "+ans);
        
    }
}
