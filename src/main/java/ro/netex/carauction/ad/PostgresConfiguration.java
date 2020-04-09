package ro.netex.carauction.ad;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "ro.netex.carauction.ad",
        entityManagerFactoryRef = "adEntityManagerFactory",
        transactionManagerRef ="adTransactionManager")
public class PostgresConfiguration {

    @Primary
    @Bean
    @ConfigurationProperties("app.datasource.postgres")
    public DataSource postgres() {
        return create().build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean adEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("postgres") DataSource postgres) {
        return builder.dataSource(postgres)
                .packages("ro.netex.carauction.ad")
                .persistenceUnit("ads")
                .build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager adTransactionManager(
            @Qualifier("adEntityManagerFactory") EntityManagerFactory adEntityManagerFactory) {
        return new JpaTransactionManager(adEntityManagerFactory);
    }
}
