class CountNoOfZeroesBinarySearch {
    int firstZero(int arr[], int low, int high)
    {
       while(low<=high)
       {
           int mid = (low + high)/2;
           if((mid == 0 || arr[mid-1] == 1) && arr[mid] == 0)
           return mid;
           else if(arr[mid] == 1)
            low = mid+1;
           else
            high = mid -1;
       }
        return -1;
    }
    int countZeroes(int[] arr, int n) {
        // code here
        int low = 0;
        int high = arr.length-1;
        int firstIndex = firstZero(arr, low, high);
        if(firstIndex == -1)
            return 0;
        return (n-firstIndex);
       
        
    }
}