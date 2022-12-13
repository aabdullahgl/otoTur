package otoTur.webApi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import otoTur.webApi.business.abstracts.AvailableVehicleService;
import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.entities.concretes.AvailableVehicle;

@RestController
@RequestMapping("/api/otoTur")
public class AvailableVehiclesController {

	private AvailableVehicleService availableVehicleService;

	@Autowired
	public AvailableVehiclesController(AvailableVehicleService availableVehicleService) {
		this.availableVehicleService = availableVehicleService;
	}

	@GetMapping("/vehicleAvailableTrue")
	public DataResult<List<AvailableVehicle>> getAll() {
		return this.availableVehicleService.getByAvailableVehicleTrue("aktif");
	}
	
	@GetMapping("/getAllByPage/vehicleAvailable")
	public  DataResult<List<AvailableVehicle>> getAllByPage(@RequestParam int pageNumber,int pageSize){
		return this.availableVehicleService.getAllByPage(pageNumber, pageSize);
	}
}
