package tn.esprit.AchwekOurari.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.AchwekOurari.Repository.IVehiculeRepository;
import tn.esprit.AchwekOurari.Services.IVehiculeServices;
import tn.esprit.AchwekOurari.entity.Vehicule;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {
    private  final IVehiculeServices iVehiculeServices;
    @PostMapping("/add")
    Vehicule create(@RequestBody Vehicule vehicule){
        return iVehiculeServices.add(vehicule);
    }

}
