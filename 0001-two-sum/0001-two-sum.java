class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] Tum = new int[2];
         boolean found = false;
        for (int i = 0; i<nums.length-1; i++){
            if(!found){
                for (int n = i+1; n<nums.length; n++){
                    if((target-nums[i])==nums[n]){
                        Tum[0] = i;
                        Tum[1] = n;
                        found = true;
                        break;
                    }
                }
            }
            else{
                break;
            }
        }
        return Tum;
    }
}