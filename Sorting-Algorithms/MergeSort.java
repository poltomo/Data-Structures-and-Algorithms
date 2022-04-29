class MergeSort{
    public static void mergeSort(int[] arr){
        int n = arr.length; // array length
        if (n<2){
            return; // array has 1 element, so return
        }
        int mid = n/2; // middle index

        int[] arrLeft = new int[mid];
        int[] arrRight = new int[n-mid];

        for (int i=0;i<mid;i++){
            arrLeft[i]=arr[i];
        }
        for (int i=mid;i<n;i++){
            arrRight[i-mid]=arr[i];
        }

        mergeSort(arrLeft);
        mergeSort(arrRight);
    }
    public static void main(String[] args){
        int[] arr = {9,0,8,1,7,2,6,3,5,4};\
        mergeSort(arr);
        System.out.println(arr);
    }
}
