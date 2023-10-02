package sp500draft.communication.service;

import java.io.File;
import java.util.Map;

import sp500draft.communication.dto.AllValuesCloseBetweenParameterDto;
import sp500draft.communication.dto.AllValuesCloseBetweenResponseDto;
import sp500draft.communication.dto.CalcCorellationParameterDto;
import sp500draft.communication.dto.CalcIncomeWithApyAllDateParameterDto;
import sp500draft.communication.dto.CalcIncomeWithApyAllDateResponseDto;
import sp500draft.communication.dto.CalcIncomeWithApyParameterDto;
import sp500draft.communication.dto.CalcIncomeWithApyResponseDto;
import sp500draft.communication.dto.CalcIncomeWithIrrParameterDto;
import sp500draft.communication.dto.CalcIncomeWithIrrResponseDto;
import sp500draft.communication.dto.CalcSumPackageParameterDto;
import sp500draft.communication.dto.CalcSumPackageResponseDto;
import sp500draft.communication.dto.ParserYahooFinanceParameterDto;
import sp500draft.communication.dto.ParserYahooFinanceResponseDto;
import sp500draft.communication.dto.PeriodBetweenParameterDto;
import sp500draft.communication.dto.PeriodBetweenResponseDto;
import sp500draft.communication.dto.TimeHistoryForIndexResponseDto;

public interface CommunicationService {
	
	boolean addHistoryWithFile(String indexForHistory,  File csvFile);
	
	Iterable<ParserYahooFinanceResponseDto> parseYahooFinance
										   (ParserYahooFinanceParameterDto parserYahooFinanceParameterDto);
	
	Map<String, String> addNewIndexesForParser(Map<String, String> newIndexesForParser);
	
	TimeHistoryForIndexResponseDto getTimeHistoryForIndex();
	
	Iterable<String> getAllIndexes();
	
	Iterable<PeriodBetweenResponseDto> getPeriodBetween
									  (PeriodBetweenParameterDto periodBetweenParameterDto);
	
	Iterable<AllValuesCloseBetweenResponseDto> getAllValuesCloseBetween
									 		  (AllValuesCloseBetweenParameterDto allValuesCloseBetweenParameterDto);
	
	CalcSumPackageResponseDto calcSumPackage
							 (CalcSumPackageParameterDto calcSumPackageParameterDto);
	
	CalcIncomeWithApyResponseDto calcIncomeWithApy
								(CalcIncomeWithApyParameterDto calcIncomeWithApyParameterDto);
	
	CalcIncomeWithApyAllDateResponseDto calcIncomeWithApyAllDate
									   (CalcIncomeWithApyAllDateParameterDto calcIncomeWithApyAllDateParameterDto);
	
	CalcIncomeWithIrrResponseDto calcIncomeWithIrr
		(CalcIncomeWithIrrParameterDto calcIncomeWithIrrParameterDto);
	
	String calcCorellation(CalcCorellationParameterDto calcCorellationParameterDto);
	
	boolean deleteAllHistoryForCompany(String index);
	
	Double getPrediction(String index);

}
