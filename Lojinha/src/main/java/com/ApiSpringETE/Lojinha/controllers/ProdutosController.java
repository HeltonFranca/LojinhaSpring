package com.ApiSpringETE.Lojinha.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.ApiSpringETE.Lojinha.models.Produto;
import com.ApiSpringETE.Lojinha.services.*;


@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosRepository repo;

    @GetMapping
    public String mostrarProdutos(Model model) {
        List<Produto> produtos = repo.findAll();
        model.addAttribute("produtos", produtos);
        return "produtos/index";
    }
}