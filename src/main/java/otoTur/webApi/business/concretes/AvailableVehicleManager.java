package otoTur.webApi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import otoTur.webApi.business.abstracts.AvailableVehicleService;
import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.core.utilities.result.SuccessDataResult;
import otoTur.webApi.dataAccess.AvailableVehicleDao;
import otoTur.webApi.entities.concretes.AvailableVehicle;

@Service
public class AvailableVehicleManager implements AvailableVehicleService {

	private AvailableVehicleDao availableVehicleDao;

	@Autowired
	public AvailableVehicleManager(AvailableVehicleDao availableVehicleDao) {
		this.availableVehicleDao = availableVehicleDao;
	}

	@Override
	public DataResult<List<AvailableVehicle>> getAllByPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);

		return new SuccessDataResult<List<AvailableVehicle>>(this.availableVehicleDao.findAll(pageable).getContent(),
				"Data Listelendi");
	}

	@Override
	public DataResult<List<AvailableVehicle>> getByAvailableVehicleTrue(String available) {

		return new SuccessDataResult<List<AvailableVehicle>>(
				this.availableVehicleDao.getByAvailableVehicleTrue(available), "Data Listelendi");
	}

}
