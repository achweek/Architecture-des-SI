package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Vehicule;

import java.util.List;

public interface IVehiculeServices {
    Vehicule getById(Long id);
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void deleteById(Long id);
    List<Vehicule> getAll();
}
