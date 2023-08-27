package sp500draft.communication.service;

import java.io.File;

public interface CommunicationService {
	
	boolean AddHistoryWithFile(String indexForHistory,  File csvFile);
	
	

}
