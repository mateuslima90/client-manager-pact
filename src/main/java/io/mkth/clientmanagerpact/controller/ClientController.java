package io.mkth.clientmanagerpact.controller;

import io.mkth.clientmanagerpact.client.ClientManagerClient;
import io.mkth.clientmanagerpact.model.ClientDTO;
import io.mkth.clientmanagerpact.model.Clients;
import io.mkth.clientmanagerpact.model.ClientsResponse;
import io.mkth.clientmanagerpact.service.ClientService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {

    private ClientManagerClient clientManagerClient;

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients/all")
    public Flux<ClientsResponse> getAllClients(@RequestParam("page") int page, @RequestParam("size") int size) {
        return clientService.getAllClients(page, size);
    }

    @GetMapping("/clients/{id}")
    public Mono<Clients> getClientById(@PathVariable("id") String id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/clients/create")
    public Mono<Clients> createClients(@RequestBody ClientDTO clients) {
        return clientService.createClient(clients);
    }

    @DeleteMapping("/clients/{id}")
    public Mono<Clients> deleteClientById(@PathVariable("id") String id) {
        return clientService.deleteClientById(id);
    }
}
