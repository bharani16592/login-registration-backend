package ethniconnect_backend.ChefDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ChefRepository extends JpaRepository <Chef, Integer> {

    //Optional<Object> findByLogin_Id(long login_id);

    /*    *//*@Query("SELECT new ethniconnect_backend.ChefDetails.ChefprofileResponse( c.chef_fname, m.menu_item_price)" +
            " FROM Chef c join c.ChefMenu m")*//*
    public List<ChefprofileResponse> getChefProfileInfo();*/

}
