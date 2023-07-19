package bilhereteriacinema.repository;

import bilhereteriacinema.model.entity.Produtora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoraRepository extends JpaRepository<Produtora, Long> {

    Optional<Produtora> getProdutoraByNome(String nome);
}
