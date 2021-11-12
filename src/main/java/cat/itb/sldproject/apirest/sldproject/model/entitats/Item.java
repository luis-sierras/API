package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemName;
    //@ManyToOne
    //@JoinColumn(name = "id_Lista")
    private long id_lista;
    private boolean hecho;
    private long orden;

    //public Item(String itemName, long lista) {
    //    this.itemName = itemName;
    //    this.id_lista = lista;
    //}

    public Long getId() {
        return id;
    }
}
