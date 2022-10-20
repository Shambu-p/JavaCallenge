/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import Models.Entity.EmployeesModel;

/**
 *
 * @author Abnet
 */
public class EmployeeValidator implements Validation<EmployeesModel> {

    @Override
    public void Validate(EmployeesModel model) throws Exception {
        
        NameValidator(model.first_name);
        NameValidator(model.last_name);
        genderValidator(model.gender);
        emailValidator(model.email);
        passwordValidator(model.password);
        
    }
    
    public void NameValidator(String input) throws Exception {
        if(input.isEmpty() || input.length() < 5 || input.length() > 30){
            throw new Exception("first name cannot be empty, less than 5 characters or greater than 30 characters. \n");
        }
    }
    
    public void genderValidator(String input) throws Exception {
        if(!input.equalsIgnoreCase("male") && !input.equalsIgnoreCase("female")){
            throw new Exception("gender can only be 'male' or 'female', \n");
        }
    }
    
    public void emailValidator(String input) throws Exception {
        if(input.isEmpty() || input.length() < 6 || input.length() > 30){
            throw new Exception("email cannot be empty or less than 6 characters, \n");
        }
    }
    
    public void passwordValidator(String input) throws Exception {
        if(input.isEmpty() || input.length() < 8 || input.length() > 20){
            throw new Exception("password cannot be empty or less than 8 characters");
        }
    }
    
}
