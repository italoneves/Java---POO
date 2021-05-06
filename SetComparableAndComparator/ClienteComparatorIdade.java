package SetComparableAndComparator;

import java.util.Comparator;

public class ClienteComparatorIdade implements Comparator<Cliente> {


    @Override
    public int compare(Cliente cliente, Cliente t1) {
        return cliente.idade.compareTo(t1.idade);
    }
}
