package com.moov.Moov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moov.Moov.model.TblFallbackInfo;

public interface FallbackRepo  extends JpaRepository<TblFallbackInfo, Long> {

}
