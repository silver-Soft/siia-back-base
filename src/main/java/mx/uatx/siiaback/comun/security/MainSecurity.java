/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uatx.siiaback.comun.security;

import mx.uatx.siiaback.comun.security.jwt.JwtAuthenticationEntryPoint;
import mx.uatx.siiaback.comun.security.jwt.JwtRequestFilter;
import mx.uatx.siiaback.comun.security.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import java.util.Arrays;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MainSecurity extends WebSecurityConfigurerAdapter{

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;


    @Autowired
    JwtAuthenticationEntryPoint jwtEntryPoint;

    
    @Bean
    public JwtRequestFilter jwtTokenFilter(){
        return new JwtRequestFilter();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

	
	  @Override protected void configure(HttpSecurity http) throws Exception {
	  http.cors().and().csrf().disable() .authorizeRequests()
	  .antMatchers(HttpMethod.OPTIONS).permitAll()
	  .antMatchers("/public/**").permitAll() .anyRequest().authenticated() .and()
	  .exceptionHandling().authenticationEntryPoint(jwtEntryPoint) .and()
	  .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	  http.addFilterBefore(jwtTokenFilter(),
	  UsernamePasswordAuthenticationFilter.class); }
	 
    
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.cors().and().csrf().disable() .authorizeRequests()
	 * .antMatchers(HttpMethod.OPTIONS).permitAll()
	 * .antMatchers("/public/**").permitAll() .anyRequest().authenticated() .and()
	 * .exceptionHandling().authenticationEntryPoint(jwtEntryPoint) .and()
	 * .headers() // the headers you want here. This solved all my CORS problems!
	 * .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Origin", "*"))
	 * .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Methods",
	 * "POST, GET, PUT, DELETE, OPTIONS, PATCH")) .addHeaderWriter(new
	 * StaticHeadersWriter("Access-Control-Max-Age", "3600")) .addHeaderWriter(new
	 * StaticHeadersWriter("Access-Control-Allow-Credentials", "true"))
	 * .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Headers",
	 * "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization"
	 * )) .and()
	 * .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	 * http.addFilterBefore(jwtTokenFilter(),
	 * UsernamePasswordAuthenticationFilter.class); }
	 */
    
    
    
	
	  @Bean public CorsFilter corsFilter() { UrlBasedCorsConfigurationSource source
	  = new UrlBasedCorsConfigurationSource(); CorsConfiguration config = new
	  CorsConfiguration(); config.setAllowCredentials(true);
	  config.addAllowedOrigin("http://localhost:4200");
	  config.addAllowedHeader("*"); config.setAllowedHeaders(Arrays.asList("*"));
	  config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	  config.setAllowedMethods(Arrays.asList("*"));
	 
	  source.registerCorsConfiguration("/**", config); return new
	  CorsFilter(source); }
	 
    
	/*
	 * @SuppressWarnings("rawtypes")
	 * 
	 * @Bean public FilterRegistrationBean processCorsFilter() { final
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource(); final CorsConfiguration config = new
	 * CorsConfiguration(); config.setAllowCredentials(true);
	 * config.addAllowedOrigin("'"); config.addAllowedHeader("*");
	 * config.addAllowedMethod("*"); source.registerCorsConfiguration("/**",
	 * config);
	 * 
	 * }
	 */
    
}