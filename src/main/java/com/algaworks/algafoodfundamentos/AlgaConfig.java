package com.algaworks.algafoodfundamentos;

import com.algaworks.algafoodfundamentos.di.notificacao.NotificadorEmail;
import com.algaworks.algafoodfundamentos.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Essa classe foi separada em duas: NotificacaoConfig e ServiceConfig

//@Configuration
public class AlgaConfig {

//    @Bean
//    public NotificadorEmail notificadorEmail() {
//        NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
//        notificador.setCaixaAlta(true);
//
//        return notificador;
//    }
//
//    @Bean
//    public AtivacaoClienteService ativacaoClienteService() {
//        return new AtivacaoClienteService(notificadorEmail());
//    }
}
