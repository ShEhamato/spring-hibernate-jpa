package com.shereen.springhibernateJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shereen.springhibernateJPA.model.Item;
import com.shereen.springhibernateJPA.dao.ItemDao;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired 
	ItemDao itemDao;

	@Transactional
	@Override
	public void addItem(Item item) {
		itemDao.save(item);

	}

	@Transactional
	@Override
	public void updateItem(Item item) {
		itemDao.save(item);

	}
	@Transactional
	@Override
	public void removeItem(int id) {

	}

	@Transactional
	@Override
	public Item getItemById(int id) {
		// TODO Auto-generated method stub
		return itemDao.findById(id).get();
	}

	@Transactional
	@Override
	public List<Item> getItem() {
		// TODO Auto-generated method stub
		return itemDao.findAll();
	}

}
