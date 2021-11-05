package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Items;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisItems;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorItems {

    private final ServeisItems serveiItems;

    @GetMapping("/listItem")
    public List<Items> listarItems(){
        return serveiItems.llistarItems();
    }

    @GetMapping("/item/{id}")
    public Items consultarItem(@PathVariable String id)
    {
        return serveiItems.consultarItem(id);
    }

    @PostMapping("/itemsMake")
    public Items crearItem(@RequestBody Items nou){
        return serveiItems.afegirItem(nou);
    }

    @DeleteMapping("/itemsDel/{id}")
    public Items eliminarItem(@PathVariable String id){
        return serveiItems.eliminarItem(id);
    }

    //per modificar un usuari existent
    @PutMapping("/itemsMod")
    public Items modificarItem(@RequestBody Item mod){
        return serveiItems.modificarItem(mod);
    }
}
