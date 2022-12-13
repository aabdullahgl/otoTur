package otoTur.webApi.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kolaycar_araclar")
public class VehicleGroups {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "index_kolaycar_araclar")
	private int id;

	@Column(name = "VEHICLENAME")
	private String name;

	@Column(name = "SIPPCODE")
	private String sipp;

	@Column(name = "VENDORMINDRIVERAGE")
	private int minDriverAge;

	@Column(name = "VENDORMINDRIVINGLICENSEAGE")
	private int minLicanseYear;

	@Column(name = "PASSENGERQUANTITY")
	private int passenger;

	private double blockedAmount;

	private int creditCardCount;
}
