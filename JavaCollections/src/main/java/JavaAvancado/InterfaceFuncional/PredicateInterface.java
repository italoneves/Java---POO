package JavaAvancado.InterfaceFuncional;

import java.util.function.Predicate;

    //Retorna boolean
public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<String> p = nome -> nome.toLowerCase().contains("ít");

        System.out.println(p.test("Migue"));
        System.out.println(p.test("Ítalo"));


    }
}
