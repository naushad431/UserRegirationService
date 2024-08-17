/**
 * 
 */
package in.practice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

	@NotNull
	public String firstName;
	@NotNull
	public String lastName;
	@NotNull
	public String email;
	@NotNull
	public String mobileNumber;
	
}
