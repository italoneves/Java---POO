package ExemploOptinal;

import java.util.Optional;

public class Service {

    public Integer buscarIdade(Cliente c){
        //Se presente retorna valor, caso contrario exceção
        Integer tste = Optional.ofNullable(c.getIdade()).orElseThrow(() -> new NullPointerException("Idade não encontrada"));
        return tste;

        //Já retorna um optinal, então não precisamos do ofNullable
//        Integer tste = (c.getIdade()).orElseThrow(() -> new NullPointerException("Voltou null"));
//        return tste;
//        public Optional<Integer> getIdade() {
//            return Optional.ofNullable(idade);
//
    }
}
