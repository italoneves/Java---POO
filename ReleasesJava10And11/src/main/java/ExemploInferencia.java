import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

//JAVA 10
public class ExemploInferencia {

    public static void main(String[] args) throws IOException {

        var url = new URL("http://stack.desenvolvedor.expert/appendix/docker/container_vm.html");
        var urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

    }

        /*
        PODE USAR EM VARIÁVEL LOCAL INICIALIZADA
        VARIÁVEL DO FOR
         */
  //---------------------------------------------------------------//
        /* NÃO PODE
        * VARIÁVEL NÃO INICIALIZAVEL
        * NÍVEL DE CLASSE
        * PARÂMETROS
        * */
}
