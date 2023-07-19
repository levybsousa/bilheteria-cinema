package bilhereteriacinema.service;

import bilhereteriacinema.exception.RecursoNaoEncontradoException;
import bilhereteriacinema.model.entity.Filme;
import bilhereteriacinema.model.entity.Genero;
import bilhereteriacinema.repository.FilmeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public List<Filme> getAll() {
        List<Filme> result = filmeRepository.findAll();
        return result;
    }

    public Filme getById(Long id) {
        Optional<Filme> result = filmeRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RecursoNaoEncontradoException();
        }

    }

    public Filme save(Filme filme) {

       Optional <Filme> filmeFromDataBase = filmeRepository.getFilmeByTitulo(filme.getTitulo());

        if (filmeFromDataBase.isPresent()) {
            throw new RuntimeException("Filme já existe");
        }
        Filme result = filmeRepository.save(filme);
        return result;
    }

    public Filme update(Long id, Filme filme) {
        this.getById(id);

        Optional<Filme> filmeFromDataBase = filmeRepository.getFilmeByTitulo(filme.getTitulo());

        if (filmeFromDataBase.isPresent() && filmeFromDataBase.get().getId() != filme.getId()) {
            throw new RuntimeException("Filme já cadastrado");
        }

        Filme result = filmeRepository.save(filme);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        filmeRepository.deleteById(id);
    }

}
