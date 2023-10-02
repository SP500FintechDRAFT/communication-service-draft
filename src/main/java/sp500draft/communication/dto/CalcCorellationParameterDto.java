package sp500draft.communication.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class CalcCorellationParameterDto {
    private String[] indexes;
    private LocalDate from;
    private LocalDate to;
}
