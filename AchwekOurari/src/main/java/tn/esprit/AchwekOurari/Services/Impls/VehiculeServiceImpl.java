package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IVehiculeRepository;
import tn.esprit.AchwekOurari.Services.IVehiculeServices;
import tn.esprit.AchwekOurari.entity.Vehicule;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeServices {

    private final IVehiculeRepository iVehiculeRepository;

    @Override
    public Vehicule getById(Long id) {
        return iVehiculeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("vehicule not found"));
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

    @Override
    public List<Vehicule> getAll() {
        return iVehiculeRepository.findAll();
    }
}
