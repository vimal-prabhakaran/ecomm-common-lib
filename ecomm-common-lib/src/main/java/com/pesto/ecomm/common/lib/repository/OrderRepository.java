package com.pesto.ecomm.common.lib.repository;

import com.pesto.ecomm.common.lib.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Page<Order> findByBuyer_UserId(Integer buyerId, Pageable pageable);

}
