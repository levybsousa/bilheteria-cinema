package bilhereteriacinema.repository;

import bilhereteriacinema.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  FilmeRepository extends JpaRepository<Filme,Long>{

    Filme getFilmeByTitulo(String titulo);
}
