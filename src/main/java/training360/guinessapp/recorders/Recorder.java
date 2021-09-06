package training360.guinessapp.recorders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.worldrecord.WorldRecord;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recorder")
public class Recorder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate dateOfBirth;

    public Recorder(RecorderCreateCommand command) {
        this.name = command.getName();
        this.dateOfBirth = command.getDateOfBirth();
    }

}
