package com.cg.onlineshopping.service;

import java.util.List;
import com.cg.onlineshopping.dto.ItemDto;

public interface ItemService {
  
	
	int addItem(ItemDto itemdto);
	List<ItemDto> viewAllItems();
	ItemDto getItemById(int item_id);
	void deleteItem(int item_id);
}
