package com.coffeeshopmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeeshopmanagement.Entity.BillDetail;
@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, Integer> {

}
