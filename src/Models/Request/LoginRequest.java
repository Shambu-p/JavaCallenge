/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Request;

/**
 *
 * @author Abnet
 */
public class LoginRequest {
    
    public String Email;
    public String Password;
    
    public LoginRequest(String email, String password){
        Email = email;
        Password = password;
    }
}
