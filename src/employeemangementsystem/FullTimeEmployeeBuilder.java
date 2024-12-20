/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangementsystem;

import employeemangementsystem.Employee.Gender;

/**
 *
 * @author dubai key
 */
public class FullTimeEmployeeBuilder {
    private String name;
    private Employee.Gender gender ;
    private String ssn;
    private int id ;
    private double salary;
    private String address;
    private String email;
    private String department;
    private String contractType; // مثل "Full-Time", "Part-Time", "Contractor"
    private String phoneNumber;
    private double baseSalary;
    
    public FullTimeEmployeeBuilder name(String name){
        this.name=name;
        return this;
    }
    public FullTimeEmployeeBuilder SSN(String ssn){
        this.ssn=ssn;
        return this;
    }
    public FullTimeEmployeeBuilder address(String address){
        this.address=address;
        return this;
    }
    public FullTimeEmployeeBuilder email(String email){
        this.email=email;
        return this;
    }
    public FullTimeEmployeeBuilder department(String department){
        this.department=department;
        return this;
    }
    public FullTimeEmployeeBuilder contractType(String contractType){
        this.contractType=contractType;
        return this;
    }
    public FullTimeEmployeeBuilder phoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }
    public FullTimeEmployeeBuilder baseSalary(double baseSalary){
        this.baseSalary=baseSalary;
        return this;
    }
    
    public FullTimeEmployeeBuilder gender(Gender gender){
        this.gender=gender;
        return this;
    }
    public FullTimeEmployee build(){
        return new FullTimeEmployee(name, gender, ssn, id, salary, address, email, department, contractType, phoneNumber, baseSalary);
    }
    
    

}
