package com.likelion.currencyexchangeservice.config;

import com.likelion.currencyexchangeservice.model.ExchangeValue;
import com.likelion.currencyexchangeservice.repository.JPARepository;
import com.likelion.currencyexchangeservice.repository.MybatisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Configuration
public class Config {

    @Bean
    CommandLineRunner initDatabase(JPARepository jpaRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception{

                jpaRepository.save(new ExchangeValue(Long.valueOf(10001),"USD","VND", BigDecimal.valueOf(23300),0));
                jpaRepository.save(new ExchangeValue(Long.valueOf(10002),"EUR","VND", BigDecimal.valueOf(23800),0));

            }
        };
    }
}
