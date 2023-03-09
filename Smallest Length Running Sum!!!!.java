import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        int N = nums.length;
        for(int i=0;i<N;i++){
            sum+=nums[i];
            while(sum>=target){
                sum=sum-nums[j];
                ans=Math.min(ans,i-j+1);
                j++;
            }
        }
        int m = Integer.MAX_VALUE;
        if(ans==m){
            ans=0;
        }
        return ans;
    }
}
