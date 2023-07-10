package cl.awakelab.springmvc.models;

public class Contact {

	private String nombre;
	private String correoElectronico;
	private String Asunto;
	private String mensaje;

	public Contact() {

	}

	public Contact(String nombre, String correoElectronico, String asunto, String mensaje) {
		super();
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.Asunto = asunto;
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getAsunto() {
		return Asunto;
	}

	public void setAsunto(String asunto) {
		Asunto = asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}