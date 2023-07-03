package cl.awakelab.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateCapacitationController {

    @RequestMapping(path = "/create-capacitation", method = RequestMethod.GET)
    public ModelAndView createCapacitation() {
        return new ModelAndView("create-capacitation");
    }

}
