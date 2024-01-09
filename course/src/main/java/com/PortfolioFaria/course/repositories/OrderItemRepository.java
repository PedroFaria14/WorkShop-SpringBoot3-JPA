package com.PortfolioFaria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PortfolioFaria.course.entities.Order;



public interface OrderItemRepository extends JpaRepository<Order, Long> {

}
