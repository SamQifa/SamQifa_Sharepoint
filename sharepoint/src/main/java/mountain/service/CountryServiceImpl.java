package mountain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mountain.dao.CountryDAO;
import mountain.model.Country;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDAO countryDAO;

	@Override
	public void addCountry(Country country) {
		countryDAO.addCountry(country);
	}

	@Override
	public void deleteCountry(String code) {
		countryDAO.deleteCountry(code);
	}

	@Override
	public List<Country> getCountries() {
		return countryDAO.getCountries();
	}

	@Override
	public Country getCountry(String code) {
		return countryDAO.getCountry(code);
	}

	@Override
	public void updateCountry(Country country) {
		countryDAO.updateCountry(country);
	}

}
