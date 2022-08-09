package lk.org.inception.department.repository;

import lk.org.inception.department.entity.Department;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository repository;

    @Test
    public void whenDepartmentCreated() {
        Department a = new Department();
        repository.save(a);
        Optional<Department> result = repository.findById(1L);
        System.out.println(result.get());
        assertNotNull(result.get());
    }
}
