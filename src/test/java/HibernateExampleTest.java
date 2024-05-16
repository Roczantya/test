import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.example.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sound.sampled.AudioFileFormat.Type;

import org.hibernate.Session; // Corrected import for Hibernate Session

 
public class HibernateExampleTest {
    private EntityManagerFactory sessionFactory;

    protected void setUp() throws Exception {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure()
            .build();
        try {
            emf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    
    protected void tearDown() throws Exception{
        if ( emf != null)  {
            emf.close();
        }     
    }
    
    void save_my_first_file(){

        Student student = new Student(1,"Karina",19, "IMT", "Jalan Tarakan No 23");

        try (Session session = sessionFactory.openSession()){
            session.beginTransaction(); // Corrected typo in method name

            session.persist(student);

            session.getTransaction().commit();
        }
    }
    
    void hql_fetch_students(){
        EntityManager em = emf.createEntityManager();
           em.getTransaction().begin();; // Corrected typo in method name
           List<Student> student = session.createQuery("select s.Name from Student s", Student.class) // Corrected HQL query to select student names
            .getResultList();
           student.forEach(System.out::println);
            em.getTransaction().commit();
       }
    }
    void criteriaApiQueryStudents() {
            EntityManager em = sessionFactory.createEntityManager();
            CriteriaBuilder cb = em.getCriteriaBuilder();

            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> root = cq.from(Student.class);
            criteriaQuery.select(root).where(cb.equal(root.get(Student_.Name)));

            TypedQuery<Student> query =em.createQuery(CriteriaQuery);
            List<Student> result = query.getResultList();
            result.forEach(student -> System.out.println("Student: " + student.getName() + ", NIM: " + student.getNIM()));
           
            em.close();
    }
    
    
}


