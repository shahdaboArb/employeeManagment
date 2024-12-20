/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dubai key
 */
/*
singleton done
factory done
builder done

*/
public class Payroll implements PayrollInterface{
    
  
    private static Payroll instance;

    // تفاصيل الراتب
    private double balance=100000;
    private double housingAllowance;
    private double transportAllowance;
    private double overtimeRate;
    private double taxes;
    private double insurance;

    // منع إنشاء أكثر من كائن
    Payroll() {
        this.housingAllowance = 10000000;
        this.transportAllowance = 500;
        this.overtimeRate = 100;   // 100 جنيه لكل ساعة إضافية
        this.taxes = 0.1;         // 10% ضرائب
        this.insurance = 0.05;    // 5% تأمينات
    }

    // الحصول على الكائن Singleton
    public static Payroll getInstance() {
        if (instance == null) {
            instance = new Payroll();
        }
        return instance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // حساب الراتب الصافي
//    public double calculateNetSalary(Employee employee, int overtimeHours) {
//        double grossSalary = employee.getBaseSalary() + housingAllowance + transportAllowance + (overtimeHours * overtimeRate);
//        double taxAmount = grossSalary * taxes;
//        double insuranceAmount = grossSalary * insurance;
//        
//        return grossSalary - (taxAmount + insuranceAmount);
//    }
    public void paySalaries(String email){
         Connection con=null;
        Statement statement=null;
        ResultSet result=null;
        con=DatabaseConnectionManager.getInstance().getConnection();
        try{
            
            statement=con.createStatement();
            
            String query="SELECT SUM(salary) AS totalPayroll FROM employee;";
            result=statement.executeQuery(query);
            if(result.next()){
                double TotalSalaries=result.getInt("totalPayroll");
                System.out.println(TotalSalaries+" "+balance);
                if(balance<TotalSalaries){
                    JOptionPane.showMessageDialog(null,"Balance is n't enough");
                }
                else{
                    balance-=TotalSalaries;
                    JOptionPane.showMessageDialog(null,"payroll done successfully " +" balance :"+balance);
                }
               
            }
        }catch(Exception ex){
                    System.out.println("error: "+ex);
        }
            
    }

    

}
