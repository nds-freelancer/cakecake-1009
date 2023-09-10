package net.user.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.user.entity.OrderCa;
import net.user.repository.OrderRepository;
import net.user.service.OrderCakeService;

@Service
@AllArgsConstructor
public class OrderCakeServiceImpl implements OrderCakeService {

    private OrderRepository orderRepository;

	@Override
	public OrderCa updateOrderCake(OrderCa orderCake) {
		System.out.println("OrderCake:"+orderRepository+orderCake.getCakeid()+":"+orderCake.getCakeid()+orderCake.getOrderid()+":");
//		OrderCa oc = new OrderCa();
//		oc.setOrderid(11);
//		oc.setCakeid(12121);
//		oc.setDateCreate("12/12/1222");
		
		OrderCa updatedOrderCake = orderRepository.saveAndFlush(orderCake);
        return orderCake;
	}

}
