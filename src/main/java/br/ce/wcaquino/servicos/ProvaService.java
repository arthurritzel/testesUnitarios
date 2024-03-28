package br.ce.wcaquino.servicos;


import static org.junit.Assert.assertEquals;



import org.junit.Test;


import br.ce.wcaquino.entidades.Prova;


public class ProvaService {
	
	public float CalcularMedia(Prova p1, Prova p2, Prova p3) {
		float media = (p1.getNota() + p2.getNota() + p3.getNota()) / 3;
		
		return media;
	}
	
	@Test
	public void teste_media_aprovado() {
		//cenario
		ProvaService provaService = new ProvaService();
		Prova prova1 = new Prova(7);
		Prova prova2 = new Prova(8);
		Prova prova3 = new Prova(9);
		
		
		//acao
		String status = "";
		float media = provaService.CalcularMedia(prova1, prova2, prova3);
		if(media >= 7) {
			status = "Aprovado";
		}else if(media >= 4 && media < 7) {
			status = "2 oportunidade";
		}else if(media < 4) {
			status = "Reprovado";
		}
		
		//validacao
		assertEquals(status, "Aprovado");
	}
	
	@Test
	public void teste_media_2oportunidade() {
		//cenario
		ProvaService provaService = new ProvaService();
		Prova prova1 = new Prova(4);
		Prova prova2 = new Prova(4);
		Prova prova3 = new Prova(4);
		
		
		//acao
		String status = "";
		float media = provaService.CalcularMedia(prova1, prova2, prova3);
		System.out.println(media);
		if(media >= 7) {
			status = "Aprovado";
		}else if(media >= 4 && media < 7) {
			status = "2 oportunidade";
		}else if(media < 4) {
			status = "Reprovado";
		}
		
		//validacao
		assertEquals(status, "2 oportunidade");
	}
	
	@Test
	public void teste_media_reprovado() {
		//cenario
		ProvaService provaService = new ProvaService();
		Prova prova1 = new Prova(2);
		Prova prova2 = new Prova(2);
		Prova prova3 = new Prova(2);
		
		
		//acao
		String status = "";
		float media = provaService.CalcularMedia(prova1, prova2, prova3);
		if(media >= 7) {
			status = "Aprovado";
		}else if(media >= 4 && media < 7) {
			status = "2 oportunidade";
		}else if(media < 4) {
			status = "Reprovado";
		}
		
		//validacao
		assertEquals(status, "Reprovado");
	}
}





