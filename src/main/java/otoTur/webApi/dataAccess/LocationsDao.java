package otoTur.webApi.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import otoTur.webApi.entities.concretes.Location;

public interface LocationsDao extends JpaRepository<Location, Integer>{

}
