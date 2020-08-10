package projeto.ControleNotas.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import projeto.ControleNotas.Model.Aluno;
import projeto.ControleNotas.Util.JPAUtil;

public class AlunoDao {

	private EntityManager em = JPAUtil.getEntityManager();

	public List<Aluno> listar() {
		em.getTransaction().begin();
		String q = "select a from Aluno a order by a.nome asc";
		List<Aluno> alunos = em.createQuery(q, Aluno.class).getResultList();
		em.getTransaction().commit();
		return alunos;
	}
	
	public List<Aluno> findByNome(String nome) {
		em.getTransaction().begin();
		String q = "select a from Aluno a where a.nome like '%" + nome + "%' order by a.nome asc";
		List<Aluno> alunos = em.createQuery(q, Aluno.class).getResultList();
		em.getTransaction().commit();
		return alunos;
	}
	
	public Aluno findById(int id) {
		em.getTransaction().begin();
		Aluno aluno = em.find(Aluno.class, id);
		em.getTransaction().commit();
		return aluno;
	}
	
	public void salvar(Aluno aluno) {
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
	}
	
	public void deletar(int id) {
		Aluno aluno = findById(id);
		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();
	}

}
