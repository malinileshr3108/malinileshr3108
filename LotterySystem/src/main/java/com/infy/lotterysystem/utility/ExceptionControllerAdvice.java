package com.infy.lotterysystem.utility;

import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.infy.lotterysystem.exception.LotteryBookingException;



public class ExceptionControllerAdvice {


	private static final Log LOGGER = LogFactory.getLog(ExceptionControllerAdvice.class);
	
	private Environment environment;
   // add appropriate annotation
   public ResponseEntity<ErrorInfo> lotteryBookingExceptionHandler(LotteryBookingException exception)
   {
	LOGGER.error(exception.getMessage(), exception);
	ErrorInfo errorInfo = new ErrorInfo();
	errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
	errorInfo.setErrorMessage(environment.getProperty(exception.getMessage()));
	return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
   }
   // add appropriate annotation
   public ResponseEntity<ErrorInfo> generalExceptionHandler(Exception exception)
   {
	LOGGER.error(exception.getMessage(), exception);
	ErrorInfo errorInfo = new ErrorInfo();
	errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
	errorInfo.setErrorMessage(environment.getProperty("General.EXCEPTION_MESSAGE"));
	return new ResponseEntity<>(errorInfo,
				    HttpStatus.INTERNAL_SERVER_ERROR);
   }
   // add appropriate annotation
   public ResponseEntity<ErrorInfo> validatorExceptionHandler(Exception exception)
   {
	LOGGER.error(exception.getMessage(), exception);
	String errorMsg;
	if (exception instanceof MethodArgumentNotValidException)
	{
	    MethodArgumentNotValidException manvException = (MethodArgumentNotValidException) exception;
	    errorMsg = manvException.getBindingResult()
				    .getAllErrors()
				    .stream()
				    .map(ObjectError::getDefaultMessage)
				    .collect(Collectors.joining(", "));

	}
	else
	{
	    ConstraintViolationException cvException = (ConstraintViolationException) exception;
	    errorMsg = cvException.getConstraintViolations()
				  .stream()
				  .map(ConstraintViolation::getMessage)
				  .collect(Collectors.joining(", "));

	}
	ErrorInfo errorInfo = new ErrorInfo();
	errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
	errorInfo.setErrorMessage(errorMsg);
	return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
   }
}
