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

        /*@Bean
        public DepartmentRepository departmentRepository(){
            return new DepartmentRepository() {
                @Override
                public List<Department> findAll() {
                    return null;
                }

                @Override
                public List<Department> findAll(Sort sort) {
                    return null;
                }

                @Override
                public List<Department> findAllById(Iterable<Long> longs) {
                    return null;
                }

                @Override
                public <S extends Department> List<S> saveAll(Iterable<S> entities) {
                    return null;
                }

                @Override
                public void flush() {

                }

                @Override
                public <S extends Department> S saveAndFlush(S entity) {
                    return null;
                }

                @Override
                public <S extends Department> List<S> saveAllAndFlush(Iterable<S> entities) {
                    return null;
                }

                @Override
                public void deleteAllInBatch(Iterable<Department> entities) {

                }

                @Override
                public void deleteAllByIdInBatch(Iterable<Long> longs) {

                }

                @Override
                public void deleteAllInBatch() {

                }

                @Override
                public Department getOne(Long aLong) {
                    return null;
                }

                @Override
                public Department getById(Long aLong) {
                    return null;
                }

                @Override
                public Department getReferenceById(Long aLong) {
                    return null;
                }

                @Override
                public <S extends Department> List<S> findAll(Example<S> example) {
                    return null;
                }

                @Override
                public <S extends Department> List<S> findAll(Example<S> example, Sort sort) {
                    return null;
                }

                @Override
                public Page<Department> findAll(Pageable pageable) {
                    return null;
                }

                @Override
                public <S extends Department> S save(S entity) {
                    return null;
                }

                @Override
                public Optional<Department> findById(Long aLong) {
                    return Optional.empty();
                }

                @Override
                public boolean existsById(Long aLong) {
                    return false;
                }

                @Override
                public long count() {
                    return 0;
                }

                @Override
                public void deleteById(Long aLong) {

                }

                @Override
                public void delete(Department entity) {

                }

                @Override
                public void deleteAllById(Iterable<? extends Long> longs) {

                }

                @Override
                public void deleteAll(Iterable<? extends Department> entities) {

                }

                @Override
                public void deleteAll() {

                }

                @Override
                public <S extends Department> Optional<S> findOne(Example<S> example) {
                    return Optional.empty();
                }

                @Override
                public <S extends Department> Page<S> findAll(Example<S> example, Pageable pageable) {
                    return null;
                }

                @Override
                public <S extends Department> long count(Example<S> example) {
                    return 0;
                }

                @Override
                public <S extends Department> boolean exists(Example<S> example) {
                    return false;
                }

                @Override
                public <S extends Department, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                    return null;
                }
            };
        }*/
        @Bean
        public DepartmentService departmentService() {
            when(repository.findById(1L)).thenReturn(Optional.of(new Department(1L, null, null, null)));
            DepartmentService a = new DepartmentService();
            a.setRepository(repository);
            return a;
        }
    }
}
