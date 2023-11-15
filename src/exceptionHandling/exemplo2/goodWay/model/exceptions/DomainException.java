package exceptionHandling.exemplo2.goodWay.model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException{
    @Serial //Essa é uma classe serializable, por causa do Exception
    private static final long serialVersionUID = 1L;
    public DomainException(String msg){
        super(msg); //Vou passar essa mensagem para o construtor da superclasse no caso Exception
    }
}
