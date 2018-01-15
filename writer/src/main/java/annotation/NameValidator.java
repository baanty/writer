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

import validator.NameValidatorImpl;

/**
 * @author we43mm
 *
 */
@Target(value=ElementType.TYPE)
@Constraint(validatedBy={NameValidatorImpl.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface NameValidator {
    String message() default "Name Validtor Test Failed";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
