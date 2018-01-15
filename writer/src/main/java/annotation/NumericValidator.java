/**
 * 
 */
package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import validator.NumericValidatorImpl;

/**
 * @author we43mm
 *
 */
@Target(value=ElementType.TYPE)
@Constraint(validatedBy={NumericValidatorImpl.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface NumericValidator {
    String message() default "Numeric Validtor Test Failed";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
