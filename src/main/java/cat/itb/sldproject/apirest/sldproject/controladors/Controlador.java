package cat.itb.sldproject.apirest.sldproject.controladors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/list")
    public List<Items> listarItems(){
        return serveiUsuaris.llistarUsuaris();
    }
}
