package sp500draft.communication.dto;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;

@Getter
public class ParserYahooFinanceParameterDto {
    private String[] source;
	private LocalDate fromData;
	private LocalDate toData;
    private Period periodType; 
}
