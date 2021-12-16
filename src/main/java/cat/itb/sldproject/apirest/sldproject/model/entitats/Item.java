package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Item")
@RequiredArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String itemName;
    @ManyToOne
    @JoinColumn(name = "idLista")
    private Lista lista;
    private boolean hecho;

    public Long getId() {
        return id;
    }
    public Item(String n, Boolean d){
        itemName = n;
        hecho = d;
    }
}
