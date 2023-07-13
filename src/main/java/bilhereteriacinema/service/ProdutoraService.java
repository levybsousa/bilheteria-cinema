package bilhereteriacinema.service;


import bilhereteriacinema.exception.RecursoNaoEncontradoException;
import bilhereteriacinema.model.entity.Genero;
import bilhereteriacinema.model.entity.Produtora;
import bilhereteriacinema.repository.ProdutoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class ProdutoraService {

    private final ProdutoraRepository produtoraRepository;

    public List<Produtora> getAll() {
        List<Produtora> result = produtoraRepository.findAll();
        return result;
    }

    public Produtora getById(Long id) {
        Optional<Produtora> result = produtoraRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException();
        }
    }

    public Produtora save(Produtora produtora) {
        Produtora result = produtoraRepository.save(produtora);
        return result;
    }

    public Produtora update(Long id, Produtora produtora) {
        getById(id);
        produtora.setId(id);
        Produtora result = produtoraRepository.save(produtora);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        produtoraRepository.deleteById(id);
    }
}