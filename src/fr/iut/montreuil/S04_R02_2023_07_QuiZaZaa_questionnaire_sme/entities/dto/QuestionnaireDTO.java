package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
	
	private int idQuestionnaire;
	private ArrayList<QuestionDTO> listeQuestions;
	private StatsQuestionnaireDTO stats;

	/*----------------------------------*/
	
	public QuestionnaireDTO(int idQuestionnaire, StatsQuestionnaireDTO stats) {
		this.idQuestionnaire = idQuestionnaire;
		this.listeQuestions = new ArrayList<QuestionDTO>();
		this.stats = stats;
	}
	
	public QuestionnaireDTO(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
		this.listeQuestions = new ArrayList<QuestionDTO>();
		this.stats = new StatsQuestionnaireDTO(this);
	}
	
	/*----------------------------------*/
	
	public StatsQuestionnaireDTO getStats() {
		return stats;
	}
	public void setStats(StatsQuestionnaireDTO stats) {
		this.stats = stats;
	}
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	public ArrayList<QuestionDTO> getListeQuestions() {
		return this.listeQuestions;
	}
	
	/*----------------------------------*/
	
	public void ajouterQuestion(QuestionDTO quest) {
		this.listeQuestions.add(quest);
	}
	


}
