package mountain.controller;

import java.util.List;

import mountain.model.Country;
import mountain.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/country")
public class CountryController extends LinkController{

	@Autowired
	private CountryService countryService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addTeamPage() {
		ModelAndView modelAndView = new ModelAndView("add-country-form");
		modelAndView.addObject("country", new Country());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addingTeam(@ModelAttribute Country country) {

		ModelAndView modelAndView = new ModelAndView("home");
		countryService.addCountry(country);

		String message = "Country was successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfCountries() {
		ModelAndView modelAndView = new ModelAndView("list-of-countries");

		List<Country> countries = countryService.getCountries();
		modelAndView.addObject("countries", countries);

		return modelAndView;
	}

	@RequestMapping(value = "/edit/{code}", method = RequestMethod.GET)
	public ModelAndView editTeamPage(@PathVariable String code) {
		ModelAndView modelAndView = new ModelAndView("edit-country-form");
		Country country = countryService.getCountry(code);
		modelAndView.addObject("country", country);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{code}", method = RequestMethod.POST)
	public ModelAndView edditingTeam(@ModelAttribute Country country,
			@PathVariable String code) {

		ModelAndView modelAndView = new ModelAndView("home");

		countryService.updateCountry(country);

		String message = "Country was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}

	@RequestMapping(value = "/delete/{code}", method = RequestMethod.GET)
	public ModelAndView deleteTeam(@PathVariable String code) {
		ModelAndView modelAndView = new ModelAndView("home");
		countryService.deleteCountry(code);
		String message = "Country was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}