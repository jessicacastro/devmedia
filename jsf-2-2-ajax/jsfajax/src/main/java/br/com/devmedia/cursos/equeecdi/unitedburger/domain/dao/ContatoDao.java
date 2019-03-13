package br.com.devmedia.cursos.equeecdi.unitedburger.domain.dao;

import br.com.devmedia.cursos.equeecdi.unitedburger.domain.model.Contato;

import javax.persistence.EntityManager;

public class ContatoDao {

    public void cadastrar(Contato contato) {
        EntityManager em = JpaUtil.getUnitedBurgetEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(contato);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();

            e.printStackTrace();

            throw new RuntimeException("Erro ao realizar cadastro do" + contato);
        } finally {
            em.close();
        }

    }

}
