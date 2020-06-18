package com.example.domain;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "EMPLOYEINFOS")
public class EmployeeInfo {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	private LocalDate joinDate;

	private String salary;

	private String homeAdreess;

	private String title;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID")
	private Set<Employee> employes;

}
