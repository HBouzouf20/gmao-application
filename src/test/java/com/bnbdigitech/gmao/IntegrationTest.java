package com.bnbdigitech.gmao;

import com.bnbdigitech.gmao.config.AsyncSyncConfiguration;
import com.bnbdigitech.gmao.config.EmbeddedElasticsearch;
import com.bnbdigitech.gmao.config.EmbeddedKafka;
import com.bnbdigitech.gmao.config.EmbeddedSQL;
import com.bnbdigitech.gmao.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterGmaoApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
