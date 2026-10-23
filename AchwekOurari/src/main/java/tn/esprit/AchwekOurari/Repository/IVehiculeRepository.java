package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
}
