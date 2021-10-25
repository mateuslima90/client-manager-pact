package io.mkth.clientmanagerpact.controller;

import io.mkth.clientmanagerpact.client.ClientManagerClient;
import io.mkth.clientmanagerpact.model.ClientDTO;
import io.mkth.clientmanagerpact.model.Clients;
import io.mkth.clientmanagerpact.model.ClientsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {

    @Autowired
    private ClientManagerClient clientManagerClient;

    @GetMapping("/all")
    public Flux<ClientsResponse> getAllClients(@RequestParam("page") int page, @RequestParam("size") int size) {
        return clientManagerClient.getAllClients(page, size);
    }

    @PostMapping("/create/clients")
    public Mono<Clients> createClients(@RequestBody ClientDTO clients) {
        return clientManagerClient.createClient(clients);
    }
}
