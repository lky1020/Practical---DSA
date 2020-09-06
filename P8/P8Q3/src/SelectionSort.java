
public class SelectionSort {
    public static void main(String args[]){
        
        Integer[] arr = new Integer[]{ 15, 8, 10, 2, 5};
        
        arr = selectionSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static <T extends Comparable<? super T>> T[] selectionSort(T[] arr, int length){
        
        for(int i = 0; i < length - 1; i++){
            
            //Find minimum element in unsorted array
            int indexOfSmallest = i;
            
            for(int j = indexOfSmallest + 1; j < length; j++){
                
                if(arr[j].compareTo(arr[indexOfSmallest]) <= -1){
                    /*if arr[j] smaller than arr[indexOfSmallest]
                    then j will become smallest index*/
                    indexOfSmallest = j;
                }
                
            }
            
            //Swap the element (smaller to front of array)
            T temp = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
}
