package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RecuperarSenhaController {

	
	// método para mapear qual é a página que o controlador
			// irá abrir / gerenciar no projeto
			@RequestMapping(value = "recuperarsenha") // página raiz do projeto
			public ModelAndView recuperarSenha() {

				// definir qual é a página que será acessada pelo controlador
				// WEB-INF/views/acessarconta.jsp
				ModelAndView modelAndView = new ModelAndView("recuperarsenha");
				return modelAndView;
			}

		}


