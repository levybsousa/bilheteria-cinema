package bilhereteriacinema.model.entity;

public class Filme {
    private String titulo;
    private Long id;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Filme(String titulo) {
        this.titulo = titulo;
        this.id = id;

    }
}

