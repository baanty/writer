package vo;

import annotation.NameValidator;
import annotation.NumericValidator;

@NameValidator
@NumericValidator
public class RequestVO {

    
    private String name;
    
    

    public RequestVO(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
    
    
}
