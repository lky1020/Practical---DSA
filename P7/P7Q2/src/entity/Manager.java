
package entity;

public class Manager extends Employee{

    private double allowance;
    
    public Manager(){}
    public Manager(int id, String name, double basicSalary, double allowance){
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    
    
    @Override
    public double computeMonthlyPay() {
        return super.getBasicSalary() + this.getAllowance();
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
