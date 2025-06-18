class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        long currentsum=arr[0];
        long maxsum=arr[0];

        for(int i=1;i<n;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maxsum=Math.max(maxsum,currentsum);

        }

        return maxsum;

        
        // Your code here
        
    }
    
}
