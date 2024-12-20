/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangementsystem;

/**
 *
 * @author dubai key
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, Gender gender, String ssn, int id, double salary, String address, String email, String department, String contractType, String phoneNumber, double baseSalary) {
        super(name, gender, ssn, id, salary, address, email, department, contractType, phoneNumber, baseSalary);
    }
    public FullTimeEmployee(FullTimeEmployee emp){
        super(emp.getName(), emp.getGender(), emp.getSsn(), emp.getId(), emp.getSalary(), emp.getAddress(), emp.getEmail(), emp.getDepartment(), emp.getContractType(), emp.getPhoneNumber(), emp.getBaseSalary());
    }
    public FullTimeEmployee clone(){
        return new FullTimeEmployee(this);
    }

    

  
    
}
