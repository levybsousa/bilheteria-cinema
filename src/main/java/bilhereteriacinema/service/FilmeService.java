package bilhereteriacinema.service;

import bilhereteriacinema.model.entity.Filme;
import bilhereteriacinema.repository.FilmeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public List<Filme> getAll() {
      List<Filme> filmes = filmeRepository.findAll();
      return filmes;
    }

    public Filme getById(Long id) {

        Filme filme = filmeRepository.getById(id);
        return filme;
    }

    public Filme save(Filme filme) {

        Filme filmeSaved = filmeRepository.save(filme);
        return filmeSaved;
    }

    public Filme update(Long id, Filme filme) {
       return  filme;
    }

    public void delete(Long id) {
         filmeRepository.deleteById(id);
    }

}
