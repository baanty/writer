package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import annotation.NumericValidator;
import vo.RequestVO;

public class NumericValidatorImpl implements ConstraintValidator<NumericValidator, RequestVO> {
    
    @Override
    public void initialize(NumericValidator constraintAnnotation) {
    }

    @Override
    public boolean isValid(RequestVO value, ConstraintValidatorContext context) {
        if(value.getName().contains("1")){
            return false;
        }
        return true;
    }

    

    

}
