package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.OrderProduct;
import com.app.model.OrderProductPK;



public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}