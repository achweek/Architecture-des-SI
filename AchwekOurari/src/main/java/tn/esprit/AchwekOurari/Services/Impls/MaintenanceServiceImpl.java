package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IMaintenanceRepository;
import tn.esprit.AchwekOurari.Services.IMaintenanceServices;
import tn.esprit.AchwekOurari.entity.Maintenance;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceServices {

    private final IMaintenanceRepository iMaintenanceRepository;

    @Override
    public Maintenance getById(Long id) {
        return iMaintenanceRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("maintenance not found"));
    }

    @Override
    public Maintenance add(Maintenance maintenance) {
        return iMaintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return iMaintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteById(Long id) {
        iMaintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAll() {
        return iMaintenanceRepository.findAll();
    }
}
