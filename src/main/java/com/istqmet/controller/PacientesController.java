package com.istqmet.controller;

import com.istqmet.modelo.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacientesController {

    @GetMapping("/registroPacientes")
    public String registroPacientes (Model model) {
        Paciente paciente =new Paciente();
        model.addAttribute("paciente", paciente);
        return "pages/registroPacientes";

    }

    @GetMapping("/vistaPaciente")
    public String vistaPaciente (Model model) {
        Paciente paciente =new Paciente();
        model.addAttribute("paciente", new Paciente());
        return "pages/vistaPaciente";

    }

    @PostMapping("/registrarPacientes")
    public String enviarPaciente(@Valid @ModelAttribute ("paciente") Paciente paciente,
                                 BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("errores", bindingResult.getAllErrors());

            return "pages/registroPacientes";
        } else {

            return "pages/vistaPaciente";
        }

    }

}
