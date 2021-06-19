package com.lottery.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lottery.entity.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer> {

	@Query(value = "select slots from Slot slots where slots.slotDate >= ?1 order by slots.slotDate asc")
	public List<Slot> findByDate(Date slotDate);
}
