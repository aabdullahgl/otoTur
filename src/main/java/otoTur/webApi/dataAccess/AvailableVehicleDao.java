package otoTur.webApi.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import otoTur.webApi.entities.concretes.AvailableVehicle;

public interface AvailableVehicleDao extends JpaRepository<AvailableVehicle, Integer> {

	@Query("FROM AvailableVehicle where available=:available")
	List<AvailableVehicle> getByAvailableVehicleTrue(String available);

}
