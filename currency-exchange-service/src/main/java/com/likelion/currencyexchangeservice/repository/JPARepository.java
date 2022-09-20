package com.likelion.currencyexchangeservice.repository;

import com.likelion.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepository extends JpaRepository<ExchangeValue,Long> {
    ExchangeValue findByFromAndTo(String from,String to);
}
