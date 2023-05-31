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
        List<Filme> filmes = new ArrayList<>();
        Filme filme1 = new Filme(1l, "Rei Leão");
        Filme filme2 = new Filme(2l, "Tarzan");
        filmes.add(filme1);
        filmes.add(filme2);
        return filmes;
    }

    public Filme getById(Long id) {

        Filme filme = new Filme(1l, "Rei Leão");
        return filme;
    }

    public Filme save(Filme filme) {

        Filme filmeSaved = filmeRepository.save(filme);
        return filmeSaved;
    }

    public Filme update(Long id, Filme filme) {
        return filme;
    }

    public void delete(Long id) {

    }

}
