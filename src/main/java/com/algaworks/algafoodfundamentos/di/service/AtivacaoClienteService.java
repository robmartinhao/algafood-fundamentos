package com.algaworks.algafoodfundamentos.di.service;

import com.algaworks.algafoodfundamentos.di.modelo.Cliente;
import com.algaworks.algafoodfundamentos.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

//    @Qualifier("sms")
    @Qualifier("email")
    @Autowired
    private Notificador notificador;

//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

           notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
