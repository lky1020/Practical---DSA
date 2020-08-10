
package entity;

public class Clerk extends Employee{
    
    private double overtimeRate;
    private int overtimeHours;
    
    public Clerk(){}
    public Clerk(int id, String name, double basicSalary, double overtimeRate, int overtimeHours){
        super(id, name, basicSalary);
        this.overtimeRate = overtimeRate;
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    
    public double ComputerOvertimePay(){
        return this.getOvertimeHours() * this.getOvertimeRate();
    }
    
    @Override
    public double computeMonthlyPay(){
        return super.getBasicSalary() + ComputerOvertimePay();
    }
    
    public String toString(){
        return super.toString()  + String.format("%10.2f", this.computeMonthlyPay()) + "\n";
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        
        if(this.getId()  > other.getId()){
            return 1;
        }
        else
            return 0;
    }
}
