package otoTur.webApi.core.utilities.result;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

@Getter
public class ErrorDataResult<T> extends DataResult<T> {

	private int code;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	   private LocalDateTime timestamp;

	public ErrorDataResult(T data, int code,String message) {
		super(data, false, message);
		this.code = code;

	}

	public ErrorDataResult(T data) {
		super(data, false);

	}

}   
 