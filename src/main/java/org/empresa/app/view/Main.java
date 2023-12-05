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
        em.getTransaction().begin();
        Estudiante estudiante = new Estudiante("Jhon Z", "Gomez", 20, "001-0000000-0", LocalDate.of(2022, 1, 1), "Ing. Sistemas", "2022-0000");
        em.persist(estudiante);
        em.getTransaction().commit();
        TypedQuery<Estudiante> query = em.createQuery("SELECT est FROM Estudiante est", Estudiante.class);

        List<Estudiante> results = query.getResultList();
        for (Estudiante est : results) {
            System.out.println(est);
        }
        // Close the database connection:
        em.close();
        emf.close();
    }
}
