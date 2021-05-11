package com.example.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hrms.business.abstracts.JobPositionService;
import com.example.Hrms.dataAccess.abstracts.JobPositionDao;
import com.example.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
     private JobPositionDao jobPositionDao;
     
     

     
     
     @Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}









	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();	
		}
     
     
   
}
