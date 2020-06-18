package com.example.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "ASIGNMENTS")
public class Asignment {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@ManyToOne
	@MapsId("emp_id")
	@JoinColumn(name = "emp_id")
	Employee employee;

	@ManyToOne
	@MapsId("job_type_id")
	@JoinColumn(name = "job_type_id")
	JobType jobType;

	private String title;

	private String description;

	private LocalDate startDate;

	private String stopDate;

}
