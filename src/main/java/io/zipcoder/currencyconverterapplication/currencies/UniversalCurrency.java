package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.UNIVERSAL_CURRENCY;

    @Override
    public Double convert(CurrencyType currency){
        Double universalAmount = currency.getRate() / CurrencyType.UNIVERSAL_CURRENCY.getRate();
        return universalAmount;
    }


    @Override
    public CurrencyType getType() {
        return type;
    }
}
