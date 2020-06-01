## Spring Skeleton

Spring Skeleton is a sample project to showcase the [Spring Elixir Library](https://github.com/pcalouche/springelixir) that uses Spring 
Auto-configuration to help with the configuration of some things.

Spring Elixir provides a status endpoint, standard controller advice exception handling, and Open Api documentation configured.  Running this application and
going to [localhost:8080/swagger-ui.html](localhost:8080/swagger-ui.html) will display the Open Api documentation.  From there you'll see two endpoints:

1. /status - Demonstrates the status endpoint that is auto-configured by Spring Elixir.
1. /exception-test - Demonstrates and endpoint that will throw and exception.  The JSON response returned is derived from the code in Spring Elixir.

