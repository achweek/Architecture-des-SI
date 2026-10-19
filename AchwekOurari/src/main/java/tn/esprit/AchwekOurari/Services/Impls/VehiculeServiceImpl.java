package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IVehiculeRepository;
import tn.esprit.AchwekOurari.Services.IVehiculeServices;
import tn.esprit.AchwekOurari.entity.Vehicule;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeServices {

    private final IVehiculeRepository iVehiculeRepository;

    @Override
    public Vehicule getById(Long id) {
        return iVehiculeRepository.findById(id).orElseThrow(()->new EntityNotFoundException(("vehicule not found")));
    }

    @Override
    public Vehicule add(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteById(Long id) {
        iVehiculeRepository.deleteById(id);
    }
}
