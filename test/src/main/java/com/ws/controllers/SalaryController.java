package com.ws.controllers;

import com.ws.beans.AutoWired;
import com.ws.service.SalaryService;
import com.ws.web.mvc.Controller;
import com.ws.web.mvc.RequestMapping;
import com.ws.web.mvc.RequestParam;

@Controller
public class SalaryController {

    @AutoWired
    private SalaryService salaryService;

    @RequestMapping("/get_salary.json")
    public Integer getSalary(@RequestParam("name") String name, @RequestParam("experience") String experience) {
        return salaryService.calSalary(Integer.parseInt(experience));
    }
}
