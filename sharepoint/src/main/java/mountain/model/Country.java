package mountain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	@Id
	@Column (nullable = false)
	private String code;
	@Column (nullable = false)
	private String name;
	@Column (nullable = false)
	private String continent;
	@Column (nullable = false)
	private String region;
	@Column (nullable = false)
	private Float surfaceArea;
	@Column(nullable = true)
	private Integer indepYear;
	@Column (nullable = false)
	private Integer population;
	@Column(nullable = true)
	private Float lifeExpectancy;
	@Column(nullable = true)
	private Float gnp;
	@Column(nullable = true)
	private Float gnpOld;
	@Column (nullable = false)
	private String localName;
	@Column (nullable = false)
	private String governmentForm;
	@Column (nullable = true)
	private String headOfState;
	@Column (nullable = true)
	private Integer capital;
	@Column (nullable = false)
	private String code2;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Float getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public Integer getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(Integer indepYear) {
		this.indepYear = indepYear;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public float getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public Float getGnp() {
		return gnp;
	}
	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}
	public Float getGnpOld() {
		return gnpOld;
	}
	public void setGnpOld(Float gnpOld) {
		this.gnpOld = gnpOld;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public String getGovernmentForm() {
		return governmentForm;
	}
	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}
	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	public Integer getCapital() {
		return capital;
	}
	public void setCapital(Integer capital) {
		this.capital = capital;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	@Override
	public String toString() {
		return "Country [capital=" + capital + ", code=" + code + ", code2="
				+ code2 + ", continent=" + continent + ", gnp=" + gnp
				+ ", gnpOld=" + gnpOld + ", governmentForm=" + governmentForm
				+ ", headOfState=" + headOfState + ", indepYear=" + indepYear
				+ ", lifeExpectancy=" + lifeExpectancy + ", localName="
				+ localName + ", name=" + name + ", population=" + population
				+ ", region=" + region + ", surfaceArea=" + surfaceArea + "]";
	}
}
