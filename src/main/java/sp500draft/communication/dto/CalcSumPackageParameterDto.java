package sp500draft.communication.dto;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class CalcSumPackageParameterDto {
	private String[] indexes;
    private int[] amount;
    private LocalDate from;
    private LocalDate to;
    private String type;
    private Long quantity;
}
