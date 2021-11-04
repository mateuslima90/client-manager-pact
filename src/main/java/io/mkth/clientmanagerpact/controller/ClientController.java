package io.mkth.clientmanagerpact.controller;

import io.mkth.clientmanagerpact.model.ClientDTO;
import io.mkth.clientmanagerpact.model.Clients;
import io.mkth.clientmanagerpact.model.ClientsResponse;
import io.mkth.clientmanagerpact.service.ClientService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public Flux<ClientsResponse> getAllClients(@RequestParam(name = "page", required = false, defaultValue = "0") int page,
                                               @RequestParam(name = "size", required = false, defaultValue = "20") int size) {
        return clientService.getAllClients(page, size);
    }

    @GetMapping("/clients/{id}")
    public Mono<Clients> getClientById(@PathVariable("id") String id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/clients")
    public Mono<Clients> createClients(@Valid @RequestBody ClientDTO clients) {
        return clientService.createClient(clients);
    }

    @DeleteMapping("/clients/{id}")
    public Mono<Clients> deleteClientById(@PathVariable("id") String id) {
        return clientService.deleteClientById(id);
    }
}
