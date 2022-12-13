package otoTur.webApi.business.abstracts;

import java.util.List;

import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.entities.concretes.Location;

public interface LocationsService {
	DataResult<List<Location>> getAll(int pageNumber,int pageSize);
}
