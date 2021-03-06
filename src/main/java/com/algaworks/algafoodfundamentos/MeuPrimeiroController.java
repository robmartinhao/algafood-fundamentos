package com.algaworks.algafoodfundamentos;

import com.algaworks.algafoodfundamentos.di.modelo.Cliente;
import com.algaworks.algafoodfundamentos.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.println("MeuPrimeiroController" + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        Cliente joao = new Cliente("João", "joao@xyz.com", "11974747474");

        ativacaoClienteService.ativar(joao);

        return "Hello!";
    }
}
