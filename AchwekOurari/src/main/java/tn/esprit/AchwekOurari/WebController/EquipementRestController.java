package tn.esprit.AchwekOurari.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IEquipementServices;
import tn.esprit.AchwekOurari.entity.Equipement;

import java.util.List;

@RestController
@RequestMapping("/equipements")
@RequiredArgsConstructor
public class EquipementRestController {

    private final IEquipementServices iEquipementServices;

    @PostMapping("/add")
    public Equipement create(@RequestBody Equipement equipement) {
        return iEquipementServices.add(equipement);
    }

    @GetMapping("/get/{id}")
    public Equipement getById(@PathVariable Long id) {
        return iEquipementServices.getById(id);
    }

    @GetMapping("/all")
    public List<Equipement> getAll() {
        return iEquipementServices.getAll();
    }

    @PutMapping("/update")
    public Equipement update(@RequestBody Equipement equipement) {
        return iEquipementServices.update(equipement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iEquipementServices.deleteById(id);
    }
}
