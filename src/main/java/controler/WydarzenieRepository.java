package controler;

import org.springframework.data.jpa.repository.JpaRepository;


public interface WydarzenieRepository extends JpaRepository<Wydarzenie, Long> {

  //  List<Wypozyczenie> findByValueINGreaterThanEqual(double valueIN);

  //  List<Wypozyczenie> findByValueINGreaterThanAndValueINLessThan(double ValueIN1, double ValueIN2);

 //   @Query("select walutaIN, sum(prowizja) from Operacja group by  walutaIN")
  //  List<Tuple> SumProwizja();
}
