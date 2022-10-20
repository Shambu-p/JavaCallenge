/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Models.Entity.EmployeesModel;
import Models.Request.LoginRequest;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Abnet Kebede
 */
public class EmployeesRepository implements Repository<EmployeesModel> {
    
    public static ArrayList<EmployeesModel> db = new ArrayList<EmployeesModel>();
    private static int current_id = 0;
    
    @Override
    public EmployeesModel create(EmployeesModel data) {
        current_id += 1;
        data.id = current_id;
        db.add(data);
        return data;
    }

    @Override
    public ArrayList<EmployeesModel> all() {
        return db;
    }

    @Override
    public EmployeesModel find(int id) {
        
        Iterator<EmployeesModel> i = db.iterator();
        EmployeesModel temp;
        while(i.hasNext()){
            temp = i.next();
            if(temp.id == id){
                return temp;
            }
        }
        
        return null;
        
    }
    
    public EmployeesModel byEmailAndPassword(LoginRequest req){
        
        Iterator<EmployeesModel> i = db.iterator();
        EmployeesModel temp;
        while(i.hasNext()){
            temp = i.next();
            if(temp.email.equals(req.Email) && temp.password.equals(req.Password)) {
                return temp;
            }
        }
        
        return null;
        
    }

    /**
     *
     * @param data
     * @throws Exception
     */
    @Override
    public void update(EmployeesModel data) throws Exception {
        
        EmployeesModel emp = this.find(data.id);
        
        if(emp == null){
            throw new Exception("Employee not found!");
        }
        
        db = filter(data.id);
        db.add(data);

    }

    @Override
    public void delete(int id) {
        db = this.filter(id);
    }
    
    private ArrayList<EmployeesModel> filter(int id){
        
        ArrayList<EmployeesModel> temp_array = new ArrayList<>();
        Iterator<EmployeesModel> i = db.iterator();
        EmployeesModel temp;
        while(i.hasNext()){
            temp = i.next();
            if(temp.id != id){
                temp_array.add(temp);
            }
        }
        
        return temp_array;
        
    }
}
