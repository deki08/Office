package com.moov.Moov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moov.Moov.model.TblBilling;

public interface BillinfRepo  extends JpaRepository<TblBilling, Long> {

}
