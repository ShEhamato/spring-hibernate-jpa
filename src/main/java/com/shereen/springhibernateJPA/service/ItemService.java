package com.shereen.springhibernateJPA.service;

import java.util.List;

import com.shereen.springhibernateJPA.model.Item;

public interface ItemService {
	void addItem(Item item);
	void updateItem(Item item);
	void removeItem(int id);
	Item getItemById(int id);
	List<Item>getItem();

}
