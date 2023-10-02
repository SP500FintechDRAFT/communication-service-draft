package sp500draft.communication.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class CalcSumPackageResponseDto {
    private LocalDate from;
    private LocalDate to;
    private String source;
    private String type;
    private Double max;
    private Double mean;
    private Double median;
    private Double min;
    private Double std;
}
