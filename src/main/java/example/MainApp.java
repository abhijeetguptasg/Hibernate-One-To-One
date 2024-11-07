package example;

import jakarta.persistence.*;



public class MainApp {

    public static void main(String[] args) {
        
        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Abhijeet");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        
        try {
            transaction.begin();
            
            // Create Aadhaar and Person instances
            Aadhaar aadhaar = new Aadhaar("1234-5678-9012", "Government of India");
            Person person = new Person("John Doe", "New Delhi", aadhaar);

            // Persist Aadhaar and Person
            em.persist(aadhaar);
            em.persist(person);

            // Commit the transaction
            transaction.commit();
            
            System.out.println("Person and Aadhaar saved successfully!");

        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Rollback in case of an error
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}

