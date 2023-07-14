package bilhereteriacinema.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genero_sequence")
    @SequenceGenerator(name = "genero_sequence", sequenceName = "gen_seq")
    private Long id;
    private String nome;

    @OneToMany
    List<Filme> filmes;
}
