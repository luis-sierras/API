package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Item;
import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ControladorItem {

    private final ServeisItem serveiItems;

    public ControladorItem(ServeisItem serveiItems) {
        this.serveiItems = serveiItems;
    }

    @GetMapping("/zaan/todoitems")
    public ResponseEntity<Object> listarItems(){
        List<Item> res = serveiItems.llistarItems();
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/zaan/todoitems/{id}")
    public ResponseEntity<Item> consultarItem(@PathVariable Long id)
    {
        Item res = serveiItems.consultarItem(id);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @PostMapping("/zaan/todoitems")
    public ResponseEntity<Item> crearItem(@RequestBody Item nou){
        Item res = serveiItems.afegirItem(nou);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @DeleteMapping("/zaan/todoitems/{id}")
    public ResponseEntity<Item> eliminarItem(@PathVariable Long id){
        Item res = serveiItems.eliminarItem(id);
        return new ResponseEntity<>(res, HttpStatus.NO_CONTENT);
    }

    @PutMapping("/zaan/todoitems")
    public ResponseEntity<Item> modificarItem(@RequestBody Item mod){
        Item res = serveiItems.modificarItem(mod);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping
    public ResponseEntity<Object> listarItemsLista(@PathVariable Lista idLista){
        List<Item> res = serveiItems.llistarItemsLista(idLista);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

}
