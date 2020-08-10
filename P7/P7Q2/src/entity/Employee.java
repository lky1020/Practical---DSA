
package entity;

public abstract class Employee<T extends Comparable<T>> implements Comparable<Employee<T>>{
    private int id;
    private String name;
    private double basicSalary;
    
    //Constructor
    public Employee(){}
    public Employee(int id, String name, double basicSalary){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public abstract double computeMonthlyPay();

    public String toString(){
        return this.id + "\t" + String.format("%-15s", this.name) + "\t";
    }
    
}
