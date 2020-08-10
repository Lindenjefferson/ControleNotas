package projeto.ControleNotas.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import projeto.ControleNotas.DAO.AlunoDao;
import projeto.ControleNotas.Model.Aluno;

@ManagedBean(name = "Aluno")
@ViewScoped
public class AlunoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Aluno aluno = new Aluno();
	private AlunoDao alunoDao = new AlunoDao();
	private List<Aluno> listaAlunos = alunoDao.listar();
	private String nomeBusca = "";

	public void calculaMedia() {
		double media = aluno.getNota1() + aluno.getNota2() + aluno.getNota3();
		media = media / 3;
		aluno.setMedia(media);
	}
	
	public void listar() {
		listaAlunos = alunoDao.listar();
		nomeBusca = "";
	}

	public String buscar() {
		listaAlunos = alunoDao.findByNome(nomeBusca);
		return "";
	}

	public String buscarPorId(int id) {
		aluno = alunoDao.findById(id);
		System.out.println("buscou");
		return "";
	}
	
	public void verificaLista() {
		if (nomeBusca == "") {
			listar();
		} else {
			buscar();
		}
	}
	
	public String salvar() {
		calculaMedia();
		alunoDao.salvar(aluno);
		verificaLista();
		aluno = new Aluno();
		return "";
	}

	public String limpar() {
		aluno = new Aluno();
		return "";
	}

	public String deletar(int id) {
		alunoDao.deletar(id);
		verificaLista();
		return "";
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public AlunoDao getAlunoDao() {
		return alunoDao;
	}

	public void setAlunoDao(AlunoDao alunoDao) {
		this.alunoDao = alunoDao;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	public String getNomeBusca() {
		return nomeBusca;
	}

	public void setNomeBusca(String nomeBusca) {
		this.nomeBusca = nomeBusca;
	}

}
