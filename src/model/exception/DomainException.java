package model.exception;

// Minha classe|Subclasse para tratar exceções de maneira personalizada
public class DomainException extends RuntimeException{

    // Construtor que recebe um messagem String
    public DomainException(String messagem){super(messagem);}
}
