/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import Repository.EmployeesRepository;

/**
 *
 * @author Abnet
 */
public class Challenge {
    
    public static EmployeesRepository employee_repo = new EmployeesRepository();
    
    public static LoginComponent login = new LoginComponent();
    public static RegistrationComponent register = new RegistrationComponent();
    public static EmployeeListComponent lister = new EmployeeListComponent();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        openLoginPage();
    }
    
    public static void openRegistrationPage(){
        login.setVisible(false);
        lister.setVisible(false);
        register.setVisible(true);
    }
    
    public static void openListPage(){
        
        login.setVisible(false);
        register.setVisible(false);
        
        lister.initializeList();
        lister.setVisible(true);
        
    }
    
    public static void openLoginPage(){
        lister.setVisible(false);
        register.setVisible(false);
        login.setVisible(true);
    }
    
}
