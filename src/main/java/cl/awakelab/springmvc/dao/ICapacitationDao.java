package cl.awakelab.springmvc.dao;

import java.util.List;

import cl.awakelab.springmvc.models.Capacitation;

public interface ICapacitationDao {

    public List<Capacitation> GetAllCapacitations();

    public Capacitation createCapacitation();

}
