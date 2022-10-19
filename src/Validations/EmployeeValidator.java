/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import Models.EmployeesModel;

/**
 *
 * @author Abnet
 */
public class EmployeeValidator implements Validation<EmployeesModel> {

    @Override
    public void Validate(EmployeesModel model) throws Exception {
        
        if(
            (model.first_name.isEmpty() || model.first_name.length() < 5) && 
            (model.last_name.isEmpty() || model.last_name.length() < 5) && 
            (model.gender.equalsIgnoreCase("male") || model.gender.equalsIgnoreCase("female")) &&
            (model.email.isEmpty() || model.email.length() < 6) &&
            (model.password.isEmpty() && model.password.length() < 8)
        ){
            throw new Exception("Employee validation failed: \n"
                + "first name cannot be empty or less than 5 characters, \n"
                + "last name cannot be empty or less than 5 characters, \n"
                + "gender can only be 'male' or 'female', \n"
                + "mail cannot be empty or less than 6 characters, \n"
                + "password cannot be empty or less than 8 characters"
            );
        }
        
    }
    
}
