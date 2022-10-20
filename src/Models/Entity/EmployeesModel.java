/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Entity;

import Validations.EmployeeValidator;

/**
 *
 * @author Abnet
 */
public class EmployeesModel {
    
    public int id;
    public String first_name;
    public String last_name;
    public String gender;
    public String email;
    public String password;
    
    public EmployeesModel(String first_name, String last_name, String gender, String email, String password) {
        
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.id = 0;
        
    }
    
}
