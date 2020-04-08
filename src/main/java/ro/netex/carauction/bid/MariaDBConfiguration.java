package ro.netex.carauction.bid;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("ro.netex.carauction.bid")
public class MariaDBConfiguration {

    @Bean
    @ConfigurationProperties("app.datasource.mariadb")
    public DataSource mariaDB() {
        return create().build();
    }
}
