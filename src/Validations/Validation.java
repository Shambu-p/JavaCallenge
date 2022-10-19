/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

/**
 *
 * @author Abnet
 * @param <T>
 */
public interface Validation<T> {
    
    public void Validate(T model) throws Exception;
    
}
