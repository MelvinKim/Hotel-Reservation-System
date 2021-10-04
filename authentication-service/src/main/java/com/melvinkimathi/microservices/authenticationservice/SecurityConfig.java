package com.melvinkimathi.microservices.authenticationservice;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //for this example i'm going with in-memory authentication
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ROLE_ADMIN");
    }

    //authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //allow static files
                .antMatchers("/", "static/css", "static/js").permitAll()
                //start authorization from most restrictive to least restrictive route
                .antMatchers("/admin").hasRole("ROLE_ADMIN")
                .antMatchers("/user").hasAnyRole("ROLE_ADMIN", "ROLE_USER")
                .antMatchers("/**").permitAll()
            .and()
                .formLogin()
            //redirect on success --> Not working come back to it
                .defaultSuccessUrl("/homepage.html", true);
    }

    //password encoder
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
