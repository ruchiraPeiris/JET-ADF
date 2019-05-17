package enpit.sample.adf12.restadfbc.rest.bo;

import enpit.sample.adf12.restadfbc.model.query.common.EmployeesViewSDO;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmpResult {
    
    @XmlElement(name="employee")
    private EmployeesViewSDO employee;

    public EmpResult() {
        super();
    }
    
    public void setEmployee(EmployeesViewSDO employee) {
        this.employee = employee;
    }

    public EmployeesViewSDO getEmployee() {
        return employee;
    }



}
