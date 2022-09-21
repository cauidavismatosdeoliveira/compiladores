import AC.Token;
import AC.Analisador;
public class Main {
    public static void main(String args[]) {
        Analisador analex = new Analisador("teste.txt");

        Token token = null;

        do {
            token = analex.percorreToken();

            if(token != null){
                System.out.println(token);
            }
            
        } while (token != null);
    }
}