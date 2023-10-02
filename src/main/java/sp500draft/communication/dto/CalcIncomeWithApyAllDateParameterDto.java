package sp500draft.communication.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class CalcIncomeWithApyAllDateParameterDto {
    private String[] indexes;
    private String type;
    private Long quantity;
    private LocalDate from;
    private LocalDate to;
}
