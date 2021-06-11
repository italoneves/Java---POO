package ExemploMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

    public static void main(String[] args) {

        HashMap<String,Integer> mundias= new HashMap<String, Integer>();

        mundias.put("Brasil", 6);
        mundias.put("Argentina", 2);
        mundias.put("Alemanhã", 4);
        mundias.put("Holanda", 3);


        System.out.println(mundias);
        //Não adiciona mais uma chave argentina, atualiza o valor da chave
        mundias.put("Argentina", 3);

        System.out.println("Atualiza valor da chave argentina "+ mundias);

        //Verifica se tem chave
        System.out.println(mundias.containsKey("Brasil")); //true
        //Verifica se tem value
        System.out.println(mundias.containsValue(7)); //false

        //Remove item se key e value existir correspondente aos parametros
        System.out.println("--------------Remover itens----------------");
        System.out.println(mundias.remove("Brasil", 6));
        //Remove pela chave
        System.out.println(mundias.remove("Argentina"));
        //Tamanho do map
        System.out.println(mundias.size());
        System.out.println(mundias);

        //Retornar valor que ta associado a chave digitada
        System.out.println("Valor que ta associdado a chave= "+ mundias.get("Holanda"));

        //NAVEGAR NO MAP
        for (Map.Entry<String,Integer> entry: mundias.entrySet()) {

            System.out.println(entry.getKey() +" ---- " + entry.getValue());
        }
        System.out.println("\n\n");

        //NAVEGAR NO MAP e Exemplo de remover pelo VALUE
        Iterator<String> iterator = mundias.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            if(mundias.get(key) == 3){
                mundias.remove(key);
                break;
            }

        }
        //Printar
        Iterator<String> i= mundias.keySet().iterator();
        while (i.hasNext()){
            String key = i.next();
            System.out.println(key + "--------" + mundias.get(key));
        }

        TreeMap<String, Integer> paises2 = new TreeMap<>();


    }
}
