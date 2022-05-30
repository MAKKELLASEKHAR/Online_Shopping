package com.cg.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshopping.entities.Item;
import com.cg.onlineshopping.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	ItemRepository itemrepo;
	@Override
	public void addItem(Item item) {
		Optional<Item> addingitem = itemrepo.findById(item.getItem_id());
		System.out.println(addingitem);
		itemrepo.save(item);
	}
	@Override
	public List<Item> viewAllItem() {
		
		return itemrepo.findAll();
	}
	
	@Override
	public Optional<Item> getItemById(long item_id) {
		Optional<Item> itemdetails = itemrepo.findById(item_id);
		
		return itemdetails;
	}
	@Override
	public void updateItem(Item item) {
		itemrepo.save(item);
		
	}
	@Override
	public void deleteItem(long item_id) {
		itemrepo.deleteById(item_id);
		
}
}
