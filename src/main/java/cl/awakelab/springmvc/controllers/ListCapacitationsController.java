package cl.awakelab.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.springmvc.dao.ICapacitationDao;
import cl.awakelab.springmvc.models.Capacitation;

@Controller
public class ListCapacitationsController {

    @Autowired
    private ICapacitationDao capacitacionDao;

    @RequestMapping(path = "/list-capacitations", method = RequestMethod.GET)
    public ModelAndView listCapacitations() {
        List<Capacitation> capacitations = capacitacionDao.GetAllCapacitations();
        ModelAndView modelAndView = new ModelAndView("list-capacitations");
        modelAndView.addObject("capacitations", capacitations);
        return modelAndView;
    }
}

