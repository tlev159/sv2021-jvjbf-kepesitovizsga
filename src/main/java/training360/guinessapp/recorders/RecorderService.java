package training360.guinessapp.recorders;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import training360.guinessapp.dto.RecorderCreateCommand;
import training360.guinessapp.dto.RecorderDto;
import training360.guinessapp.dto.RecorderShortDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RecorderService {

    private ModelMapper modelMapper;

    private RecorderRepository repository;


    public RecorderDto createRecorder(RecorderCreateCommand command) {
        Recorder recorderTemplate = new Recorder(command);
        repository.save(recorderTemplate);
        return modelMapper.map(recorderTemplate, RecorderDto.class);
    }

    public List<RecorderShortDto> listRecorderShortList() {
        return repository.listRecorderShortList().stream()
                .map(r -> modelMapper.map(r, RecorderShortDto.class)).collect(Collectors.toList());
    }
}
