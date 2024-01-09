package com.PortfolioFaria.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PortfolioFaria.course.entities.User;



public interface OrderRepository extends JpaRepository<User, Long> {

}
