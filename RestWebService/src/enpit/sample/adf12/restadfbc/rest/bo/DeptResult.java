package enpit.sample.adf12.restadfbc.rest.bo;

import enpit.sample.adf12.restadfbc.model.query.common.DepartmentsViewSDO;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeptResult {
    public DeptResult() {
        super();
    }
    
    @XmlElement(name="departments")
    private List<DepartmentsViewSDO> departmentList;

    public void setDepartmentList(List<DepartmentsViewSDO> departmentList) {
        this.departmentList = departmentList;
    }

    public List<DepartmentsViewSDO> getDepartmentList() {
        return departmentList;
    }
}
