package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AsignmentKey implements Serializable {

	@Column(name = "emp_id")
	Long employeeId;

	@Column(name = "job_type_id")
	Long jobTypeId;
}
