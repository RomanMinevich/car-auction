package ro.netex.carauction.bid;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "ro.netex.carauction.bid",
        entityManagerFactoryRef = "bidEntityManagerFactory",
        transactionManagerRef ="bidTransactionManager")
public class MariaDBConfiguration {

    @Bean
    @ConfigurationProperties("app.datasource.mariadb")
    public DataSource mariaDb() {
        return create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean bidEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("mariaDb") DataSource mariaDb) {
        return builder.dataSource(mariaDb)
                .packages("ro.netex.carauction.bid")
                .persistenceUnit("bids")
                .build();
    }

    @Bean
    public PlatformTransactionManager bidTransactionManager(
            @Qualifier("bidEntityManagerFactory") EntityManagerFactory bidEntityManagerFactory) {
        return new JpaTransactionManager(bidEntityManagerFactory);
    }
}
