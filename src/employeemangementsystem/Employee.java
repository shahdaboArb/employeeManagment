
package employeemangementsystem;

/**
 *
 * @author dubai key
 */
public abstract class Employee {
 enum Gender{ male,female};
private String name;
private Gender gender ;
private String ssn;
private int id ;
private double salary;
private String address;
private String email;
private String department;
private String contractType; // مثل "Full-Time", "Part-Time", "Contractor"
private String phoneNumber;
private double baseSalary;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, Gender gender, String ssn, int id, double salary, String address, String email, String department, String contractType, String phoneNumber, double baseSalary) {
        this.name = name;
        this.gender = gender;
        this.ssn = ssn;
        this.id = id;
        this.salary = salary;
        this.address = address;
        this.email = email;
        this.department = department;
        this.contractType = contractType;
        this.phoneNumber = phoneNumber;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name  +
               ", Salary=" + salary + ", Department=" + department  + "]";
    }
}


    

