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
    private String Id;
    private String Item;


}
