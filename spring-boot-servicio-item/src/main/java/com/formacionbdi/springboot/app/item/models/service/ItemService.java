package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;

public interface ItemService {
	
	//Metodos para listar todos los items
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);

}
