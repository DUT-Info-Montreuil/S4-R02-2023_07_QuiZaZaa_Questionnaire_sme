package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
	
	private int idQuestion;
	private ArrayList<QuestionDTO> listeQuestions;
	private StatsQuestionnaireDTO stats;

	public QuestionnaireDTO(StatsQuestionnaireDTO stats) {
		this.stats = stats;
	}

	public StatsQuestionnaireDTO getStats() {
		return stats;
	}

	public void setStats(StatsQuestionnaireDTO stats) {
		this.stats = stats;
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public ArrayList<QuestionDTO> getListeQuestions() {
		return listeQuestions;
	}

	public void setListeQuestions(ArrayList<QuestionDTO> listeQuestions) {
		this.listeQuestions = listeQuestions;
	}
	

}
