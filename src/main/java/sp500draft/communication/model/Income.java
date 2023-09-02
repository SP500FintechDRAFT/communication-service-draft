package sp500draft.communication.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Income {
    private LocalDate dateOfPurchase;
    private double purchaseAmount;
    private LocalDate dateOfSale;
    private double saleAmount;
    private double income;
    private double apy;
}
