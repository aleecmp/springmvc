package cl.awakelab.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.awakelab.springmvc.models.Capacitation;

public class CapacitationDao implements ICapacitationDao {

    @Autowired
    private ICapacitationDao capacitationDao;

    @Override
    public List<Capacitation> GetAllCapacitations() {
        return (List<Capacitation>) capacitationDao.GetAllCapacitations();
    }

    @Override
    public boolean createCapacitation(Capacitation capacitation) {
        return   (boolean) capacitationDao.createCapacitation(Capacitation capacitation);

    }
}
