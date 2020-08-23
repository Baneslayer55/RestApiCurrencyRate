package com.currencyrateinfo.currencyrateinfo.controllers;

import com.currencyrateinfo.currencyrateinfo.classes.CurrencyRate;
import com.currencyrateinfo.currencyrateinfo.domain.Currency;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("currencyrateinfo")
public class CurrencyController {

    @GetMapping
    public List<Currency> currenciesRateInfo(/*@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam() String valuteId*/) throws IOException, ParseException {

        return CurrencyRate.getCurrenciesList("http://www.cbr.ru/scripts/XML_daily.asp"); // XML_daily.asp?date_req=02/03/2002

    }

    @GetMapping("{id}")
    public Currency currencyById (@PathVariable String id) throws IOException, ParseException {
        return CurrencyRate.getCurrencyById("http://www.cbr.ru/scripts/XML_daily.asp", id);
    }
}
