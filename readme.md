There are several ways to build REST API invokers(Consumers/client) in java and some of those are
java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection (for SSL), Jersey, RESTEasy, Restlet, RestTemplate, FeignClient and WebClient.


What is API ?
API is a Application Programming Interface and which is a way to communicate between different software services over internet.
Different types of APIs are used in programming hardware and software, including operating systemAPIs, remote APIs and web APIs.
A web API or web service API is a set of tools that allow developers to send and receive instructions and data between a web server and a web browser usually in JSON format to build applications.


About RestTemplate,
The RestTemplate is the Spring class for client-side HTTP access and map the response for you. It is a synchronous REST client performing HTTP requests using a simple template-style API. It uses JDK HttpURLConnection and Apache HttpComponents under the hood.
We can get RestTemplate class from spring-web dependency.

```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>6.0.2</version>
</dependency>

```

If you are using Spring boot then we can import all necessary dependencies by including the spring-boot-starter-web dependency.

You can easily build RestTemplate bean using this with timeout configurations.

```

@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {
 return builder
  .setConnectTimeout(Duration.ofMillis(3000))
  .setReadTimeout(Duration.ofMillis(3000))
  .build();
}

```

RestTemplate provides higher-level methods and each methods which make it easy to invoke RESTful services.

getForEntity(): executes a GET request and returns an object of ResponseEntity class that contains both the status code and the resource as an object.

getForObject() : similar to getForEntity(), but returns the resource object directly.

postForObject() : creates a new resource using HTTP POST method and returns an entity.

postForLocation(): creates a new resource using the HTTP POST method and returns the location of the newly created resource.

delete(url) — deletes the resource at the specified URL.

put(url, request) — PUTs the given request object to the URL.

exchange(url, httpMethod, requestEntity, responseType) — execute the specified HTTP method, such as GET, POST, PUT, etc, and return the response as ResponseEntity.

execute(url, httpMethod, requestCallback, responseExtractor) — execute the httpMethod to the given URI template, prepare the request with the RequestCallback, and read the response with a ResponseExtractor.



To retrive/consume data, I have used online/live data response which has been exposed by github.

```
https://api.github.com/users/amila

```

About FeignClient,
The Feign client is a another REST client that makes writing web clients easier. When we using the Feign, we have to define only the interfaces and annotate them accordingly. The actual web client implementation is then provided by Spring at runtime. Behind the scenes, the @FeignClient makes a synchronous HTTP requests and it is based on thread-per-request architectural decision and design.

Why we use FeignClient instead of RestTemplate ?
The main reason is minimize our effort of coding. Besides that
FeignClient depend on abstractions, not on concretions. It means, coding to interfaces, not to concrete classes. Furthermore when you are using Feign Client you don’t depend on concrete class/implementation.
In here you are using interface and Spring Boot knows that you are need here HTTP call, so it did that for you without interfering you about how it dose or do that.

But if you use RestTemplate and later on Spring team decides that they need to change some RestTemplate method signatures to add some value to the class. Definetly they have to support backward compatibility but in case you need to catch up the latest updates and you have to make changes to your code and test it again and deploy it.
So I think FeignClient is best alternative to RestTemplate.

You can find FeignClient via below mvn dependency.

```
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-openfeign</artifactId>
   <version>3.1.2</version>
  </dependency>

```

To enable the FeignClient in your application you have to mainly specify two things.
@EnableFeignClients : To apply at starter class @FeignClient(name=”ApplicationName”) : To define an interface for a Consumer