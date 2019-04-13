package list.shopping.web;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

@Getter
public class Property {
    @Value("${spring.security.user.name}")
    public String username;

    @Value("${spring.security.user.password}")
    public String password;

    @Value("${spring.security.user.roles}")
    public String roles;
}
