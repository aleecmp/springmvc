package cl.awakelab.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.springmvc.models.Contact;

@Controller
public class ContactController {

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public ModelAndView mostrarCapacitation() {
		return new ModelAndView("contact");
	}

	@RequestMapping(path = "/contact", method = RequestMethod.POST)
	public void showDataContact(Contact contact) {
		System.out.println("Datos del contacto:");
		System.out.println("Nombre: " + contact.getNombre());
		System.out.println("Correo electrónico: " + contact.getCorreoElectronico());
		System.out.println("Asunto: " + contact.getAsunto());
		System.out.println("Mensaje: " + contact.getMensaje());
	}
}
