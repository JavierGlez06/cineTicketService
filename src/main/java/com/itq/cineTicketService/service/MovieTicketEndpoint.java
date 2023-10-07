package com.itq.cineTicketService.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.itq.cineTicketService.dto.*;

@Endpoint
public class MovieTicketEndpoint {
	private static final String NAMESPACE_URI = "http://com.cine";
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "boleto")
	@ResponsePayload
	 public Ack buyTicket(Boleto boleto) {
        // Lógica para comprar un boleto
        Ack ack = new Ack();
        ack.setCode(200);
        ack.setDescription("Boleto comprado exitosamente");
        return ack;
	}
	
	 @PayloadRoot(namespace = NAMESPACE_URI, localPart = "boleto")
	    @ResponsePayload
	    public Ack consultTicket(@RequestPayload Boleto request) {
	        // Implementa la lógica para consultar el boleto y generar una respuesta Ack.
	        Ack ack = new Ack();
	        ack.setCode(200); // Código de éxito
	        ack.setDescription("Boleto consultado con éxito.");
	        return ack;
	    }
}
