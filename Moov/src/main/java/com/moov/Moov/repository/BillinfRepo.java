package com.moov.Moov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moov.Moov.model.TblBilling;

public interface BillinfRepo  extends JpaRepository<TblBilling, Long> {

	List<TblBilling> findByRecordstatus(int record);

}
