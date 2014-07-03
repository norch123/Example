/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee")
public class Employee {
    private long id_employee;
    private String first_name;
    private String last_name;
    private String second_name;
    private int age;
    private String expirience;
    private String description;


    @Id
    @Column(name = "id_employee")
    public long getId_employee() {
        return id_employee;
    }
    
    @Column(name = "first_name")
    public String getFirst_name() {
        return first_name;
    }
    
   @Column(name = "last_name")
    public String getLast_name() {
        return last_name;
    }
    
   @Column(name = "second_name")
    public String getSecond_name() {
        return second_name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    @Column(name = "expirience")
    public String getExpirience() {
        return expirience;
    }
  
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExpirience(String expirience) {
        this.expirience = expirience;
    }

    public void setDescription(String description) {
        this.description = description;
    }
 
    
 
}
