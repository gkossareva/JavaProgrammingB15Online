package extraPracticeOverriding;

import java.util.Arrays;

public class CodingBat {
    public static void main(String[] args) {
int [] nums={1,6,45};
        int max=nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        for (int i = 0; i <3 ; i++) {
            nums[i]=max;
        }
        System.out.println(Arrays.toString(nums));

    }
}
