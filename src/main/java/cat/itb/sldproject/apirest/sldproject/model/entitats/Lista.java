package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Lista")
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLista;
    private String listaName;
    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items = new ArrayList<>();

    public Lista(String listaName) {
        this.listaName = listaName;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getId() {
        return idLista;
    }

}
