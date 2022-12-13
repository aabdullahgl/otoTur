package otoTur.webApi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import otoTur.webApi.business.abstracts.VehicleGroupsService;
import otoTur.webApi.core.utilities.result.DataResult;
import otoTur.webApi.core.utilities.result.SuccessDataResult;
import otoTur.webApi.dataAccess.VehicleGroupsDao;
import otoTur.webApi.entities.concretes.VehicleGroups;

@Service
public class VehicleGroupsManager implements VehicleGroupsService {

	private VehicleGroupsDao vehicleGroupsDao;

	@Autowired
	public VehicleGroupsManager(VehicleGroupsDao vehicleGroupsDao) {
		this.vehicleGroupsDao = vehicleGroupsDao;
	}

	@Override
	public DataResult<List<VehicleGroups>> getAllByPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
		return new SuccessDataResult<List<VehicleGroups>>(this.vehicleGroupsDao.findAll(pageable).getContent(),
				"Data Listelendi");
	}

}
