package otoTur.webApi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import otoTur.webApi.business.abstracts.LocationsService;
import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.core.utilities.result.SuccessDataResult;
import otoTur.webApi.dataAccess.LocationsDao;
import otoTur.webApi.entities.concretes.Location;

@Service
public class LocationManager implements LocationsService {

	private LocationsDao locationsDao;

	@Autowired
	public LocationManager(LocationsDao locationsDao) {
		this.locationsDao = locationsDao;
	}

	@Override
	public DataResult<List<Location>> getAll(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
		return new SuccessDataResult<List<Location>>(this.locationsDao.findAll(pageable).getContent(),
				"Data Listelendi");
	}

}
