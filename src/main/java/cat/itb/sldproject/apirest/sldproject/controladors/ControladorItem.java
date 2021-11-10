package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Item;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisItem;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ControladorItem {

    private final ServeisItem serveiItems;

    @GetMapping("/todoitems")
    public ResponseEntity<Object> listarItems(){
        List<Item> res = serveiItems.llistarItems();
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/todoitems/{id}")
    public ResponseEntity<Item> consultarItem(@PathVariable String id)
    {
        Item res = serveiItems.consultarItem(id);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @PostMapping("/todoitems")
    public ResponseEntity<Item> crearItem(@RequestBody Item nou){
        Item res = serveiItems.afegirItem(nou);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @DeleteMapping("/todoitems/{id}")
    public ResponseEntity<Item> eliminarItem(@PathVariable String id){
        Item res = serveiItems.eliminarItem(id);
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/todoitems")
    public ResponseEntity<Item> modificarItem(@RequestBody Item mod){
        Item res = serveiItems.modificarItem(mod);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }
}
