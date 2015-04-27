package mountain.dao;

import java.util.List;
import java.util.UUID;

import mountain.model.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


@Repository
public class CountryDAOImpl implements CountryDAO {
	Log LOG =  LogFactory.getLog(CountryDAOImpl.class);
	enum Contients {
		ASIA("Asia"), EUROPE("Europe"), NORTH_AMERICA("North America");
		private String name;

		public String getName() {
			return name;
		}

		private Contients(String name) {
			this.name = name;
		}
	}

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addCountry(Country country) {
		country = constructDefaultCountry(country);
		getCurrentSession().save(country);
	}

	@Override
	public void deleteCountry(String code) {
		Country country = getCountry(code);
		if (country != null) {
			getCurrentSession().delete(country);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Country> getCountries() {
		return getCurrentSession().createQuery("from Country").list();
	}

	@Override
	public Country getCountry(String code) {
		Country country = (Country) getCurrentSession()
				.get(Country.class, code);
		return country;
	}

	@Override
	public void updateCountry(Country country) {
		Country countryToUpdate = getCountry(country.getCode());
		countryToUpdate.setName(country.getName());
		countryToUpdate.setRegion(country.getRegion());
		// countryToUpdate.setPopulation(country.getPopulation());
		// TODO: all properties need to update
		getCurrentSession().update(countryToUpdate);
	}

	private Country constructDefaultCountry(Country country) {
		LOG.debug("input country--" + country.toString());
		String code = (String) UUID.randomUUID().toString().substring(0, 3);
		String code2 = (String) UUID.randomUUID().toString().substring(0, 2);
		if (StringUtils.isEmpty(country.getCode())) {
			country.setCode(code);
		}
		if (StringUtils.isEmpty(country.getName())) {
			country.setName("MyCountry");
		}
		if (StringUtils.isEmpty(country.getContinent())) {
			country.setContinent(Contients.ASIA.getName());
		}
		if (StringUtils.isEmpty(country.getRegion())) {
			country.setRegion("MyRegion");
		}
		if (country.getSurfaceArea() == null || country.getSurfaceArea().isNaN()) {
			country.setSurfaceArea((Float) ((float) Math.random() * 10000));
		}
		if (country.getPopulation() == null || country.getPopulation().equals(0)) {
			country.setPopulation((Integer) ((int) Math.random() * 10000));
		}
		if (StringUtils.isEmpty(country.getLocalName())) {
			country.setLocalName("MyLocalName");
		}
		if (StringUtils.isEmpty(country.getGovernmentForm())) {
			country.setGovernmentForm("MyGovernmentForm");
		}
		if (StringUtils.isEmpty(country.getCode2())) {
			country.setCode2(code2);
		}
		if (country.getCapital() == null || country.getCapital().equals(0)) {
			country.setCapital((Integer) ((int) Math.random() * 100));
		}
		return country;
	}
	
}
