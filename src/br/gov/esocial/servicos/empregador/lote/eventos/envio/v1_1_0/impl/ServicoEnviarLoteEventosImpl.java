package br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.impl;

import javax.jws.WebService;

import br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.EnviarLoteEventos.LoteEventos;
import br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.EnviarLoteEventosResponse;
import br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.ServicoEnviarLoteEventos;

@WebService(serviceName = "ServicoEnviarLoteEventos", endpointInterface = "br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.ServicoEnviarLoteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0")
public class ServicoEnviarLoteEventosImpl implements ServicoEnviarLoteEventos {
	public EnviarLoteEventosResponse.EnviarLoteEventosResult enviarLoteEventos(LoteEventos loteEventos) {
		System.out.println("[eSocial] - Lote recebido com sucesso!");
		return null;
	}
}