package cl.awakelab.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListCapacitationsController {

    @RequestMapping(path = "/list-capacitations", method = RequestMethod.GET)
    public ModelAndView listCapacitations() {
        return new ModelAndView("list-capacitations");
    }
}
