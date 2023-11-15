# Consuming API  

> In this Branch I will be consuming the OMDB API for study purposes.

API:
[OMDB](https://www.omdbapi.com/)

# Classes usadas para consumir a API 

### HttpClient

> Fornece informações de configuração e recurso compartilhamento, para todas as solicitações enviadas através dele.

* pacote java.net.http
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html)

~~~html
<h3> Síncrono </h3>
<div>
 HttpClient client = HttpClient.newBuilder()
        .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
        .build();
   HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
   System.out.println(response.statusCode());
   System.out.println(response.body()); 
</div>
<br>
<h3> Assíncrono </h3>
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

