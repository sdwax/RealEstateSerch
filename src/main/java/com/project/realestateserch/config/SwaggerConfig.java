package com.project.realestateserch.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        ArrayList<Parameter> param = new ArrayList<>();
        param.add(new Parameter()
                .in("query")
                .name("address")
                .required(false)
                .schema(new Schema<>()
                        .type("string")
                        .example("null"))
                .allowEmptyValue(true));
        param.add(new Parameter()
                .in("query")
                .name("numberOfRooms")
                .required(false)
                .schema(new ArraySchema()
                        .name("rooms")
                        .type("integer")
                        .example(0))
                .allowEmptyValue(true));
        param.add(new Parameter()
                .in("query")
                .name("square")
                .required(false)
                .schema(new ArraySchema()
                        .type("integer")
                        .example(0))
                .allowEmptyValue(true));
        param.add(new Parameter()
                .in("query")
                .name("price")
                .required(false)
                .schema(new ArraySchema()
                        .type("integer")
                        .example(0))
                .allowEmptyValue(true));
        param.add(new Parameter()
                .in("query")
                .name("floor")
                .required(false)
                .schema(new ArraySchema()
                        .type("integer")
                        .example(0))
                .allowEmptyValue(true));

        return new OpenAPI()
                .paths(new Paths().addPathItem("/advertisement", new PathItem()
                        .get(new Operation()
                                .parameters(param)
                                .responses(new ApiResponses()
                                        .addApiResponse("200", new ApiResponse()
                                                .description("Ok"))))))
                .info(
                        new Info()
                                .title("Real State Search Swagger Api")
                                .version("1.0.0")
                );
    }
}