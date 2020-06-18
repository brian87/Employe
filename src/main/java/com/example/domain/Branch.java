package com.example.domain;

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
@Table(name = "BRANCHES")
public class Branch {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	private String name;

	private String country;

	private String state;

	private String city;

	private String street;

	private String zip;

	private String phone;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "BRANCH_ID")
	private Set<Employee> employes;

}
