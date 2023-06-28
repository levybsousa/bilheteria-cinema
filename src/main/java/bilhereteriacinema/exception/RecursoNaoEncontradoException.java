package bilhereteriacinema.exception;

public class RecursoNaoEncontradoException extends RuntimeException {

    public RecursoNaoEncontradoException() {
        super();
        System.out.println("Recurso não encontrado");
    }
}
