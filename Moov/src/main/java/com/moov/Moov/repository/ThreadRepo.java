package com.moov.Moov.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moov.Moov.model.ThreadModel;

public interface ThreadRepo  extends JpaRepository<ThreadModel, Long> {

}
