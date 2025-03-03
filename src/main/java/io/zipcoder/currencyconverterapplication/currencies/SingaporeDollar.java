package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.SINGAPORE_DOLLAR;
    @Override
    public Double convert(CurrencyType currency) {
        Double universalAmount = currency.getRate() / CurrencyType.SINGAPORE_DOLLAR.getRate();
        return universalAmount;

    }

    @Override
    public CurrencyType getType() {
        return type;
    }
}
