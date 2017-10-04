package demo;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

/**
 * Query root. Contains top-level queries.
 */
class Query implements GraphQLRootResolver {

    private final DepartmentDataFetcher deptRepository;

    public Query(DepartmentDataFetcher deptRepository) {
        this.deptRepository = deptRepository;
    }

    public List<Department> departments() {
        return deptRepository.getDepartments();
    }
}
