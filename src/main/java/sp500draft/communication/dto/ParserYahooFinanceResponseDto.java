package sp500draft.communication.dto;

import java.time.LocalDate;
import java.util.Map;


import lombok.Getter;

@Getter
public class ParserYahooFinanceResponseDto {
	private Map<LocalDate, String> uploadInfoId;
    private Double close;
    private String volume;
    private Double open;
    private Double high;
    private Double low;
}
