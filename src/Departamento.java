import java.util.List;

public class Departamento {
	private String nomeDepartamento;
	private List<Funcionario> funcionarios;
	
	public Departamento(String nomeDepartamento, List<Funcionario> funcionarios) {
		this.nomeDepartamento = nomeDepartamento;
		this.funcionarios = funcionarios;
	}
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public void adicionaFuncionario(Funcionario novFuncionario){
		this.funcionarios.add(novFuncionario);
	}
	public void mudancaSalario(List<Funcionario> funcionarios, double multiplicador){
		for(int i=0; i<funcionarios.size(); i++){
			funcionarios.get(i).setSalario(funcionarios.get(i).getSalario()*multiplicador);
		}
	}
	public void tranfereFuncionario(List<Funcionario> funcionarios, String nome, 
	List<Funcionario> funcionarios2){
		for(int i=0; i<funcionarios.size(); i++){
			if(funcionarios.get(i).getNome() == nome){
				funcionarios2.add( funcionarios.get(i));
				funcionarios.remove(i);
			}
		}
	}
}
