package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidatorContext.ConstraintViolationBuilder;

import annotation.NameValidator;
import vo.RequestVO;

public class NameValidatorImpl implements ConstraintValidator<NameValidator, RequestVO> {
    
    @Override
    public void initialize(NameValidator constraintAnnotation) {
    }

    @Override
    public boolean isValid(RequestVO value, ConstraintValidatorContext context) {
        if(value.getName().contains("test")){
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Name Has 'test' text . It is not allowed.").addConstraintViolation();
            return false;
        }
        return true;
    }

    

    

}
