package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisLista;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ControladorLista {

    private final ServeisLista serveiListas;

    public ControladorLista(ServeisLista serveiListas) {
        this.serveiListas = serveiListas;
    }

    @GetMapping("/zaan/todolists")
    public ResponseEntity<Object> listarListas(){
        List<Lista> res = serveiListas.llistarListas();
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/zaan/todolists/{idLista}")
    public ResponseEntity<Lista> consultarLista(@PathVariable Long idLista)
    {
        Lista res = serveiListas.consultarLista(idLista);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @PostMapping("/zaan/todolists")
    public ResponseEntity<Lista> crearLista(@RequestBody Lista nou){
        Lista res = serveiListas.afegirLista(nou);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @DeleteMapping("/zaan/todolists/{idLista}")
    public ResponseEntity<Lista> eliminarLista(@PathVariable Long idLista){
        Lista res = serveiListas.eliminarLista(idLista);
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/zaan/todolists")
    public ResponseEntity<Lista> modificarLista(@RequestBody Lista mod){
        Lista res = serveiListas.modificarLista(mod);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/zaan/todolists/{idLista}/todoitems/{id}")
    public ResponseEntity<Lista> consultarItemIdLista(@PathVariable Long idLista, Long id){
        Lista res = serveiListas.consultarLista(idLista);
        if (res == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(res);
    }

}
