
import java.util.Iterator;

public class TestSet {
    
    private static IteratorInterface<Set> set;
    
    public TestSet() {
        set = new Set<>();
        initializeList();
        displayList(set);
    }
    
    public static void main(String[] args){
        System.out.println("\nNo Iterator: ");
        Set set1 = new Set();
        Set set2 = new Set();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);


        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        //Add (boolean)
        /*System.out.println(set1.add(1));
        System.out.println(set1);*/
        
        /*//remove (boolean)
        System.out.println(set1.remove(1));
        System.out.println(set1);*/
        
        /*//checkSubset (boolean)
        set2.add(1);
        System.out.println(set1.checkSubset(set2));*/
        
        /*//union (void)
        set1.union(set2);
        System.out.println(set1);*/
        
        //set1.intersection(set2);
        /*set2.add(1);
        set2.add(3);
        Set set3 = set1.intersection(set2);
        System.out.println(set3);*/
        
        //isEmpty() (boolean)
        /*Set set4 = new Set();
        System.out.println(set1.isEmpty());
        System.out.println(set4.isEmpty());*/
       
        //new TestSet();
    }
    
    public static <T> void displayList(IteratorInterface<T> aList) {
        Iterator<T> iterator = aList.getIterator();
        
        System.out.println("\nIterator: ");
        
        while (iterator.hasNext()) {
          System.out.print(iterator.next());
        }
    }
    
    private static void initializeList() {
    // Hardcoded data for testing purposes only
        Set set1 = new Set();
        Set set2 = new Set();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);

        set.add(set1);
        set.add(set2);
    }
}
