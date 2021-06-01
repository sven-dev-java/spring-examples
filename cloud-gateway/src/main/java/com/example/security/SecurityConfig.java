package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public MapReactiveUserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user")
                .roles(Roles.USER, Roles.ADMIN, Roles.TESTER)
                .build();
        UserDetails kunde = User.withDefaultPasswordEncoder()
                .username("kunde")
                .password("kunde")
                .roles(Roles.KUNDE)
                .build();
        return new MapReactiveUserDetailsService(user, kunde);
    }

    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange().anyExchange().hasAnyRole(Roles.ADMIN, Roles.TESTER)
                .and()
                .httpBasic();
        return http.build();
    }
}
