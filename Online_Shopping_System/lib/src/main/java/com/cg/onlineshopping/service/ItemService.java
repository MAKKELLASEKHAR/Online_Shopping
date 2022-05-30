package com.cg.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlineshopping.entities.Item;

public interface ItemService {
  
	
	void addItem(Item item);
	List<Item> viewAllItem();
	Optional<Item> getItemById(long item_id);
	void updateItem(Item item);
	void deleteItem(long item_id);
}
