package demo;

import java.io.File;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;
import graphql.schema.GraphQLSchema;
import graphql.schema.StaticDataFetcher;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

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

        SchemaParser schemaParser = new SchemaParser();
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        File schemaFile = loadSchema("schema.graphqls");
        TypeDefinitionRegistry typeRegistry = schemaParser.parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeRegistry, wiring);
        return graphQLSchema;
    }

    private static File loadSchema(String fileName) {
        ClassLoader classLoader = GraphQLDemoServlet.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file;
    }

    private static RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                // this uses builder function lambda syntax
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("departments", new StaticDataFetcher(DepartmentDataFetcher.getDepartments()))
                ).build();
    }
}
