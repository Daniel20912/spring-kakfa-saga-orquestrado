package br.com.microservices.orchestrated.orderservice.core.controller;

import br.com.microservices.orchestrated.orderservice.core.document.Event;
import br.com.microservices.orchestrated.orderservice.core.dto.EventFilters;
import br.com.microservices.orchestrated.orderservice.core.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class EventController {

    private final EventService eventService;

    @GetMapping
    public Event findByFilters(EventFilters filters) {
        return eventService.findByFilters(filters);
    }

    @GetMapping("all")
    public List<Event> findAll(){
        return eventService.findAll();
    }
}
