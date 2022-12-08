package controler;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Tuple;


public interface WypozyczenieRepository extends JpaRepository<Wypozyczenie, Long> {

  //  List<Wypozyczenie> findByValueINGreaterThanEqual(double valueIN);

  //  List<Wypozyczenie> findByValueINGreaterThanAndValueINLessThan(double ValueIN1, double ValueIN2);

 //   @Query("select walutaIN, sum(prowizja) from Operacja group by  walutaIN")
  //  List<Tuple> SumProwizja();
}
