package training360.guinessapp.recorders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RecorderRepository extends JpaRepository<Recorder, Long> {

    @Query(value = "select r from Recorder r where r.name like \"B%\" or r.name like \"%e%\" order by r.dateOfBirth")
    Collection<Object> listRecorderShortList();
}
