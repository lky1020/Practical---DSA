package p1q1;

import java.util.*;

public class TestScoreAscending implements Comparator<Student>{
    
    @Override
    public int compare(Student o1, Student o2){
        
        return Integer.compare(o1.getTestScore(), o2.getTestScore());
    }
}
