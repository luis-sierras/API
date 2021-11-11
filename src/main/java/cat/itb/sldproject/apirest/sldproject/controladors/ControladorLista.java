package cat.itb.sldproject.apirest.sldproject.controladors;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import cat.itb.sldproject.apirest.sldproject.model.serveis.ServeisLista;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ControladorLista {

    private ServeisLista serveiListas;


    @GetMapping("/todolists")
    public ResponseEntity<Object> listarListas(){
        List<Lista> res = serveiListas.llistarListas();
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @GetMapping("/todolists/{idLista}")
    public ResponseEntity<Lista> consultarLista(@PathVariable Long id)
    {
        Lista res = serveiListas.consultarLista(id);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }

    @PostMapping("/todolistsCreate")
    public ResponseEntity<Lista> crearLista(@RequestBody Lista nou){
        Lista res = serveiListas.afegirLista(nou);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @DeleteMapping("/todolists/{idLista}")
    public ResponseEntity<Lista> eliminarLista(@PathVariable Long id){
        Lista res = serveiListas.eliminarLista(id);
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/todolists")
    public ResponseEntity<Lista> modificarLista(@RequestBody Lista mod){
        Lista res = serveiListas.modificarLista(mod);
        if (res == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(res);
    }
}
