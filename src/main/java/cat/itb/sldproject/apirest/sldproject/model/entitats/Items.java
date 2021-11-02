package cat.itb.sldproject.apirest.sldproject.model.entitats;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@NoArgsConstructor
public class Items {
    @Id
    private Long id;
    private String ListName;
    private String Item;


}
