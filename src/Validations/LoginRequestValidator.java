/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import Models.Request.LoginRequest;

/**
 *
 * @author Abnet
 */
public class LoginRequestValidator implements Validation<LoginRequest> {

    @Override
    public void Validate(LoginRequest model) throws Exception {
        
        if(
            (model.Email.isEmpty() || model.Email.length() < 6 || model.Email.length() > 30) ||
            (model.Password.isEmpty() || model.Password.length() < 8 || model.Password.length() > 20)
        ){
            throw new Exception("Login Request validation failed: \n"
                + "Email cannot be empty or less than 6 characters, \n"
                + "password cannot be empty or less than 8 characters"
            );
        }
        
    }
    
}
