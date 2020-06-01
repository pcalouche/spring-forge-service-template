package com.pcalouche.springskeleton.controller;

import com.pcalouche.springelixir.exception.JsonExceptionResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionTestController {

    @Operation(description = "Demonstrates exception handling provided Spring Elixir's auto configuration.")
    @ApiResponse(responseCode = "500",
            description = "If an unexpected runtime exception occurs which it " +
                    "always will in this example.",
            content = @Content(schema = @Schema(implementation = JsonExceptionResponse.class))
    )
    @GetMapping("/exception-test")
    public String exceptionTest() {
        // This will produce json output of the exception as formatted in Standard Controller Advice
        throw new RuntimeException("Exception should be caught be Standard Controller Advice");
    }
}
