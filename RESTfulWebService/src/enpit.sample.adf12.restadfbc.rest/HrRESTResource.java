package enpit.sample.adf12.restadfbc.rest;

import enpit.sample.adf12.restadfbc.model.query.common.EmployeesViewSDO;
import enpit.sample.adf12.restadfbc.model.service.common.serviceinterface.HRAppModuleService;

import enpit.sample.adf12.restadfbc.rest.bo.DeptResult;
import enpit.sample.adf12.restadfbc.rest.bo.EmpResult;

import javax.ejb.EJB;

import javax.inject.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import oracle.jbo.service.errors.ServiceException;

@Singleton
@Path("api")
public class HrRESTResource {
    
    @EJB
    HRAppModuleService serviceBean;
    
    public HrRESTResource() {
    }
    
    /**
     * getEmployeesView1: generated method. Do not modify.
     */
    @GET
    @Path("emp/{empId}")
    @Produces(value = { "application/json", "application/xml" })
    public EmpResult getEmployeesView1(@PathParam("empId") Integer employeeId) throws ServiceException {
        
        EmployeesViewSDO empSDO = serviceBean.getEmployeesView1(employeeId);
        
        EmpResult result = new EmpResult();
        result.setEmployee(empSDO);
        
        return result;
    }
    
    @GET
    @Path("depts")
    @Produces(value = { "application/json", "application/xml" })
    public DeptResult findAllDepartments() throws ServiceException {
        DeptResult result = new DeptResult();
        result.setDepartmentList(serviceBean.findDepartmentsView1(null, null));
        
        return result;
        
    }
}
