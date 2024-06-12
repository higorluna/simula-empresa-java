import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<Departamento> listaDepartamentos = new ArrayList<>();
        Empresa empresa = new Empresa("Assai", "12345-6789", listaDepartamentos);

        
        List<Funcionario> funcionariosPerfumaria = new ArrayList<>();
        List<Funcionario> funcionariosComidas = new ArrayList<>();
        List<Funcionario> funcionariosBebidas = new ArrayList<>();

        Departamento perfumaria = new Departamento("Perfumaria", funcionariosPerfumaria);
        Departamento comida = new Departamento("Comida", funcionariosComidas);
        Departamento bebida  =new Departamento("Bebidas", funcionariosBebidas);

        Funcionario joaquim = new Funcionario("Joaquim", 1200.00, "2000-05-15");
        Funcionario pedro = new Funcionario("Pedro", 1300.00, "2000-06-15");   
        Funcionario maria = new Funcionario("Maria", 1400.00, "2000-07-15");   
        Funcionario camila = new Funcionario("Camila", 1500.00, "2000-07-15");   
        Funcionario paulo = new Funcionario("Paulo", 1600.00, "2000-07-15");   
        Funcionario carlos = new Funcionario("Carlos", 1700.00, "2000-10-15");   
        
        funcionariosPerfumaria.add(joaquim);
        funcionariosPerfumaria.add(pedro);
        funcionariosComidas.add(maria);
        funcionariosComidas.add(camila);
        funcionariosBebidas.add(paulo);
        funcionariosBebidas.add(carlos);

        listaDepartamentos.add(bebida);
        listaDepartamentos.add(comida);
        listaDepartamentos.add(perfumaria);
        
        perfumaria.mudancaSalario(perfumaria.getFuncionarios(), 1.1);

        perfumaria.tranfereFuncionario(funcionariosPerfumaria, "Joaquim", funcionariosBebidas);
    }
}
