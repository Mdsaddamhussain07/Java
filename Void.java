public class Void {
    static void search1(int[] arr,int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            System.out.println("Element found at index "+i);
            return;
        }

    }
    System.out.println("Not found in this array");
}
public static void main(String[] args) {
    int[] numbers ={6,4,3};
    // int target = 3;
    
    search1(numbers,3);
    

}
    
}
// in void method itself prints - main method just call it
