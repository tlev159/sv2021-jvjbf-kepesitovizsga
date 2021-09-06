package training360.guinessapp.dto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class IsDateBeforeNowValidator implements ConstraintValidator<IsDateBeforeNow, RecorderCreateCommand> {

    @Override
    public boolean isValid(RecorderCreateCommand value, ConstraintValidatorContext context) {
        return value.getDateOfBirth().isBefore(LocalDate.now());
    }

}
