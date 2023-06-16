package com.moov.Moov.service;

import java.util.List;

import com.moov.Moov.model.TblBilling;

public interface SubService {

	List<TblBilling> findByRecordStatus(int i);

}
