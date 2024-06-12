import java.util.List;

public class Empresa {
	private String nomeEmpresa;
	private String cnpj;
	private List<Departamento> departamentos;
	
	
	public Empresa(String nomeEmpresa, String cnpj, List<Departamento> departamentos) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.departamentos = departamentos;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	public void adicionaDepartamento(Departamento novoDepartamento){
		this.departamentos.add(novoDepartamento);
	}
	
}
