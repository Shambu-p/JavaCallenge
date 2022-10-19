/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.ArrayList;

/**
 *
 * @author Abnet
 * @param <T>
 */
public interface Repository<T> {
    
    public T create(T data);
    
    public ArrayList<T> all();
    
    public T find(int id);
    
    public void update(T data) throws Exception;
    
    public void delete(int id);
    
}
