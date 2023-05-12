package bilhereteriacinema.repository;

import bilhereteriacinema.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  FilmeRepository extends JpaRepository<Filme,Long>{
    
}
