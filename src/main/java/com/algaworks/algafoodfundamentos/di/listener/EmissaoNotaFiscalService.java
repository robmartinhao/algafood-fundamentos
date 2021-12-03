package com.algaworks.algafoodfundamentos.di.listener;

import com.algaworks.algafoodfundamentos.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
    }
}
