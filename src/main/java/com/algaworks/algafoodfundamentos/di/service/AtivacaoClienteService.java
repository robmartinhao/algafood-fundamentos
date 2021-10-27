package com.algaworks.algafoodfundamentos.di.service;

import com.algaworks.algafoodfundamentos.di.modelo.Cliente;
import com.algaworks.algafoodfundamentos.di.notificacao.NivelUrgencia;
import com.algaworks.algafoodfundamentos.di.notificacao.Notificador;
import com.algaworks.algafoodfundamentos.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

           notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
