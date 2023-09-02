package sp500draft.communication.dto;

import java.time.LocalDate;

import lombok.Getter;
import sp500draft.communication.model.Income;

@Getter
public class CalcIncomeWithIrrResponseDto {	
    private LocalDate from;
    private LocalDate to;
    private String[] source;
    private String type;
    private Income minIncome;
    private Income maxIncome;
}
