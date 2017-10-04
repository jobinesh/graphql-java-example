package demo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDataFetcher {

    static List<Department> departments = new ArrayList<Department>() {
        {

            add(new Department(10, "HR", 100, 2000));
            add(new Department(20, "IT", 200, 2000));
            add(new Department(30, "Sales", 300, 2000));
        }
    };

    public static List<Department> getDepartments() {
        return departments;
    }

}
