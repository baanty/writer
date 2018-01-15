package validator;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

import vo.RequestVO;

public class NameValidatorTest {

    private Validator validator;
    
    @Before
    public void setUp(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    
    @Test
    public void test() {
        RequestVO request = new RequestVO("45test819");
        Set<ConstraintViolation<RequestVO>> violations = validator.validate(request);
        violations.stream().forEach(violation -> System.out.println(violation.getMessage()));
        Set<String> msgs = violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toSet());
        assertTrue(msgs.contains("Name Has 'test' text . It is not allowed."));
        assertTrue(msgs.contains("Numeric Validtor Test Failed"));
        assertFalse(msgs.contains("Name Validtor Test Failed"));
    }

}
