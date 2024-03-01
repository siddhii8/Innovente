package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

    @NotEmpty
    @Size(min=5)
	private String companyName;

	@NotEmpty
	@Email
	private String email;

	@PositiveOrZero
	@EvenNumberOrZero
	private Integer strength;

	private String webSiteURL;
	@Pattern(regexp = "^[a-zA-Z]{2}\\d{2}[EN]$", message = "Invalid company code format")
	private String companyCode;


}
