package training360.guinessapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeatWorldRecordDto {

    private String description;

    private String unitOfMeasure;

    private String OldRecorderName;

    private String NewRecorderName;

    private Double NewRecordValue;

    private Double RecordDifference;

}
