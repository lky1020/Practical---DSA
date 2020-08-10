
import adt.*;
import entity.*;
import java.util.*;

public class TestEmployee {
    public static void main(String[] args){
        Employee[] emp = new Employee[5];
        
        emp[0] = new Clerk(2222, "Col. Sanders", 5800.00, 2.0, 50);
        emp[1] = new Clerk(8888, "John Doe", 2000.00, 1.0, 18);
        emp[2] = new Manager(5555, "Jack Bauer", 10000.00, 88.88);
        emp[3] = new Manager(3333, "Tony Fey", 7000.00, 127.00);
        emp[4] = new Manager(7777, "Lee Hom", 7000.00, 976.55);
        
        arrangeArray(emp);
        
        printResult(emp);
        
        //SortedListInterface<Employee> empSortedList = new SortedLinkedList<>();
    }
    
    public static void arrangeArray(Employee[] emp){
        //HardCode without use compareTo
        Employee temp;
        
        for(int i = 0; i < emp.length; i++){
            for(int j = i + 1; j < emp.length; j++){
                
                if((emp[i].compareTo(emp[j])) == 1){
                    temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
                
            }
        }

    }
    
    public static void printResult(Employee[] emp){
        int totalEmp = 0;
        double totalPayroll = 0.0f;
        
        System.out.println("EmpID\t" + String.format("%15s", "Employee Name" + "\tSalary(RM)"));
        for(int i = 0; i < emp.length; i++){
            
            totalEmp++;
            totalPayroll += emp[i].computeMonthlyPay();
            
            System.out.print(emp[i]);
        }
        
        System.out.println("\nTotal employees: " + totalEmp);
        System.out.println("Total payroll for the month: RM " + String.format("%.2f", totalPayroll));
    }
}
