package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.worldrecord.WorldRecord;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorldRecordDto {

    private Long id;

    private String description;

    private Double value;

    private String unitOfMeasure;

    private LocalDate dateOfRecord;

    private Long recorderId;

    private String recorderName;

    public WorldRecordDto(WorldRecordCreateCommand command, String recorderName) {
        this.description = command.getDescription();
        this.value = command.getValue();
        this.unitOfMeasure = command.getUnitOfMeasure();
        this.dateOfRecord = command.getDateOfRecord();
        this.recorderId = command.getRecorderId();
        this.recorderName = recorderName;
    }

    public WorldRecordDto(WorldRecord worldRecordTemplate, String name) {
        this.description = worldRecordTemplate.getDescription();
        this.value = worldRecordTemplate.getValue();
        this.unitOfMeasure = worldRecordTemplate.getUnitOfMeasure();
        this.dateOfRecord = worldRecordTemplate.get;
        this.recorderId = worldRecordTemplate.getRecorderId();
        this.recorderName = name;
    }
}
