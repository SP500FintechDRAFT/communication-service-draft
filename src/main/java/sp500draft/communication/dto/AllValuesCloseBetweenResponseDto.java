package sp500draft.communication.dto;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import lombok.Getter;

@Getter
public class AllValuesCloseBetweenResponseDto {
	private LocalDate from;
    private LocalDate to;
    private String source;
    private Period type;
    private LocalDate minDate;
    private LocalDate maxDate;
    private Double startClose;
    private Double endClose;
    private Double valueClose;
    private List<Long> listClose;
}
