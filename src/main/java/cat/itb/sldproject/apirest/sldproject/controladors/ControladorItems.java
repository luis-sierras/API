package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Items;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisItems;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ControladorItems {

    private final ServeisItems serveiItems;

    public ControladorItems(ServeisItems serveiItems) {
        this.serveiItems = serveiItems;
    }

    @GetMapping("/todoitems")
    public ResponseEntity<Object> listarItems(){
        List<Items> res = serveiItems.llistarItems();
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/todoitems/{id}")
    public ResponseEntity<Items> consultarItem(@PathVariable String id)
    {
        Items res = serveiItems.consultarItem(id);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @PostMapping("/todoitems")
    public ResponseEntity<Items> crearItem(@RequestBody Items nou){
        Items res = serveiItems.afegirItem(nou);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @DeleteMapping("/todoitems/{id}")
    public ResponseEntity<Items> eliminarItem(@PathVariable String id){
        Items res = serveiItems.eliminarItem(id);
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/todoitems")
    public ResponseEntity<Items> modificarItem(@RequestBody Items mod){
        Items res = serveiItems.modificarItem(mod);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }
}
