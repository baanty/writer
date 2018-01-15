package maintest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import vo.RequestVO;

public class NumericValidatorTest {

    private static ValidatorFactory vf;
    private static Validator validator;
    
    private static RequestVO requestVO;
    
    @BeforeClass
    public static void setUp(){
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
        requestVO = new RequestVO("Ram1");
        
    }
    
    @Test
    public void testGetNameWithNumeric() {
        Set<ConstraintViolation<RequestVO>> violations = validator.validate(requestVO);
        assertEquals(violations.size(), 1);
    }

    @Test
    public void testSetName() {
        requestVO.setName("Ram");
        Set<ConstraintViolation<RequestVO>> violations = validator.validate(requestVO);
        assertEquals(violations.size(), 0);
    }

}
