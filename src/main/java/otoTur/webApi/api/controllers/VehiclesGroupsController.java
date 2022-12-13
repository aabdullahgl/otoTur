package otoTur.webApi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import otoTur.webApi.business.abstracts.VehicleGroupsService;
import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.entities.concretes.VehicleGroups;

@RestController
@RequestMapping("/api/otoTur")
public class VehiclesGroupsController {

	private VehicleGroupsService vehicleGroupsService;

	@Autowired
	public VehiclesGroupsController(VehicleGroupsService vehicleGroupsService) {
		this.vehicleGroupsService = vehicleGroupsService;
	}

	@GetMapping("/getAllByPage/vehicleGroups")
	public DataResult<List<VehicleGroups>> getAllByPage(@RequestParam int pageNumber, int pageSize) {
		return this.vehicleGroupsService.getAllByPage(pageNumber, pageSize);
	}

}
