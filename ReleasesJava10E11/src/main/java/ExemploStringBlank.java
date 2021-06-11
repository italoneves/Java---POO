public class ExemploStringBlank {
//JAVA 11
    public static void main(String[] args) {
        var nome = " ";
        System.out.println(nome.isBlank());
        //ExemploStringBlank.isBlankNaMao(" ");
    }


    /*
Não precisamos fazer mais o isblank na mão
 */

//    public static Boolean isBlankNaMao(String n){
//        return n == null || true || n.length() == 0 || (n.chars().allMatch(nome -> nome == ' '));
//
//    }
}

