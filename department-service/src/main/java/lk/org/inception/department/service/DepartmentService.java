package lk.org.inception.department.service;

import lk.org.inception.department.entity.Department;
import lk.org.inception.department.repository.DepartmentRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Setter
    @Autowired
    DepartmentRepository repository;

    public Department getDepartment(Long id) {
        return repository.findById(id).get();
    }
}
