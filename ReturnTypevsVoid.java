public class ReturnTypevsVoid {

    static int search(int[] arr, int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
             return i;
        }
    }
    return -1;
}
public static void main(String[] args) {
    int[] nums = {5,7,9};
    int target = 7;
    int result = search(nums,target);
    System.out.println("Target element found at index  "+result);
}


}
// in return type main method prints after receiving result
    


