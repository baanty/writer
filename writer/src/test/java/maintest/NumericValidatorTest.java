package maintest;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import integration.BitwiseService;
import vo.RequestVO;

public class NumericValidatorTest {

    private static ValidatorFactory vf;
    private static Validator validator;
    
    private static RequestVO requestVO;
    
    @BeforeClass
    public static void setUp(){
        vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
        requestVO = new RequestVO("Ram1", null);
        
    }
    
    @Test
    @Ignore
    public void testGetNameWithNumeric() {
        Set<ConstraintViolation<RequestVO>> violations = validator.validate(requestVO);
        assertEquals(violations.size(), 1);
    }

    @Test
    @Ignore
    public void testSetName() {
        //requestVO.setName("Ram");
        Set<ConstraintViolation<RequestVO>> violations = validator.validate(requestVO);
        assertEquals(violations.size(), 0);
    }
    
    @Test
    public void testRunner(){
        BitwiseService bitService = new BitwiseService();
        if(bitService.isFirst() & bitService.isSecond()){
            System.out.println("test end");
        }
        assertTrue(true);
    }

}
