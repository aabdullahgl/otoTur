package otoTur.webApi.entities.concretes;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ExtraService {

	@Id
	private int id;

	private String name;

	private String sellType;

	private boolean isAssurance;
}
