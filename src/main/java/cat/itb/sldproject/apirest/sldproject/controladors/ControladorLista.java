package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisItem;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisLista;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ControladorLista {

    private final ServeisLista serveiListas;
    private final ServeisItem serveisItem;

    public ControladorLista(ServeisLista serveiListas, ServeisItem serveisItem) {
        this.serveiListas = serveiListas;
        this.serveisItem = serveisItem;
    }

    @GetMapping("/todolists")
    public ResponseEntity<Object> listarListas(){
        List<Lista> res = serveiListas.llistarListas();
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/todolists/{idLista}")
    public ResponseEntity<Lista> consultarLista(@PathVariable Long idLista)
    {
        Lista res = serveiListas.consultarLista(idLista);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @PostMapping("/todolists")
    public ResponseEntity<Lista> crearLista(@RequestBody Lista nou){
        Lista res = serveiListas.afegirLista(nou);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @DeleteMapping("/todolists/{idLista}")
    public ResponseEntity<Lista> eliminarLista(@PathVariable Long idLista){
        Lista res = serveiListas.eliminarLista(idLista);
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/todolists/{idLista}")
    public ResponseEntity<Lista> modificarLista(@RequestBody Lista mod){
        Lista res = serveiListas.modificarLista(mod);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/todolists/{idLista}/todoitems")
    public ResponseEntity<Lista> listarItemsLista(@RequestBody Long idLlista){
        Lista res = serveiListas.consultarLista(idLlista);
        Lista res2 = (Lista) serveisItem.llistarItemsLista(idLlista);
        if (res == null) return ResponseEntity.notFound().build();
        else return res2;
    }
}
