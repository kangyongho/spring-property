package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by NPOST on 2017-04-20.
 */
@Controller
public class BasicController {

    /**
     * 환경변수설정 .properties 파일 Environments
     * 파일이 경로에 모두 없으면 서버시작시 초기화(배포) 실패한다.
     */
    @Value("${name:undefined}") String name;
    @Value("${password:undefined}") String password;

    /**
     * 설정파일로 부터 환경변수 읽어오기
     * 개발, 테스트, 배포 환경 고려
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("name: " + name);
        System.out.println("password: " + password);
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "test-property";
    }

}
