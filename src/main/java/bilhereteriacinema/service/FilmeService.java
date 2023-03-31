package bilhereteriacinema.service;

import bilhereteriacinema.model.entity.Filme;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeService {

    public List<Filme> getAll() {
        List<Filme> filmes = new ArrayList<>();
        Filme filme1 = new Filme("Rei Leão");
        Filme filme2 = new Filme("Tarzan");
        filmes.add(filme1);
        filmes.add(filme2);
        return filmes;
    }

    public Filme getById() {
        Filme filme = new Filme("Rei Leão");
        return filme;
    }

    public Filme save(Filme filme) {
        return filme;
    }

    public Filme update(Long id, Filme filme) {
        return filme;
    }

    public void delete(Long id) {

    }

}
