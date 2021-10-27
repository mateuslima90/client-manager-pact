package io.mkth.clientmanagerpact.service;

import io.mkth.clientmanagerpact.client.ClientManagerClient;
import io.mkth.clientmanagerpact.model.ClientDTO;
import io.mkth.clientmanagerpact.model.Clients;
import io.mkth.clientmanagerpact.model.ClientsResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    private ClientManagerClient clientManagerClient;

    public ClientService(ClientManagerClient clientManagerClient) {
        this.clientManagerClient = clientManagerClient;
    }

    public Mono<Clients> getClientById(String id) {
        return clientManagerClient.getClientById(id)
                .onErrorResume(e -> Mono.error(ClassNotFoundException::new));
    }

    public Flux<ClientsResponse> getAllClients(int page, int size) {
        return clientManagerClient.getAllClients(page, size)
                .onErrorResume(e -> Mono.error(ClassNotFoundException::new));
    }

    public Mono<Clients> createClient(ClientDTO clientDTO) {
        return clientManagerClient.createClient(clientDTO);
    }

    public Mono<Clients> deleteClientById(String id) {
        return clientManagerClient.deleteClientById(id);
    }

    private Boolean validationInputPageAndSize(int page, int size) {
        return true;
    }
}
