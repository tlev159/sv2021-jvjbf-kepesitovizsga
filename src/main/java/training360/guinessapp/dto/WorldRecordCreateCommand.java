package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.recorders.Recorder;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldRecordCreateCommand {

    @NotBlank(message = "must not be blank")
    private String description;

    @NotNull
    private Double value;

    @NotBlank
    private String unitOfMeasure;

    @NotNull
    private LocalDate dateOfRecord;

    @NotNull
    private Long recorderId;

}
