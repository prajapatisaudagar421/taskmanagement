// package com.example.taskmanagement.text;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// @EnableMethodSecurity
// public class WebSecurityConfig {

//     @Bean
//     public UserDetailsService userDetailsService(PasswordEncoder encoder){
//         UserDetails admin = User.withUsername("Saudagar")
//         .password(encoder.encode("123"))
//         .roles("ADMIN", "USER")
//         .build();

//         UserDetails user = User.withUsername(null)
   
//         return null; }



//     // @Bean
//     // public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//     //     // httpSecurity.authorizeRequests().antMachers("/public/**").permitAll().anyRequest().authenticated().and()
//     //     // .formLogin()
//     //     //     .loginPage("/login")
//     //     //     .permitAll()
//     //     // .and()
//     //     // .logout()
//     //     //     .permitAll();
        
//     //     // return httpSecurity.build();
//     //     httpSecurity.authorizeHttpRequests(authorize -> authorize
//     //     .requestMatchers("/public/**").permitAll().anyRequest().authenticated()).formLogin(form -> form
//     //     .disable())//.logout(logout -> logout.disable())
//     //     .csrf(csrf -> csrf.disable())
//     //     .httpBasic(httpBasic -> httpBasic.disable());
//     //     return httpSecurity.build();

//     // }
    
//     // @Bean
//     // public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

//     // }
// }
