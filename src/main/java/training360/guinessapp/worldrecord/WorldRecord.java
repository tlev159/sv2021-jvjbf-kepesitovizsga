package training360.guinessapp.worldrecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.recorders.Recorder;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "world_record")
public class WorldRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double value;

    private String unitOfMeasure;

    private LocalDate dateOfMeasure;

    private Long recorderId;

    @OneToOne()
    private Recorder recorder;

    public WorldRecord(WorldRecordCreateCommand command, Recorder recorder) {
        this.description = command.getDescription();
        this.value = command.getValue();
        this.unitOfMeasure = command.getUnitOfMeasure();
        this.dateOfMeasure = command.getDateOfRecord();
        this.recorderId = recorder.getId();
    }

}
