package com.likelion.currencyexchangeservice.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

@Mapper
public interface MybatisRepository {
    @Insert("INSERT INTO exchange_value(id,currency_from,currency_to,conversion_multiple,port) " +
            "values(#{id},#{from},#{to},#{mul},#{port}")
    public void addValue(Long id, String from, String to, BigDecimal mul, int port);

}
