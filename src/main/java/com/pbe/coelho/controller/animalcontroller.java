package com.pbe.coelho.controller;

import com.pbe.coelho.model.Animal;
import com.pbe.coelho.repository.animalrepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class animalcontroller {

    private final animalrepository repository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/animal/listagem")
    public String listagem(Model model) {
        model.addAttribute("animais", repository.findAll());
        return "listagem";
    }

    // Cadastro
    @GetMapping("/animal/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("animal", new Animal());
        return "cadastro";
    }

    // Alteração usando o mesmo template
    @GetMapping("/animal/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("animal",
                repository.findById(id).orElseThrow());
        return "cadastro";
    }

    // Salva ou atualiza
    @PostMapping("/animal/salvar")
    public String salvar(@Valid Animal animal, BindingResult result) {

        if (result.hasErrors())
            return "cadastro";

        repository.save(animal); // insere ou atualiza
        return "redirect:/animal/listagem";
    }

    @GetMapping("/animal/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/animal/listagem";
    }
}

