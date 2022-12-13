package otoTur.webApi.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import otoTur.webApi.business.abstracts.LocationsService;
import otoTur.webApi.core.utilities.result.ErrorDataResult;

@RestController
@RequestMapping("/api/ototur")
public class LocationsController {

	private LocationsService locationsService;

	@Autowired
	public LocationsController(LocationsService locationsService) {
		this.locationsService = locationsService;
	}

	@GetMapping("/getAllByPage/locations")
	public ResponseEntity<?> getAll(@Valid @RequestParam int pageNumber, int pageSize) {
		return ResponseEntity.ok(this.locationsService.getAll(pageNumber, pageSize));
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@DateTimeFormat
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
		Map<String, String> validationErrors = new HashMap<String, String>();
		for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, 910, "Validation Errors");
		return errors;
	}
}
