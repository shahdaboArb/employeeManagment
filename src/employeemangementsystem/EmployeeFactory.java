/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangementsystem;

/**
 *
 * @author dubai key
 */
public class EmployeeFactory {
    
    public static Employee create(String type,String name, Employee.Gender gender, String ssn, int id, double salary, String address, String email, String department, String contractType, String phoneNumber, double baseSalary){
        switch(type.toLowerCase()){
            case "fulltime":
                return new FullTimeEmployee(name, gender, ssn, id, salary, address, email, department, contractType, phoneNumber, baseSalary);
            case "parttime":
                return new partTimeEmployee(name, gender, ssn, id, salary, address, email, department, contractType, phoneNumber, baseSalary);
            case "contractor":
                return new ContractorEmployee(name, gender, ssn, id, salary, address, email, department, contractType, phoneNumber, baseSalary);    
            default:
                return null;
        }
        
    }
}
