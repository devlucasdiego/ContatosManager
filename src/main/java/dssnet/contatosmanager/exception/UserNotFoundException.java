package dssnet.contatosmanager.exception;

// Manipulação de exceção
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String mensagem) {
        super(mensagem);
    }
}
