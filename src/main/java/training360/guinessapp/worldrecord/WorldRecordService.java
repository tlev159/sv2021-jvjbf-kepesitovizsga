package training360.guinessapp.worldrecord;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.BeatWorldRecordCommand;
import training360.guinessapp.dto.BeatWorldRecordDto;
import training360.guinessapp.dto.WorldRecordCreateCommand;
import training360.guinessapp.dto.WorldRecordDto;
import training360.guinessapp.recorders.Recorder;
import training360.guinessapp.recorders.RecorderRepository;

@Service
@AllArgsConstructor
public class WorldRecordService {

    private ModelMapper modelMapper;

    private WorldRecordRepository repository;
    private RecorderRepository recorderRepository;

    public WorldRecordDto createWorldRecord(WorldRecordCreateCommand command) {
        Recorder recorderTemplate = recorderRepository.findById(command.getRecorderId()).orElseThrow(() -> new IllegalArgumentException("Cannot find recoder"));
        WorldRecord worldRecordTemplate = new WorldRecord(command, recorderTemplate);
        repository.save(worldRecordTemplate);
        WorldRecordDto worldRecordDtoTemplate = new WorldRecordDto(worldRecordTemplate, recorderTemplate.getName());
        return worldRecordDtoTemplate;
    }

    public BeatWorldRecordDto beatWorldRecord(Long id, BeatWorldRecordCommand command) {

    }
}
