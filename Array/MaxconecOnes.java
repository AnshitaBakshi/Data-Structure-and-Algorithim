
public class MaxconecOnes {
    public int findmaxConsecones(int nums[]){
        int cnt=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                cnt=0;

            }
            max=Math.max(max, cnt);
            }
return max;
    
        }
        

    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        MaxconecOnes mco=new MaxconecOnes();
        int result=mco.findmaxConsecones(nums);
        System.out.println(result);
    }
    
}

