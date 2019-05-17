package enpit.sample.adf12.restadfbc.rest.base;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class RestBaseImpl {
    public RestBaseImpl() {
        super();
    }
    
    public ApplicationModule getAppModule(String name, String config){
        return Configuration.createRootApplicationModule(name, config);
    }
    
    public void releaseApplicationModule(ApplicationModule am){
        Configuration.releaseRootApplicationModule(am, false);
    }
}
