package training360.guinessapp.dto;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Constraint(validatedBy = IsDateBeforeNowValidator.class)
public @interface IsDateBeforeNow {

    String message() default "must be in the past";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
