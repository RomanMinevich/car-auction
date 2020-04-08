package ro.netex.carauction.ad;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("ro.netex.carauction.ad")
public class PostgresConfiguration {

    @Primary
    @Bean
    @ConfigurationProperties("app.datasource.postgres")
    public DataSource postgres() {
        return create().build();
    }
}
