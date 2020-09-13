
public class Student {

  private long id;		// Assumption: id is a 4-digit number (to 16digit)
  private String name;
  private double cgpa;

  public Student() {
  }

  public Student(long id, String name, double cgpa) {
    //this.id = id;
    
    this.id = hashCode(id);
    this.name = name;
    this.cgpa = cgpa;
  }

  public int hashCode(long id) { // hashCode directly returns the id
      
      int digitCount = getDigitCount(id);
      int total = 0;
      long modulo = 10000L;
      
      for(int i = 0; i < Math.sqrt(digitCount); i++){
          total += id % modulo;
          id /= 10000;
      }
      
      if(getDigitCount(total) > 4){
          
          if(getDigitCount(total) == 5){
              total /= 10;
          }
          
          if(getDigitCount(total) == 6){
              total /= 100;
          }
      }

      return total;
      
  } // end hashCode

  public boolean equals(Object o) {
    if (o == null || !(o instanceof Student)) {
      return false;
    }

    Student s = (Student) o;
    return this.id == s.id;
  }

  public String toString() {
    return String.format("%15d %-20s %10.2f", id, name, cgpa);
  }
  
  public int getDigitCount(long digit){
      int num = 1;
      
      while(digit > 9){
           digit /= 10;
           num++;
      }
      
      return num;
  }
}
