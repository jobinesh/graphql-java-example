package demo;

import com.coxautodev.graphql.tools.GraphQLResolver;
import java.util.List;

/**
 *
 * @author Jobinesh
 */
public class DepartmentResolver implements GraphQLResolver<Department> {

    private LocationRepository locationRepository = null;
    private EmployeeRepository employeeRepository = null;

    DepartmentResolver(LocationRepository locationRepository, EmployeeRepository employeeRepository) {
        this.locationRepository = locationRepository;
        this.employeeRepository = employeeRepository;
    }

    public Location location(Department department) {
        if (department.getLocationId() == null) {
            return null;
        }
        return locationRepository.findById(department.getLocationId());
    }

    public List<Employee> employees(Department department) {
        if (department.getDepartmentId() == null) {
            return null;
        }
        return employeeRepository.findByDepartmnetId(department.getDepartmentId());
    }
}
