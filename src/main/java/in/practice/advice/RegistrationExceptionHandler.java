package in.practice.advice;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RegistrationExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
		List<FieldError> fieldError = methodArgumentNotValidException.getBindingResult().getFieldErrors();
		ErrorResponse errorResponse= ErrorResponse.builder()
				                     .erroeMessage(methodArgumentNotValidException.getMessage())
				                     .developerMessage(fieldError.get(0).getDefaultMessage())
				                     .build();
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_GATEWAY);
		
	}
}
