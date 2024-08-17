package in.practice.advice;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorResponse {

	private String erroeMessage;
	private String developerMessage;
	private LocalDate timeStamp;
	private String exceptionDetails;
}
