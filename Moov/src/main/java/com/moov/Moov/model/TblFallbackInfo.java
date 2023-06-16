package com.moov.Moov.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_fallback_info")
public class TblFallbackInfo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="pack_type")
	private String pack_type;
	
	@Column(name="total_amount")
	private Integer total_amount;
	
	@Column(name="fallback_amount")
	private Float fallback_amount;
	
	@Column(name="validity")
	private Integer validity;
	
	@Column(name="charging_pack_code")
	private String charging_pack_code;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getPack_type() {
		return pack_type;
	}

	public void setPack_type(String pack_type) {
		this.pack_type = pack_type;
	}

	public Integer getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

	public Float getFallback_amount() {
		return fallback_amount;
	}

	public void setFallback_amount(Float fallback_amount) {
		this.fallback_amount = fallback_amount;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public String getCharging_pack_code() {
		return charging_pack_code;
	}

	public void setCharging_pack_code(String charging_pack_code) {
		this.charging_pack_code = charging_pack_code;
	}

	@Override
	public String toString() {
		return "TblFallbackInfo [rowno=" + rowno + ", pack_type=" + pack_type + ", total_amount=" + total_amount
				+ ", fallback_amount=" + fallback_amount + ", validity=" + validity + ", charging_pack_code="
				+ charging_pack_code + "]";
	}
		
}
