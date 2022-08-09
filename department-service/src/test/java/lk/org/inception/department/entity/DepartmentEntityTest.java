package lk.org.inception.department.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class DepartmentEntityTest {
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void whenDepartmentCreated() {
        Department a = new Department();
        entityManager.persist(a);
        Department dataReceived = entityManager.find(Department.class, 1L);
        System.out.println(dataReceived);
        assertNotNull(dataReceived);
    }

}
