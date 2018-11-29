package com.shereen.springhibernateJPA.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shereen.springhibernateJPA.model.Item;
import com.shereen.springhibernateJPA.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="items", method= RequestMethod.GET)
	ResponseEntity<List<Item>> getItems() {
		return new ResponseEntity<List<Item>>(itemService.getItem(), HttpStatus.OK);
		
	}

}
