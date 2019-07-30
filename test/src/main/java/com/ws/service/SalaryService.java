package com.ws.service;

import com.ws.beans.Bean;

@Bean
public class SalaryService {
    public Integer calSalary(Integer experience) {
        return experience * 5000;
    }
}
