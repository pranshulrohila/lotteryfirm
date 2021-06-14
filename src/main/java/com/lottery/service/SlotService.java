package com.lottery.service;

import java.util.ArrayList;
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

	public List<SlotTo> findAllSlot() {
		return convertEntitToModel(slotRepository.findAll());
	}

	private List<SlotTo> convertEntitToModel(List<Slot> slotEntityList) {
		List<SlotTo> slotToList = new ArrayList<>();
		slotEntityList.forEach(s -> {
			SlotTo slotTo = new SlotTo();
			slotTo.setActiveFlg(s.getActiveFlg());
			slotTo.setAvailableFlg(s.getAvailableFlg());
			slotTo.setSlotDate(s.getSlotDate());
			slotTo.setSlotId(s.getSlotId());
			slotTo.setSlotVersion(s.getSlotVersion());
			slotToList.add(slotTo);
		});
		return slotToList;
	}

}
