package com.moov.Moov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moov.Moov.model.TblProduct;

public interface ProductRepo  extends JpaRepository<TblProduct, Long> {

}
