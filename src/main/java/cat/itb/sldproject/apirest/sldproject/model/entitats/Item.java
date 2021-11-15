package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table()
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lista")
    private Lista id_lista;
    private boolean hecho;
    private long orden;

}
