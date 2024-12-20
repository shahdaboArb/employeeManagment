/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangementsystem;

/**
 *
 * @author dubai key
 */
public class DepartmentFactory {
    public static Department createDepartment(String type,String name){
        switch(type.toLowerCase()){
            case "it":
                return new ITdepartment(name);
            case "hr":
                return new HRdepartment(name);
            default:
                return null;
        }
    }
}
