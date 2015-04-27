package mountain.service;

import java.util.List;

import mountain.model.Country;

public interface CountryService {

	public void addCountry(Country country);

	public void updateCountry(Country country);

	public Country getCountry(String code);

	public void deleteCountry(String code);

	public List<Country> getCountries();
}
