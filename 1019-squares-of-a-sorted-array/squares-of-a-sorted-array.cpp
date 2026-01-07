class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n =nums.size();
        vector<int> res(n);
        int left=0 ;
        int right = n-1;
        int pos=n-1;
        while(left<=right){
            int a = nums[left]*nums[left];
            int b = nums[right]*nums[right];
            if(a>b){
                res[pos]=a;
                left++;
            }
            else{
                res[pos]=b;
                right--;
            }
            pos--;
        }

        return res;
    }

};