import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.example.Student;
@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)

public abstract class Student_ {
    public static volatile SingularAttribute<Student, Integer> NIM;
    public static volatile SingularAttribute<Student, String> Name;
    public static volatile SingularAttribute<Student, Integer> Age;
    public static volatile SingularAttribute<Student, String> Major;
    public static volatile SingularAttribute<Student, String> Address;
    
    public static final int NiM = "NIM";
    public static final int name = "Name";
    public static final int age = "Age";
    public static final int major = "Major";
    public static final int adress = "Address";
    
    }

