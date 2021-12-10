package com.tistory.kchs94.spring5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 설정 클래스로 지정한다.
public class AppContext {

    @Bean // 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록(생성하고 초기화)한다.
    public Greeter greeter() {
        Greeter g = new Greeter();
        g.setFormat("%s, 안녕하세요!");
        return g;
    }
}
