package com.algaworks.algafoodfundamentos.di.notificacao;

import com.algaworks.algafoodfundamentos.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
