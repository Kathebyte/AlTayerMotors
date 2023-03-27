/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee extends User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    
            
    String salary;
    String jobPosition;

    public Employee(String salary, String jobPosition, String name, String phoneNumber, String address, String email) {
        super(name, phoneNumber, address, email);
        this.salary = salary;
        this.jobPosition = jobPosition;
    }
 
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobPosition() {
        return jobPosition;
    }
    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }   
}
