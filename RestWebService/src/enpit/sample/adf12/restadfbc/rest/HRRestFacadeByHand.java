package enpit.sample.adf12.restadfbc.rest;

import enpit.sample.adf12.restadfbc.model.query.common.EmployeesViewSDOImpl;
import enpit.sample.adf12.restadfbc.model.service.HRAppModuleImpl;
import enpit.sample.adf12.restadfbc.rest.base.RestBaseImpl;
import enpit.sample.adf12.restadfbc.rest.bo.EmpResult;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("restapi3")
public class HRRestFacadeByHand extends RestBaseImpl{
    
    private static final String AM_NAME = "enpit.sample.adf12.restadfbc.model.service.HRAppModule"; 
    private static final String AM_CONFIG = "HRAppModuleService";
    
    public HRRestFacadeByHand() {
        super();
    }
    
    
    /**
     * getEmployeesView1: generated method. Do not modify.
     */
    @GET
    @Path("emp/{empId}")
    @Produces(value = { "application/json", "application/xml" })
    public EmpResult getEmployeesView1(@PathParam("empId") Integer employeeId) {
        
        EmpResult result = new EmpResult();
        HRAppModuleImpl service = null;
        try {
            service = (HRAppModuleImpl) getAppModule(AM_NAME, AM_CONFIG);
            
            // TODO Get Employee by ADF BC API and wrap as custom Business Object
            //service.getEmployeesView1().findByKey(arg0, arg1)
            //result.setEmployee(empRow);
        }finally {
            releaseApplicationModule(service);
        }
        
        return result;
        //
    }
    
    
    
}
