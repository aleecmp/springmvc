package cl.awakelab.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.springmvc.dao.ICapacitationDao;
import cl.awakelab.springmvc.models.Capacitation;

@Controller
public class CreateCapacitationController {

	@Autowired
	private ICapacitationDao capacitacionDao;

	@RequestMapping(path = "/create-capacitation", method = RequestMethod.GET)
	public ModelAndView createCapacitation() {
		return new ModelAndView("create-capacitation");
	}

	@RequestMapping(path = "/create-capacitation", method = RequestMethod.POST)
	public void submitCapacitation(Capacitation capacitacion) {
		capacitacionDao.createCapacitation(capacitacion);

	}
}
