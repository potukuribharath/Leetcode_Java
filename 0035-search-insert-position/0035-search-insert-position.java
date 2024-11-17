class Solution {
    public int searchInsert(int[] nums, int target) {
        int min=0;
        int max=nums.length-1;
        
        int mid=0;
      while(min<=max){
            mid=min+(max-min)/2;
                
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                min=mid+1;
                
            }else{
                max=mid-1;
            }
           
            
        }return min;
    }
}