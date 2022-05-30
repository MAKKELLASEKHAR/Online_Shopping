package com.cg.onlineshopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshopping.entities.Item;
import com.cg.onlineshopping.service.ItemServiceImpl;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	ItemServiceImpl service;
	
	@PostMapping("/additem")
	public ResponseEntity<String> addItem(@RequestBody Item item){
		service.addItem(item);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
		
	}
	@GetMapping("/item")
	public ResponseEntity<List<Item>> getAllItem(){
		List<Item> itemlist = service.viewAllItem();
		return new ResponseEntity<List<Item>>(itemlist,HttpStatus.OK);
		
	}
	@GetMapping("/item/{itemId}")
	public ResponseEntity<Optional<Item>> getItemById(@PathVariable int item_id){
		Optional<Item> itemdetails = service.getItemById(item_id);
		return new ResponseEntity<Optional<Item>>(itemdetails,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> editItem(@RequestBody Item item){
		service.updateItem(item);
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{itemId}")
	public ResponseEntity<String> deleteDepartment(@PathVariable int item_id){
		service.deleteItem(item_id);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
}
