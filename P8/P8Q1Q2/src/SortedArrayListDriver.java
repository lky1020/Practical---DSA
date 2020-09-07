

public class SortedArrayListDriver {

 /**
 * SortedArrayListDriver.java A driver program to test the SortedArrayList class
 * @author Kat Tan
 */
  public static void main(String[] args) {
    SortedListInterface<String> movieList = new SortedArrayList<String>();

    movieList.add("Red");
    movieList.add("The Expendables");
    movieList.add("How to Train Your Dragon");
    movieList.add("Despicable Me");
    movieList.add("The A-Team");
    movieList.add("Avatar");
    movieList.add("Inception");
    
    System.out.println("Movie List: \n" + movieList);
    
    String movieName = "The A-Team";
    System.out.printf("movieList contains %s: %b\n", movieName, movieList.contains(movieName));
    
    System.out.println("Index = " + movieList.contains("Red"));
    
    System.out.println("\n" + movieList.remove("How to Train Your Dragon"));
    System.out.println("Movie List: \n" + movieList);
    
  }
  
  /*public static <T extends Comparable> boolean contains(T anEntry){
      boolean found = false;
      
      for(int index = 0; !found && (index < length); index++){
          if(anEntry.equals(array[index])){
              found = true;
          }
      }
      
      return found;
  }*/
  
}
