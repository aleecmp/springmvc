package cl.awakelab.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public ModelAndView mostrarCapacitation() {
        return new ModelAndView("contact");
    }
}
