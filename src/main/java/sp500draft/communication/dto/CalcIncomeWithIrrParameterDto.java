package sp500draft.communication.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class CalcIncomeWithIrrParameterDto {
    private String[] indexs;
    private String type;
    private Long quantity;
    private LocalDate from;
    private LocalDate to;
}
