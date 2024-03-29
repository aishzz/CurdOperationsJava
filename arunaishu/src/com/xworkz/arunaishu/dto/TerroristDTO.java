package com.xworkz.arunaishu.dto;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class TerroristDTO extends AbstractAuditDto {
	@NonNull
	@NotBlank
	@NotNull(message = "Terrorist name cannot be null")
	@Size(min = 5, max = 10, message = "Name is Invalid should be more than 3 or less than 10")
	private String name;
	@NotNull(message = "Terrorist age is less than 5 or greather than 60")
	@Min(value = 10, message = "Age should be more than 10 or less than 80")
	@Max(value = 80, message = "Age should be more than 10 or less than 80")
	private int age;
	@NonNull

	@NotNull(message = "Terrorist name cannot be null")
	@Size(min = 1, max = 10, message = "Country is Invalid should be more than 1 or less than 10")
	private String country;
	@NonNull
	@NotNull(message = "Terrorist name cannot be null")
	@Size(min = 2, max = 9, message = "Organization is Invalid should be more than 2 or less than 9")
	private String organization;
	private boolean alive;
	private boolean inPrison;

}
