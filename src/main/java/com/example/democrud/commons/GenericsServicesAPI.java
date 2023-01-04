/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.democrud.commons;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Adri
 */
public interface GenericsServicesAPI<T, ID  extends Serializable> {

    
	T save(T entity);
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
}
