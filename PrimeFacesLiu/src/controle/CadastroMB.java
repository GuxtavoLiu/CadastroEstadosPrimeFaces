package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import modelo.CadastroEstados;

@ManagedBean
@ViewScoped
public class CadastroMB {
	CadastroEstados cadastroEstado = new CadastroEstados();
	List<CadastroEstados> cadastros = new ArrayList<>();

	public void cadastrar() {
		cadastroEstado.setQtdeCaracteres(cadastroEstado.getNome().length());
		cadastros.add(cadastroEstado);
		cadastroEstado = new CadastroEstados();
	}

	public List<CadastroEstados> getCadastros() {
		return cadastros;
	}

	public void setCadastros(List<CadastroEstados> cadastros) {
		this.cadastros = cadastros;
	}

	public CadastroEstados getCadastro() {
		return cadastroEstado;
	}

	public void setCadastro(CadastroEstados cadastroEstado) {
		this.cadastroEstado = cadastroEstado;
	}

}