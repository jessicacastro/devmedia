package br.com.devmedia.cursos.equeecdi.unitedburger.domain.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory unitedburgerEmf;
    private static EntityManagerFactory parceriasEmf;

    public static EntityManager getUnitedBurgetEntityManager() {
        if(unitedburgerEmf == null) {
            unitedburgerEmf = Persistence.createEntityManagerFactory("unitedburger");
        }

        return unitedburgerEmf.createEntityManager();
    }

    public static EntityManager getParceriasEntityManager() {
        if(parceriasEmf == null) {
            parceriasEmf = Persistence.createEntityManagerFactory("parcerias");
        }
        return parceriasEmf.createEntityManager();
    }
}
