package p1q1;

import java.io.*;

public class Student implements Serializable{
    private static int id = 1001;
    private int studentId;
    private String name;
    private int testScore;

    public Student(){
        this.studentId = id++;
    }
    public Student(String name, int testScore) {
        this.studentId = id++;
        this.name = name;
        this.testScore = testScore;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
    
    @Override
    public String toString(){
        return "ID    : " + this.getStudentId() + "\n" +
               "Name  : " + this.getName() + "\n" + 
               "Score : " + this.getTestScore() + "\n";
    }
    
}
