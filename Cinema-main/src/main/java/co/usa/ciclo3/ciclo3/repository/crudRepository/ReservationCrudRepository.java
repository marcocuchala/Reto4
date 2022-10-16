
package co.usa.ciclo3.ciclo3.repository.crudRepository;

import co.usa.ciclo3.ciclo3.entity.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
   @Query ("SELECT c.client. COUNT(c.client)FROM Reservation AS c group by c.client order by COUNT(c.client)DESC")
    public List <Object[]> countTotalReservationbyClient();
    
    public List <Reservation> findAllbyStaus(String status);
    
    public List<Reservation> findAllbyStartDateAfterAndStarDateBefore(Date datoOne, Date dateTwo);
}
