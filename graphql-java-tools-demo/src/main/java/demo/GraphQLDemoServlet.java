package demo;

import javax.servlet.annotation.WebServlet;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

import com.coxautodev.graphql.tools.SchemaParser;

/**
 *
 * @author Jobinesh
 */
@WebServlet(urlPatterns = "/graphql")
public class GraphQLDemoServlet extends SimpleGraphQLServlet {

    public GraphQLDemoServlet() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        LocationRepository locationRepository = new LocationRepository();
        EmployeeRepository employeeRepository = new EmployeeRepository();
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(departmentRepository, employeeRepository),
                        new Mutation(departmentRepository, employeeRepository),
                        new DepartmentResolver(locationRepository, employeeRepository))
                .build()
                .makeExecutableSchema();
    }

}
