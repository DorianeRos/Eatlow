package com.Eatlow;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().permitAll(); // Autorisation totale d'accés au site
        //http.csrf().disable().authorizeRequests().anyRequest().authenticated();  // Interdiction totale d'accés au site (403)

        /* http.csrf().disable()
                .formLogin().loginProcessingUrl("/login").and()
                .logout().logoutUrl("/logout").invalidateHttpSession(true).and()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/logout").permitAll()
                .anyRequest().authenticated().and().httpBasic(); */
    }
}