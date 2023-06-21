package bilhereteriacinema.service;

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
            throw new RuntimeException("Recurso não encotrado");
        }

    }

    public Filme save(Filme filme) {

        Filme result = filmeRepository.save(filme);
        return result;
    }

    public Filme update(Long id, Filme filme) {

        getById(id);
        filme.setId(id);
        Filme result = filmeRepository.save(filme);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        filmeRepository.deleteById(id);
    }

}
