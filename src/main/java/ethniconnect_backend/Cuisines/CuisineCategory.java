package ethniconnect_backend.Cuisines;

import ethniconnect_backend.ChefCreateMenu.ChefMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cuisinecategory")
public class CuisineCategory {
    @Id
    @GeneratedValue
    private int id;
    private String cuisine_name;
    private String cuisine_image;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cuisineCategory")
    private List<ChefMenu> menus;
}