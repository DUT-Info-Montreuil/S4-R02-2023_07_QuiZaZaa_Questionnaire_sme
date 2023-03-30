package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.bo;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.QuestionBOBuilder;

public class FichierQuestionBO {
	
	private int idQuestionnaire;
	private int idQuestion;
	private String langue;
	private String question;
	private String reponse;
	private int difficulte;
	private String source;
	
	public FichierQuestionBO(int idQuestionnaire, int idQuestion, String langue, String question, String reponse,
			int difficulte, String source) {
		super();
		this.idQuestion = idQuestion;
		this.idQuestionnaire = idQuestionnaire;
		this.langue = langue;
		this.question = question;
		this.reponse = reponse;
		this.source = source;
		this.difficulte = difficulte;
	}
	
	public FichierQuestionBO(QuestionBOBuilder questB) {
		this.idQuestionnaire=questB.getIdQuestionnaire();
		this.idQuestion=questB.getIdQuestion();
		this.langue=questB.getLangue();
		this.question=questB.getQuestion();
		this.reponse=questB.getReponse();
		this.difficulte=questB.getDifficulte();
		this.source=questB.getSource();
	}
	
	public int getIdQuestion() {
		return idQuestion;
	}
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getDifficulte() {
		return difficulte;
	}
	public void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
	}
	
	

}
