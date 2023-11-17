package com.pranab.assignment;

//SecurityConfig.java

@Configuration
@EnableWebSecurity
public class QueryInterface extends WebSecurityConfigurerAdapter {

 @Override
 protected void configure(HttpSecurity http) throws Exception {
     http
         .authorizeRequests()
             .antMatchers("/admin/**").hasRole("ADMIN")
             .antMatchers("/user/**").hasRole("USER")
             .anyRequest().authenticated()
             .and()
         .formLogin()
             .and()
         .httpBasic();
 }

 @Autowired
 public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
     auth
         .inMemoryAuthentication()
             .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN")
             .and()
             .withUser("user").password(passwordEncoder().encode("user")).roles("USER");
 }

 @Bean
 public PasswordEncoder passwordEncoder() {
     return new BCryptPasswordEncoder();
 }
}

