public class BinaryIterativeSearch implements Practice2Search{
    @Override
    public String searchName()
    {
        return "Binary Iterative Search";
    }
    public int search(int [] arr, int target)
    {
        return binaryIterativeSearch(arr,target, 0,arr.length-1);
    }

    public int binaryIterativeSearch(int[] arr, int target, int lower, int upper) {
        while(lower<=upper){
            int mid = (lower+upper)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid]<target)
                lower = mid+1;
            else
                upper = mid-1;
        }
        return -1;
    }
}
