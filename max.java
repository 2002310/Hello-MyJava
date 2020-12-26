

public class max {
    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ma(a));

    }
    public static int ma(int[] nums) {
        int str = nums[0];//-2
        int gi = str;//-2
        for(int i = 1;i<nums.length;i++){
            str = nums[i] + Math.max(0,str);//1 -2 4 3 5 6 1 5
            gi = Math.max(str, gi);//1 1 4 4 5 6 6 6
        }
        return gi;
    }
}
