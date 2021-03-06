package cat.itb.sldproject.apirest.sldproject.model.serveis;

import cat.itb.sldproject.apirest.sldproject.model.entitats.Item;
import cat.itb.sldproject.apirest.sldproject.model.entitats.Lista;
import cat.itb.sldproject.apirest.sldproject.model.repositoris.RepositoriItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServeisItem {
    private final RepositoriItem repoItems;

    public ServeisItem(RepositoriItem repoItems) {
        this.repoItems = repoItems;
    }

    //llistar tots els ítems
    public List<Item> llistarItems() {
        return repoItems.findAll();
    }

    //consultar ítem per id
    public Item consultarItem(Long id) {
        return repoItems.findById(id).orElse(null);
    }

    //afegir ítem
    public Item afegirItem(Item it) {
        return repoItems.save(it);
    }

    //modificar sencer, si existeix el canvia, sino retorna null
    public Item modificarItem(Item it) {
        Item aux = null;
        if (repoItems.existsById(it.getId())) aux = repoItems.save(it);
        return aux;
    }

    //eliminar ítem per id
    //si no existeix id retorna null
    public Item eliminarItem(Long id) {
        Item res = repoItems.findById(id).orElse(null);
        if (res != null) repoItems.deleteById(id);
        return res;
    }

    //llistar tots els ítems
    public List<Item> llistarItemsLista(Lista idLista) {
        return repoItems.findItemsByLista(idLista);
    }
}
