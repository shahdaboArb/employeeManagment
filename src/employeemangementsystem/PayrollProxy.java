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
public class PayrollProxy implements PayrollInterface{
    
    private Payroll payroll=new Payroll();
    @Override
    public void paySalaries(String email) {
        Connection con=null;
        Statement statement=null;
        ResultSet result=null;
        con=DatabaseConnectionManager.getInstance().getConnection();
        try{
            
            statement=con.createStatement();
            
            String query="SELECT `department` FROM `employee` WHERE email ='"+email+"';";
            result=statement.executeQuery(query);
            if(result.next()){
                String department=result.getString("department");
                if("sales".equals(department)){
                    payroll.paySalaries(email);
                }else{
                    JOptionPane.showMessageDialog(null,"you should deparmtent of sales");
                }
               
            }
        }catch(Exception ex){
                    System.out.println("error: "+ex);
        }
    }
    
}
