package com.tetra.desafiotetra.model;

import java.time.LocalDateTime;

public class Projecao {
	private String localidade;
	private LocalDateTime horario;
	private PeriodoMedio periodoMedio;

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public PeriodoMedio getPeriodoMedio() {
		return periodoMedio;
	}

	public void setPeriodoMedio(PeriodoMedio periodoMedio) {
		this.periodoMedio = periodoMedio;
	}

}
