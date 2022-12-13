package otoTur.webApi.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import otoTur.webApi.entities.concretes.VehicleGroups;

public interface VehicleGroupsDao extends JpaRepository<VehicleGroups, Integer> {

}
