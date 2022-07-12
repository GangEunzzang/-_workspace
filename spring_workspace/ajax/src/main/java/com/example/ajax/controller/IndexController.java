package com.example.ajax.controller;

import com.example.ajax.dto.FruitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("/list")
    public void list() {
    }

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    @ResponseBody
    public FruitDTO returnListVO() throws Exception {

        FruitDTO dto = new FruitDTO(1000, "안녕", "하하");


        return dto;
    }
}
