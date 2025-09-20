public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        int start =0;
        int end = 5;
        int result = linearsearchinrange(arr,target,start,end);
         if(result != -1){
            System.out.println("Element"+target+"found at index"+result);

         }
         else{
            System.out.println("Element"+target+"not found in this array list");

        }
         }
    

    static int linearsearchinrange(int[] arr,int target,int start,int end){
        for(int index = start; index <end;index++){
            if(arr[index]== target){
                return index;
            }
            
        }
        return -1;

    }
    
}
