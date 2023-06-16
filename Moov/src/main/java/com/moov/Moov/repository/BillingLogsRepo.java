package com.moov.Moov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moov.Moov.model.TblBillingLogs;

public interface BillingLogsRepo extends JpaRepository<TblBillingLogs, Long>  {

}
