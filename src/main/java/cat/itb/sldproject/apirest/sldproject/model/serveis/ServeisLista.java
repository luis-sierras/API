package cat.itb.sldproject.apirest.sldproject.model.serveis;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Item;
import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import cat.itb.sldproject.apirest.sldproject.model.repositoris.RepositoriItem;
import cat.itb.sldproject.apirest.sldproject.model.repositoris.RepositoriLista;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServeisLista {
    private final RepositoriLista repoLista;

    //llistar tots els listas
    public List<Lista> llistarListas(){
        return repoLista.findAll();
    }

    //consultar lista per id
    public Lista consultarLista(String id){
        return repoLista.findById(id).orElse(null);
    }

    //afegir lista
    public Lista afegirLista(Lista it){
        return repoLista.save(it);
    }

    //modificar sencer, si existeix el canvia, sino retorna null
    public Lista modificarLista(Lista it){
        Lista aux=null;
        if(repoLista.existsById(it.getId())) aux=repoLista.save(it);
        return aux;
    }

    //eliminar lista per id
    //si no existeix id retorna null
    public Lista eliminarLista(String id){
        Lista res=repoLista.findById(id).orElse(null);
        if(res!=null) repoLista.deleteById(id);
        return res;
    }
}
