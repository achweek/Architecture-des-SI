package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.AchwekOurari.entity.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule,Long> {
}
