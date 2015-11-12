package com.malsolo.mercurius.oauth2.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;

/*
 * It's possible to create a ResourceServerConfiguration that extends ResourceServerConfigurerAdapter
 * annotated with @EnableResourceServer
 * See https://github.com/royclarkson/spring-rest-service-oauth/blob/master/src/main/java/hello/OAuth2ServerConfiguration.java
 * It allows you to configure the ResourceServerSecurityConfigurer (with the resourceId, for instance)
 * and HttpSecurity (for assigning roles to paths, i.e., administrating authorization endpints)
 * 
 * The most comprehensive example is at https://github.com/spring-projects/spring-security-oauth/tree/master/samples
 * 
 * But it's possible to use @EnableOAuth2Resource.
 * 
 * The best explanation are at https://github.com/dsyer/spring-security-angular/tree/master/oauth2-vanilla
 * from the blog https://spring.io/blog/2015/02/03/sso-with-oauth2-angular-js-and-spring-security-part-v#changing-the-resource-server
 * (See also https://spring.io/guides/tutorials/spring-security-and-angular-js/)
 * 
 * Don't forget to read the official documentation: http://projects.spring.io/spring-security-oauth/docs/oauth2.html
 * 
 * A similar example is available at https://github.com/livelessons-spring/building-microservices/blob/master/livelessons-security/livelessons-security-sso-resource/src/main/java/demo/SsoResourceApplication.java
 * 
 * @EnableOAuth2Resource is configured by OAuth2ResourceConfiguration that comes with @EnableResourceServer and that
 * configures a ResourceSecurityConfigurer (extends ResourceServerConfigurerAdapter) 
 * if it's not another already configured.
 * 
 * It configures the ResourceServerSecurityConfigurer with an autowired ResourceServerProperties that is
 * a @ConfigurationProperties with the PREFIX "spring.oauth2.resource" containing properties such as
 * clientId, clientSecret, id, userInfoUri, tokenInfoUri, preferTokenInfo.
 * 
 * For usage, see http://docs.spring.io/spring-boot/docs/1.3.0.RC1/reference/htmlsingle/#boot-features-security-oauth2-resource-server
 * 
 * The HttpSecurity just authorizes any request only for authenticated principals. 
 *
 */
@SpringBootApplication
@EnableOAuth2Resource
public class MercuriusSsoResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuriusSsoResourceApplication.class, args);
    }
}
