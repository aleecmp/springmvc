package cl.awakelab.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.awakelab.springmvc.models.Capacitation;

@Repository
public class CapacitationDao implements ICapacitationDao {

	@Override
	public List<Capacitation> GetAllCapacitations() {

		List<Capacitation> capacitaciones = new ArrayList<>();

		Capacitation capacitacion1 = new Capacitation();
		capacitacion1.setId(1);
		capacitacion1.setRutCliente("12345678-9");
		capacitacion1.setDia("2023-07-07");
		capacitacion1.setHora("09:00");
		capacitacion1.setLugar("Sala A");
		capacitacion1.setDuracion(2);
		capacitacion1.setCantidadAsistentes(20);
		capacitaciones.add(capacitacion1);

		Capacitation capacitacion2 = new Capacitation();
		capacitacion2.setId(2);
		capacitacion2.setRutCliente("98765432-1");
		capacitacion2.setDia("2023-07-08");
		capacitacion2.setHora("14:00");
		capacitacion2.setLugar("Sala B");
		capacitacion2.setDuracion(3);
		capacitacion2.setCantidadAsistentes(15);
		capacitaciones.add(capacitacion2);

		Capacitation capacitacion3 = new Capacitation();
		capacitacion3.setId(3);
		capacitacion3.setRutCliente("56789012-3");
		capacitacion3.setDia("2023-07-09");
		capacitacion3.setHora("10:30");
		capacitacion3.setLugar("Sala C");
		capacitacion3.setDuracion(1);
		capacitacion3.setCantidadAsistentes(30);
		capacitaciones.add(capacitacion3);

		return capacitaciones;
	}

	@Override
	public boolean createCapacitation(Capacitation capacitation) {
		System.out.println("Datos de la capacitación:");
		System.out.println("ID: " + capacitation.getId());
		System.out.println("Rut Cliente: " + capacitation.getRutCliente());
		System.out.println("Día: " + capacitation.getDia());
		System.out.println("Hora: " + capacitation.getHora());
		System.out.println("Lugar: " + capacitation.getLugar());
		System.out.println("Duración: " + capacitation.getDuracion());
		System.out.println("Cantidad de Asistentes: " + capacitation.getCantidadAsistentes());

		return true;
	}
}
