package io.github.simaomenezes.sbootexp_security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PasswordMasterAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        var login = authentication.getName();
        var pw = authentication.getCredentials();
        String loginMaster = "master";
        String pwMaster = "master";

        if(loginMaster.equals(login) && pwMaster.equals(pw)){
            return new UsernamePasswordAuthenticationToken(
                    "I am Master", null, List.of(new SimpleGrantedAuthority("ADMIN"))
            );
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
