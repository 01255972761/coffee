package com.coffeeshopmanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coffeeshopmanagement.Entity.Bill;
@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {
	@Query("select b from Bill b where b.idCustomer=?1")
	List<Bill> findByCustomer(int id);
}
