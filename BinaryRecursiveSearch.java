public class BinaryRecursiveSearch implements Practice2Search {
    @Override
    public String searchName()
    {
        return "Binary Recursive Search";
    }
    public int search(int [] arr, int target)
    {
        return binaryRecursiveSearch(arr,target, 0,arr.length-1);
    }

    public int binaryRecursiveSearch(int[] arr, int target, int lower, int upper) {
        if (lower > upper)
            return -1;
        int mid = (lower+upper)/2;
        if (arr[mid]==target)
            return mid;
        else if (target < arr[mid])
            return binaryRecursiveSearch(arr, target, lower, mid-1);
        else
            return binaryRecursiveSearch(arr, target, mid+1, upper);
    }

}
