package ro.netex.carauction;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class CarAuctionSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/", "/newAd", "/newAd/add", "/newAd/add/**",
                "/ads", "/ads/**/details",
                "/ads/**/newBid", "/ads/**/newBid/add", "/ads/**/newBid/add/**");
    }
}
