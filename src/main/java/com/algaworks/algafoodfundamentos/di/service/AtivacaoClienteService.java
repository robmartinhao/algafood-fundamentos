package com.algaworks.algafoodfundamentos.di.service;

import com.algaworks.algafoodfundamentos.di.modelo.Cliente;
import com.algaworks.algafoodfundamentos.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private List<Notificador> notificadores;

//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

       for (Notificador notificador: notificadores) {
           notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
       }
    }

//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
