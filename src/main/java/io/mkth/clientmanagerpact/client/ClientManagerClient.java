package io.mkth.clientmanagerpact.client;

import io.mkth.clientmanagerpact.model.ClientDTO;
import io.mkth.clientmanagerpact.model.Clients;
import io.mkth.clientmanagerpact.model.ClientsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class ClientManagerClient {

    @Qualifier("managerClient")
    @Autowired
    private WebClient clientManagerClient;

    public Flux<ClientsResponse> getAllClients(int page, int size) {
        return clientManagerClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/clients")
                        .queryParam("page", page)
                        .queryParam("size", size)
                        .build())
                .retrieve()
                .bodyToFlux(ClientsResponse.class);
    }

    public Mono<Clients> createClient(ClientDTO clients) {
        return clientManagerClient
                .post()
                .uri("/clients/clients")
                .bodyValue(clients)
                .retrieve()
                .bodyToMono(Clients.class);
    }

    public Mono<Clients> getClientById(String id) {
        return clientManagerClient
                .get()
                .uri("/clients/{id}", id)
                .retrieve()
                .bodyToMono(Clients.class);
    }

    public Mono<Clients> deleteClientById(String id) {
        return clientManagerClient
                .delete()
                .uri("/clients/{id}", id)
                .retrieve()
                .bodyToMono(Clients.class);
    }
}
