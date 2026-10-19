package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Vehicule;

public interface IVehiculeServices {
    Vehicule getById(Long id);
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void deleteById(Long id);
}
