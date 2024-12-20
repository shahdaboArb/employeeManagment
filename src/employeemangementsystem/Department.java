/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemangementsystem;

/**
 *
 * @author dubai key
 */
public abstract class Department {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    
    public Department(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    
}
