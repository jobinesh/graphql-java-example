package demo;

/**
 *
 * @author Jobinesh
 */
public class DepartmentInput {

    private Integer departmentId;
    private String departmentName;
    private Integer managerId;
    private Integer locationId;

    public DepartmentInput() {
    }

    public DepartmentInput(Integer departmentId, String departmentName, Integer managerId, Integer locationId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.locationId = locationId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

}
