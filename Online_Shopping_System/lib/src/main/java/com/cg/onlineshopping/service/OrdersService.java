package com.cg.onlineshopping.service;

import java.util.List;

import com.cg.onlineshopping.dto.OrdersDto;

public interface OrdersService {
	
	int addOrders(OrdersDto ordersdto);
	List<OrdersDto> viewAllOrders();
	OrdersDto getOrdersById(int order_id);
	void deleteOrders(int order_id);

}
