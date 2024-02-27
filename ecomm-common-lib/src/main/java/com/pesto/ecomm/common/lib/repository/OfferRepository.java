package com.pesto.ecomm.common.lib.repository;

import com.pesto.ecomm.common.lib.entity.Offer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

    Page<Offer> findBySeller_UserIdEqualsOrderByProduct(Integer sellerId, Pageable pageable);

    List<Offer> findByProduct_ProductId(Integer productId);

    Offer findBySeller_UserIdAndProduct_ProductId(Integer sellerId, Integer productId);

}
