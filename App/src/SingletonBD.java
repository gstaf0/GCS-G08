
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

    public static void deletarUsuario() {
        // Deletar Usuário
    }

    public static void atualizarUsuario(){
        // teste merge atualizar usuario giseli
    }

    public static void listarUsuarios(){
        System.out.println("Opção 2 do menu - Listar Usuários:");
    }
    
}
