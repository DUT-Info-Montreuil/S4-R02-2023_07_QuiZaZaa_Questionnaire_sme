package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
	
	private static int compteurId = 0;
	
	private int idQuestionnaire;
	private ArrayList<QuestionDTO> listeQuestions;
	
	public QuestionnaireDTO() {
		super();
		this.idQuestionnaire = compteurId;
		this.compteurId++;
		this.listeQuestions = new ArrayList<QuestionDTO>();
	}
	
	public int idQuestionnaire() {
		return idQuestionnaire;
	}
	
	public void ajouterQuestion(QuestionDTO quest) {
		this.listeQuestions.add(quest);
	}
	
	public ArrayList<QuestionDTO> getListeQuestions() {
		return this.listeQuestions;
	}
	

}
