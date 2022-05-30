package com.cg.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cg.onlineshopping.entities.Item;

public interface ItemRepository  extends JpaRepository<Item,Long>{
	
	@Query(value="select item from Item item where item.item_id=?1")
	Item getItemById(long Item_id);

}



