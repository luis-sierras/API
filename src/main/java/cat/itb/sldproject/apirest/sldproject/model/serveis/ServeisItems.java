package cat.itb.sldproject.apirest.sldproject.model.serveis;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Items;
import cat.itb.sldproject.apirest.sldproject.model.repositoris.RepositoriItems;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServeisItems {
    private final RepositoriItems repoItems;


    //llistar tots els ítems
    public List<Items> llistarItems(){
        return repoItems.findAll();
    }

    //consultar ítem per id
    public Items consultarItem(String id){
        return repoItems.findById(id).orElse(null);
    }

    //afegir ítem
    public Items afegirItem(Items it){
        return repoItems.save(it);
    }

    //modificar sencer, si existeix el canvia, sino retorna null
    public Items modificarItem(Items it){
        Items aux=null;
        if(repoItems.existsById(it.getId())) aux=repoItems.save(it);
        return aux;
    }

    //eliminar ítem per id
    //si no existeix id retorna null
    public Items eliminarItem(String id){
        Items res=repoItems.findById(id).orElse(null);
        if(res!=null) repoItems.deleteById(id);
        return res;
    }
}
