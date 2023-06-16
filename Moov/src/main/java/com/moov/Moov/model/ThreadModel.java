package com.moov.Moov.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_thread_configuration")
public class ThreadModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="circleId")
	private String circleId;
	
	@Column(name="threadno")
	private Integer threadno;
	
	@Column(name="billingtable")
	private String billingtable;

	@Column(name="charginglogic")
	private String charginglogic;
	
	@Column(name="thread_type")
	private String thread_type;
	
	@Column(name="isactive")
	private Integer isactive;
	
	@Column(name="msg_circle")
	private String msg_circle;
	
	@Column(name="fallback")
	private boolean fallBack;
	
	@Column(name="billing_start_time")
	private String billing_start_time;
	
	@Column(name="billing_end_time")
	private String billing_end_time;
	
	@Column(name="sleep_time")
	private Long sleep_time;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public Integer getThreadno() {
		return threadno;
	}

	public void setThreadno(Integer threadno) {
		this.threadno = threadno;
	}

	public String getCharginglogic() {
		return charginglogic;
	}

	public void setCharginglogic(String charginglogic) {
		this.charginglogic = charginglogic;
	}

	public String getThread_type() {
		return thread_type;
	}

	public void setThread_type(String thread_type) {
		this.thread_type = thread_type;
	}

	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}

	public String getMsg_circle() {
		return msg_circle;
	}

	public void setMsg_circle(String msg_circle) {
		this.msg_circle = msg_circle;
	}

	public boolean isFallBack() {
		return fallBack;
	}

	public void setFallBack(boolean fallBack) {
		this.fallBack = fallBack;
	}

	public String getBilling_start_time() {
		return billing_start_time;
	}

	public void setBilling_start_time(String billing_start_time) {
		this.billing_start_time = billing_start_time;
	}

	public String getBilling_end_time() {
		return billing_end_time;
	}

	public void setBilling_end_time(String billing_end_time) {
		this.billing_end_time = billing_end_time;
	}

	public Long getSleep_time() {
		return sleep_time;
	}

	public void setSleep_time(Long sleep_time) {
		this.sleep_time = sleep_time;
	}

	@Override
	public String toString() {
		return "[rowno=" + rowno + ", circleId=" + circleId + ", threadno=" + threadno + ", billingtable="
				+ billingtable + ", charginglogic=" + charginglogic + ", thread_type=" + thread_type + ", isactive="
				+ isactive + ", msg_circle=" + msg_circle + ", fallBack=" + fallBack + ", billing_start_time="
				+ billing_start_time + ", billing_end_time=" + billing_end_time + ", sleep_time=" + sleep_time + "]";
	}

}