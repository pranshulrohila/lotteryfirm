package com.lottery.service;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.entity.Slot;
import com.lottery.model.SlotTo;
import com.lottery.repository.SlotRepository;

@Service
public class SlotService {

	@Autowired
	private SlotRepository slotRepository;

	public SlotTo findNextSlot() {
		Date todayDate = Calendar.getInstance().getTime();
		return convertEntitToModel(slotRepository.findByDate(todayDate), todayDate);
	}

	private SlotTo convertEntitToModel(List<Slot> slotEntityList, Date date) {
		Comparator<Slot> comparator = Comparator.comparing(Slot::getSlotDate);
		Slot slotEntity = slotEntityList.stream().min(comparator).get();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date);
		cal2.setTime(slotEntity.getSlotDate());
		boolean sameDay = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
				&& cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
		if (sameDay) {
			slotEntityList.remove(slotEntity);
			slotEntity = slotEntityList.stream().min(comparator).get();
		}
		SlotTo slotTo = new SlotTo();
		slotTo.setActiveFlg(slotEntity.getActiveFlg());
		slotTo.setAvailableFlg(slotEntity.getAvailableFlg());
		slotTo.setSlotDate(slotEntity.getSlotDate());
		slotTo.setSlotId(slotEntity.getSlotId());
		slotTo.setSlotVersion(slotEntity.getSlotVersion());
		return slotTo;
	}

}
