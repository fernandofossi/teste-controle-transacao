package br.com.fossi.tryout.transactioncontrol.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfiguration {
  @Bean
  OpenAPI apiInfo() {
    return new OpenAPI().info(
        new Info()
            .title("Swagger Petstore")
            .description(
                "This is edited server of Petstore server. Edited from the openapi-generator\n"
                    + "You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). \n"
                    + "You can find out more about Openapi Generator at [https://openapi-generator.tech/](https://openapi-generator.tech/)\n")
            //.termsOfService("http://swagger.io/terms/")
            .contact(new Contact().email("fernandofossi@gmail.com"))
            // .license(new License()
            //     .name("Apache 2.0")
            //     .url("http://www.apache.org/licenses/LICENSE-2.0.html"))
            .version("1.0.0"));
        // .components(
        //     new Components()
        //         .addSecuritySchemes("api_key",
        //             new SecurityScheme().type(SecurityScheme.Type.APIKEY)
        //                 .in(SecurityScheme.In.HEADER).name("api_key"))
        //         .addSecuritySchemes("petstore_auth",
        //             new SecurityScheme().type(SecurityScheme.Type.OAUTH2)));
  }
}
