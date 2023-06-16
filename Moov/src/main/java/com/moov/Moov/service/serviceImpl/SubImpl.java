package com.moov.Moov.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moov.Moov.model.TblBilling;
import com.moov.Moov.repository.BillinfRepo;
import com.moov.Moov.service.SubService;

@Service
public class SubImpl implements SubService {

	@Autowired
	private BillinfRepo billinfRepo;

	@Override
	public List<TblBilling> findByRecordStatus(int record) {
		// TODO Auto-generated method stub
		return billinfRepo.findByRecordstatus(record);
	}

}
