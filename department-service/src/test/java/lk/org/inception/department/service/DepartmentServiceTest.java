package lk.org.inception.department.service;

import lk.org.inception.department.entity.Department;
import lk.org.inception.department.repository.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class DepartmentServiceTest {
    @Autowired
    DepartmentService service;

    @Test
    public void getDepartmentById() {

        assertNotNull(service.getDepartment(1L));
    }

    @Configuration
    public static class Config {

        @MockBean
        public DepartmentRepository repository;

        @Bean
        public DepartmentService departmentService() {
            Department value1 = new Department(1L, null, null, null);
            when(repository.findById(1L)).thenReturn(Optional.of(value1));
            return new DepartmentService(repository);
        }
    }
}
