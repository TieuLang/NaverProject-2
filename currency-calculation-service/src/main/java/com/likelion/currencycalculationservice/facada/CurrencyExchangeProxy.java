package com.likelion.currencycalculationservice.facada;

import com.likelion.currencycalculationservice.model.CalculatedAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CalculatedAmount retireveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
