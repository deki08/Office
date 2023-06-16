package com.moov.Moov.Scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moov.Moov.model.TblBilling;
import com.moov.Moov.service.SubService;

@Component
public class ThreadScheduler extends Thread {

	@Autowired
	private SubService service;

	public void subThread() {
		List<TblBilling> bilList = service.findByRecordStatus(0);
		if (bilList != null) {
			for (TblBilling e : bilList) {
				System.out.println(e.getAni());
			}
			
			
			
			
			
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Thread Going to Start");
			subThread();
		}
	}
}
