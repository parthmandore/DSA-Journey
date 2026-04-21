class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int temp[] = {-1,-1};
        int si = 0  ;
        int ei = numbers.length -1 ;
        while(si < ei){
            if(numbers[si] + numbers[ei] == target){
                temp[0] = si+1;
                temp[1] = ei+1;
                return temp;
            }
            else if(numbers[si] + numbers[ei] > target){
                ei--;
            }
            else{
                si++;
            }
        }
        
    return temp;}
}
