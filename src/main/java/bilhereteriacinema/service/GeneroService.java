package bilhereteriacinema.service;

import bilhereteriacinema.exception.RecursoNaoEncontradoException;
import bilhereteriacinema.model.entity.Genero;
import bilhereteriacinema.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GeneroService {
    private final GeneroRepository generoRepository;

    public List<Genero> getAll() {
        List<Genero> result = generoRepository.findAll();
        return result;
    }

    public Genero getById(Long id) {
        Optional<Genero> result = generoRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RecursoNaoEncontradoException();
        }
    }

    public Genero save(Genero genero) {
        Genero generoFromDataBase = generoRepository.getGeneroByNome(genero.getNome());
        if (generoFromDataBase != null) {
            throw new RuntimeException("Genero já existe");
        }
        Genero result = generoRepository.save(genero);
        return result;
    }

    public Genero update(Long id, Genero genero) {
        Genero generoFromDataBase = generoRepository.getGeneroByNome(genero.getNome());

        if (generoFromDataBase.getId() != genero.getId()) {
            throw new RuntimeException("Genero já cadastrado");
        }
        Genero result = generoRepository.save(genero);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        generoRepository.deleteById(id);
    }
}
