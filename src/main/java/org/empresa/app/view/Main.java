package org.empresa.app.view;
import org.empresa.app.model.Estudiante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/a1.odb");

        EntityManager em = emf.createEntityManager();

        TypedQuery<Estudiante> query = em.createQuery("SELECT est FROM Estudiante est WHERE est.", Estudiante.class);
        query.setParameter("fechaLimite", LocalDate.of(2002, 1, 1));

        List<Estudiante> results = query.getResultList();
        for (Estudiante est : results) {
            System.out.println(est);
        }

        // Close the database connection:
        em.close();
        emf.close();
    }
}
