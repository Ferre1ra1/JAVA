# Consuming API  

> In this Branch I will be consuming the OMDB API for study purposes.

API:
[OMDB](https://www.omdbapi.com/)

## Classes used to consume the API 

### HttpClient

>It provides configuration and sharing information for all requests sent through it.

* pacote java.net.http
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html)

~~~html
<h3> Sync </h3>
<div>
 HttpClient client = HttpClient.newBuilder()
        .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
        .build();
   HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
   System.out.println(response.statusCode());
   System.out.println(response.body()); 
</div>
<br>
<h3> Async </h3>
<div>
   HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://foo.com/"))
        .POST(BodyPublishers.ofFile(Paths.get("file.json")))
        .build();
   client.sendAsync(request, BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenAccept(System.out::println); 
</div>
~~~
### HttpRequest

> HTTP defines a set of request methods to indicate the desired action to be performed for a given resource.

* pacote java.net.http
[HttpRequest](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.html)

~~~html
<h3> GET Request </h3>
<div>
 HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create("http://foo.com/"))
         .build();
   client.sendAsync(request, BodyHandlers.ofString())
         .thenApply(HttpResponse::body)
         .thenAccept(System.out::println)
         .join(); 
</div>
~~~~
### HttpResponse

> This class provides methods for accessing the response status code, headers, the response body and the response correspondent.

* pacote java.net.http
[HttpResponse](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html)

~~~html
<div>  HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString()); </div>
~~~

