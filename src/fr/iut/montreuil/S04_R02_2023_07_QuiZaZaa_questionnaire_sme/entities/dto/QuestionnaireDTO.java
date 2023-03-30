package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
	
	private static int compteurId = 0;
	
	private int idQuestionnaire;
	private ArrayList<QuestionDTO> listeQuestions;
	private StatsQuestionnaireDTO stats;

	public QuestionnaireDTO(StatsQuestionnaireDTO stats) {
		this.idQuestionnaire = compteurId;
		this.compteurId++;
		this.listeQuestions = new ArrayList<QuestionDTO>();
		this.stats = stats;
	}

	public StatsQuestionnaireDTO getStats() {
		return stats;
	}

	public void setStats(StatsQuestionnaireDTO stats) {
		this.stats = stats;
	}
	
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	
	public void ajouterQuestion(QuestionDTO quest) {
		this.listeQuestions.add(quest);
	}
	
	public ArrayList<QuestionDTO> getListeQuestions() {
		return this.listeQuestions;
	}
	

}
