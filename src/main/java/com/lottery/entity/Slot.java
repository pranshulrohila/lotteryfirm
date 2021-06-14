package com.lottery.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "SLOT", schema = "LOTTERYFIRM")
public class Slot implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SlotIdGenerator")
	@SequenceGenerator(name = "SlotIdGenerator", sequenceName = "SEQ_SLOT_ID", allocationSize = 1)
	@Column(name = "SLOT_ID")
	private Integer slotId;

	@Column(name = "SLOT_DATE")
	@Temporal(value = TemporalType.DATE)
	private Date slotDate;

	@Column(name = "AVAILABLE_FLG")
	private Integer availableFlg;

	@Column(name = "ACTIVE_FLG")
	private Integer activeFlg;

	@Column(name = "UPDATED_DT")
	private Date updatedDt;

	@Version
	@Column(name = "SLOT_VERSION")
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

	public Date getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public Integer getSlotVersion() {
		return slotVersion;
	}

	public void setSlotVersion(Integer slotVersion) {
		this.slotVersion = slotVersion;
	}

}
