package com.lottery.model;

import java.io.Serializable;
import java.util.Date;

public class SlotTo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer slotId;
	private Date slotDate;
	private Integer availableFlg;
	private Integer activeFlg;
	private Integer slotVersion;

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	public Date getSlotDate() {
		return slotDate;
	}

	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}

	public Integer getAvailableFlg() {
		return availableFlg;
	}

	public void setAvailableFlg(Integer availableFlg) {
		this.availableFlg = availableFlg;
	}

	public Integer getActiveFlg() {
		return activeFlg;
	}

	public void setActiveFlg(Integer activeFlg) {
		this.activeFlg = activeFlg;
	}

	public Integer getSlotVersion() {
		return slotVersion;
	}

	public void setSlotVersion(Integer slotVersion) {
		this.slotVersion = slotVersion;
	}

}
