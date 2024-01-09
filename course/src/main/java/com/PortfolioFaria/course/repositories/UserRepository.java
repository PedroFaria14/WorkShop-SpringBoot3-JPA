package com.PortfolioFaria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PortfolioFaria.course.entities.OrderItem;



public interface UserRepository extends JpaRepository<OrderItem, Long> {

}
