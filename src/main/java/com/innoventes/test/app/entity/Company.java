package com.innoventes.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company")
@Entity
public class Company extends BaseEntity {

	@Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
	private Long id;

	@Column(name = "company_name")
	@NotEmpty
	@Size(min=5)
	private String companyName;

	@Column(name = "email")
	@NotEmpty
	@Email
	private String email;

	@Column(name = "strength")
	private Integer strength;

	@Column(name = "website_url")
	private String webSiteURL;
	@Column(name= "comapany_code", unique = true)
	@Pattern(regexp = "^[a-zA-Z]{2}\\d{2}[EN]$", message = "Invalid comapany code format")
	private String companyCode;

	public void setName(String name) {
	}

	public void setFoundedYear(int foundYear) {
	}

	public void setEmployeeCount(int employeeCount) {
	}
}
