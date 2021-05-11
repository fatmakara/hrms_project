package com.example.Hrms.business.abstracts;

import java.util.List;

import com.example.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();

}
