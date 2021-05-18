
import java.util.Comparator;

public class ComparatorSaldo implements Comparator<Conta>{


    @Override
    public int compare(Conta o1, Conta o2) {

        return Double.compare(o1.getSaldo(),o2.getSaldo());


    }


}
