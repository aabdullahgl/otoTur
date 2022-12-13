package otoTur.webApi.business.abstracts;

import java.util.List;

import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.entities.concretes.VehicleGroups;

public interface VehicleGroupsService {
	DataResult<List<VehicleGroups>> getAllByPage(int pageNumber, int pageSize);

}
