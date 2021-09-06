package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@IsDateBeforeNow
public class RecorderCreateCommand {

    @NotBlank(message = "must not be blank")
    private String name;

    @NotNull
    private LocalDate dateOfBirth;
}
