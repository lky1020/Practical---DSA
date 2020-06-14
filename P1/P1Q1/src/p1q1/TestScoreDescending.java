package p1q1;

import java.util.*;

public class TestScoreDescending implements Comparator<Student>{
    
    @Override
    public int compare(Student o1, Student o2){
        
        return Integer.compare(o2.getTestScore(), o1.getTestScore());
    }
}
