package list.shopping.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/images/**", "/css/**", "javascript/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/").permitAll()
            .anyRequest().authenticated()
        .and()
            .formLogin()
            .loginPage("/login")
            .loginProcessingUrl("/sign_in")
            .successForwardUrl("/dashboard")
            .usernameParameter("username")
            .passwordParameter("password")
            .failureUrl("/login?error")
            .permitAll()
        .and()
            .logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/")
            .permitAll();
    }
}
