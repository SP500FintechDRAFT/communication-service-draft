package sp500draft.communication.dto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Getter;

@Getter
public class CalcIncomeWithApyParameterDto {
    private String[] indexes;
    private ChronoUnit type;
    private Long quantity;
	private LocalDate from;
    private LocalDate to;
}
