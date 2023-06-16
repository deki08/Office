package com.moov.Moov.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_product_info")
public class TblProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rowno")
	private Integer rowno;

	@Column(name = "product_id")
	private String product_id;

	@Column(name = "price")
	private String price;

	@Column(name = "validity")
	private Integer validity;

	@Column(name = "fallback")
	private boolean fallback;
	
	@Column(name = "fallback_amount")
	private String fallback_amount;

	@Column(name = "product_code")
	private String product_code;

	@Column(name = "sub_charge_message")
	private String sub_charge_message;
	
	@Column(name = "ren_charge_message")
	private String ren_charge_message;

	@Column(name = "low_balance_message")
	private String low_balance_message;

	@Column(name = "message_send_days")
	private Integer message_send_days;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	
	public boolean isFallback() {
		return fallback;
	}

	public void setFallback(boolean fallback) {
		this.fallback = fallback;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	
	public String getLow_balance_message() {
		return low_balance_message;
	}

	public void setLow_balance_message(String low_balance_message) {
		this.low_balance_message = low_balance_message;
	}

	public Integer getMessage_send_days() {
		return message_send_days;
	}

	public void setMessage_send_days(Integer message_send_days) {
		this.message_send_days = message_send_days;
	}

	public String getFallback_amount() {
		return fallback_amount;
	}

	public void setFallback_amount(String fallback_amount) {
		this.fallback_amount = fallback_amount;
	}

	public String getSub_charge_message() {
		return sub_charge_message;
	}

	public void setSub_charge_message(String sub_charge_message) {
		this.sub_charge_message = sub_charge_message;
	}

	public String getRen_charge_message() {
		return ren_charge_message;
	}

	public void setRen_charge_message(String ren_charge_message) {
		this.ren_charge_message = ren_charge_message;
	}

	@Override
	public String toString() {
		return "[rowno=" + rowno + ", product_id=" + product_id + ", price=" + price + ", validity="
				+ validity + ", fallback=" + fallback + ", fallback_amount=" + fallback_amount + ", product_code="
				+ product_code + ", sub_charge_message=" + sub_charge_message + ", ren_charge_message="
				+ ren_charge_message + ", low_balance_message=" + low_balance_message + ", message_send_days="
				+ message_send_days + "]";
	}

}