
public class SelectionSort {
    public static void main(String args[]){
        
        int[] arr = new int[]{ 15, 8, 10, 2, 5};
        
        arr = selectionSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static int[] selectionSort(int[] arr, int length){
        
        for(int i = 0; i < length - 1; i++){
            
            //Find minimum element in unsorted array
            int indexOfSmallest = i;
            
            for(int j = indexOfSmallest + 1; j < length; j++){
                
                if(arr[j] < arr[indexOfSmallest]){
                    /*if arr[j] smaller than arr[indexOfSmallest]
                    then j will become smallest index*/
                    indexOfSmallest = j;
                }
                
            }
            
            //Swap the element (smaller to front of array)
            int temp = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
}
