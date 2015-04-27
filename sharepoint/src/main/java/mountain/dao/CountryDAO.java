package mountain.dao;

import java.util.List;

import mountain.model.Country;

public interface CountryDAO {
	public void addCountry(Country country);

	public void updateCountry(Country country);

	public Country getCountry(String code);

	public void deleteCountry(String code);

	public List<Country> getCountries();
}
