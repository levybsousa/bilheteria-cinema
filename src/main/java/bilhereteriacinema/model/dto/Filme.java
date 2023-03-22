package bilhereteriacinema.model.dto;

public class Filme {
    private String filme;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Filme(String filme , String id) {
        this.filme = filme;
        this.id = id;
    }

    public Filme() {
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void save(Filme filme) {
    }
}
