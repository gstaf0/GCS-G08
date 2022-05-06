
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        // No branch
        System.out.println("Digite o login do seu novo usuário");
        System.out.println("Digite a senha do seu novo usuário");
        System.out.println("Digite o seu nome completo");
        System.out.println("Digite o seu ano de nascimento");
    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
