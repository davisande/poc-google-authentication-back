package com.geekdev.pocgoogleauthentication;

import com.geekdev.pocgoogleauthentication.client.GoogleFitClient;
import com.geekdev.pocgoogleauthentication.model.DataSource;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class LoginController {
//    private final GoogleFitClient googleFitClient;

    private final OAuth2AuthorizedClientService authorizedClientService;

//    @GetMapping("/")
//    public String login(Authentication authentication) {
//        final OAuth2AuthorizedClient oAuth2AuthorizedClient = this.authorizedClientService
//                .loadAuthorizedClient("google", authentication.getName());
//
//        final OAuth2AccessToken accessToken = oAuth2AuthorizedClient.getAccessToken();
//
//        return "index";
//    }

    @GetMapping("/")
    public Map<String, Object> login(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
//        final String token = ((DefaultOidcUser) oAuth2AuthenticationToken.getPrincipal())
//                .getIdToken().getTokenValue();
//
//        final List<DataSource> dataSources = googleFitClient.getDataSources(token);

        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }

}
