package com.moov.Moov.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tbl_billing")
public class TblBilling {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rowno")
	private Long rowno;

	@Column(name = "ani")
	private String ani;

	@Column(name = "total_amount")
	private String total_amount;

	@Column(name = "deducted_amount")
	private String deducted_amount;

	@Column(name = "user_balance")
	private String user_balance;

	@Column(name = "isprepaid")
	private String isprepaid;

	@Column(name = "datetime")
	private Date datetime;

	@Column(name = "recordstatus")
	private Integer recordstatus;

	@Column(name = "errordesc")
	private String errordesc;

	@Column(name = "circleid")
	private String circleid;

	@Column(name = "type_event")
	private String type_event;

	@Column(name = "is_emm")
	private String is_emm;

	@Column(name = "mode")
	private String mode;

	@Column(name = "process_datetime")
	private Date process_datetime;

	@Column(name = "src")
	private String src;

	@Column(name = "noofattempt")
	private Integer noofattempt;

	@Column(name = "servicename")
	private String serviceName;

	@Column(name = "previous_process_date")
	private Date previous_process_date;

	@Column(name = "sysresponse")
	private String sysresponse;
	
	@Column(name = "error_reason")
	private String error_reason;

	@Column(name = "dailycounter")
	private Integer dailycounter;

	@Column(name = "monthlycounter")
	private Integer monthlycounter;

	@Column(name = "SubscriberUID")
	private String subscriber_id;

	@Column(name = "subscription_time")
	private Date subscription_time;
	
	@Column(name = "sub_consent")
	private String sub_consent;

	@Transient
	private Integer dbTransType;

	@Transient
	private boolean transType;

	@Transient
	private Integer dbTransState;

	@Transient
	private String charging_sms;

	@Transient
	private String low_balance_sms;

	@Transient
	private Integer validity;

	@Transient
	private String response;

	@Transient
	private String subid_response;

	@Transient
	private String subid_response_desc;

	@Transient
	private Integer message_send_days;

	public Long getRowno() {
		return rowno;
	}

	public void setRowno(Long rowno) {
		this.rowno = rowno;
	}

	public String getAni() {
		return ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getDeducted_amount() {
		return deducted_amount;
	}

	public void setDeducted_amount(String deducted_amount) {
		this.deducted_amount = deducted_amount;
	}

	public String getUser_balance() {
		return user_balance;
	}

	public void setUser_balance(String user_balance) {
		this.user_balance = user_balance;
	}

	public String getIsprepaid() {
		return isprepaid;
	}

	public void setIsprepaid(String isprepaid) {
		this.isprepaid = isprepaid;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Integer getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(Integer recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getErrordesc() {
		return errordesc;
	}

	public void setErrordesc(String errordesc) {
		this.errordesc = errordesc;
	}

	public String getCircleid() {
		return circleid;
	}

	public void setCircleid(String circleid) {
		this.circleid = circleid;
	}

	public String getType_event() {
		return type_event;
	}

	public void setType_event(String type_event) {
		this.type_event = type_event;
	}

	public String getIs_emm() {
		return is_emm;
	}

	public void setIs_emm(String is_emm) {
		this.is_emm = is_emm;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Date getProcess_datetime() {
		return process_datetime;
	}

	public void setProcess_datetime(Date process_datetime) {
		this.process_datetime = process_datetime;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getNoofattempt() {
		return noofattempt;
	}

	public void setNoofattempt(Integer noofattempt) {
		this.noofattempt = noofattempt;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Date getPrevious_process_date() {
		return previous_process_date;
	}

	public void setPrevious_process_date(Date previous_process_date) {
		this.previous_process_date = previous_process_date;
	}

	public String getSysresponse() {
		return sysresponse;
	}

	public void setSysresponse(String sysresponse) {
		this.sysresponse = sysresponse;
	}

	public Integer getDailycounter() {
		return dailycounter;
	}

	public void setDailycounter(Integer dailycounter) {
		this.dailycounter = dailycounter;
	}

	public Integer getMonthlycounter() {
		return monthlycounter;
	}

	public void setMonthlycounter(Integer monthlycounter) {
		this.monthlycounter = monthlycounter;
	}

	public Integer getDbTransType() {
		return dbTransType;
	}

	public void setDbTransType(Integer dbTransType) {
		this.dbTransType = dbTransType;
	}

	public boolean getTransType() {
		return transType;
	}

	public void setTransType(boolean transType) {
		this.transType = transType;
	}

	public Integer getDbTransState() {
		return dbTransState;
	}

	public void setDbTransState(Integer dbTransState) {
		this.dbTransState = dbTransState;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public String getCharging_sms() {
		return charging_sms;
	}

	public void setCharging_sms(String charging_sms) {
		this.charging_sms = charging_sms;
	}

	public String getLow_balance_sms() {
		return low_balance_sms;
	}

	public void setLow_balance_sms(String low_balance_sms) {
		this.low_balance_sms = low_balance_sms;
	}

	public Integer getMessage_send_days() {
		return message_send_days;
	}

	public void setMessage_send_days(Integer message_send_days) {
		this.message_send_days = message_send_days;
	}

	public String getSubscriber_id() {
		return subscriber_id;
	}

	public void setSubscriber_id(String subscriber_id) {
		this.subscriber_id = subscriber_id;
	}

	public Date getSubscription_time() {
		return subscription_time;
	}

	public void setSubscription_time(Date subscription_time) {
		this.subscription_time = subscription_time;
	}

	public String getError_reason() {
		return error_reason;
	}

	public void setError_reason(String error_reason) {
		this.error_reason = error_reason;
	}

	public String getSubid_response() {
		return subid_response;
	}

	public void setSubid_response(String subid_response) {
		this.subid_response = subid_response;
	}

	public String getSubid_response_desc() {
		return subid_response_desc;
	}

	public void setSubid_response_desc(String subid_response_desc) {
		this.subid_response_desc = subid_response_desc;
	}

	public String getSub_consent() {
		return sub_consent;
	}

	public void setSub_consent(String sub_consent) {
		this.sub_consent = sub_consent;
	}

	@Override
	public String toString() {
		return "[rowno=" + rowno + ", ani=" + ani + ", total_amount=" + total_amount + ", deducted_amount="
				+ deducted_amount + ", user_balance=" + user_balance + ", isprepaid=" + isprepaid + ", datetime="
				+ datetime + ", recordstatus=" + recordstatus + ", errordesc=" + errordesc + ", circleid=" + circleid
				+ ", type_event=" + type_event + ", is_emm=" + is_emm + ", mode=" + mode + ", process_datetime="
				+ process_datetime + ", src=" + src + ", noofattempt=" + noofattempt + ", serviceName=" + serviceName
				+ ", previous_process_date=" + previous_process_date + ", sysresponse=" + sysresponse
				+ ", error_reason=" + error_reason + ", dailycounter=" + dailycounter + ", monthlycounter="
				+ monthlycounter + ", subscriber_id=" + subscriber_id + ", subscription_time=" + subscription_time
				+ ", sub_consent=" + sub_consent + ", dbTransType=" + dbTransType + ", transType=" + transType
				+ ", dbTransState=" + dbTransState + ", charging_sms=" + charging_sms + ", low_balance_sms="
				+ low_balance_sms + ", validity=" + validity + ", response=" + response + ", subid_response="
				+ subid_response + ", subid_response_desc=" + subid_response_desc + ", message_send_days="
				+ message_send_days + "]";
	}

}