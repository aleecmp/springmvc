package cl.awakelab.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.springmvc.dao.CapacitationDaoImpl;
import cl.awakelab.springmvc.models.Capacitation;

@Controller
public class CreateCapacitationController {

	@Autowired
	private CapacitationDaoImpl capacitacionDao;

	@RequestMapping(path = "/create-capacitation", method = RequestMethod.GET)
	public ModelAndView createCapacitation() {
		return new ModelAndView("create-capacitation");
	}

	@RequestMapping(path = "/create-capacitation", method = RequestMethod.POST)
	public ModelAndView submitCapacitation(Capacitation capacitacion) {
		boolean created = capacitacionDao.createCapacitation(capacitacion);

		if (created) {

			RedirectView redirectView = new RedirectView("/list-capacitations", true);
			redirectView.setExposeModelAttributes(false);
			return new ModelAndView(redirectView);
		}

		return new ModelAndView("error");

	}
}
