package com.dipak.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Username must be minimum 4 character ")
	private String name;

	@Email(message = "Email address is not valid !")
	private String email;

	@NotNull
	@Size(min = 3, max = 10, message= "password must be minimum of 3 character and maximum of 10 character")
	
	private String password;

	@NotNull
	private String about;
}
