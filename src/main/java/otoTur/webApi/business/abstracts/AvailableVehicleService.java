package otoTur.webApi.business.abstracts;

import java.util.List;

import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.entities.concretes.AvailableVehicle;

public interface AvailableVehicleService {
	DataResult<List<AvailableVehicle>> getAllByPage(int pageNumber,int pageSize);
	
	DataResult<List<AvailableVehicle>> getByAvailableVehicleTrue(String available);
	
}
