package br.com.correios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.correios.dto.LogradouroDTO;
import br.com.correios.repository.LogradouroRepository;

@Controller
@RequestMapping("/buscaCaixaPostal")
public class BuscaCaixaPostalController {

	@Autowired
	private LogradouroRepository logradouroRepository;
	
	@GetMapping
	public String buscaCaixaPostal() {
		return "BuscaCaixaPostal";
	}

	@GetMapping(value="/resultadoBusca")
	public ModelAndView resultadoBuscaCaixaPostal(@RequestParam("parametro") String parametro, RedirectAttributes attributes) {
		List<LogradouroDTO> logradouros = logradouroRepository.buscaPorNomeLogradouroOulocalidadeUf (parametro);
	
		
		if(parametro.equals("")) {
		ModelAndView mv = new ModelAndView("redirect:/buscaCaixaPostal");
		attributes.addFlashAttribute("mensagem", "O campo de busca é obrigatório!");
		
		return mv; 
		

		}
		
		
		
		ModelAndView mv = new ModelAndView("ResultadoBuscaCaixaPostal");
		mv.addObject("logradouros", logradouros);
		
		
		
		if(logradouros.isEmpty()) {
			mv.addObject("mensagem", "A BUSCA NÃO RETORNOU DADOS!");
		}else {
			mv.addObject("mensagem", "DADOS ENCONTRADOS COM SUCESSO!");
		}
		
 		return mv;
	}
}
