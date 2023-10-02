package sp500draft.communication.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class TimeHistoryForIndexResponseDto {
	private String source;
	private LocalDate fromData;
	private LocalDate toData;
}
