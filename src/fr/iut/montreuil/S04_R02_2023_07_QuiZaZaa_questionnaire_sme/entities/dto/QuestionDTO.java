package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.Langues;

public class QuestionDTO {

	private int idQuestion;
	private int idQuestionnaire;
	private Langues langue;
	private StatsQuestionDTO stats;
	private String question;
	private String reponse;
	private String source;
	private int difficulte;
	
	/*----------------------------------*/

	public QuestionDTO(int idQuestion,  int idQuestionnaire, Langues langue, StatsQuestionDTO stats,
					   String question, String reponse, String source, int difficulte) {
		this.idQuestion = idQuestion;
		this.stats = stats;
		this.idQuestionnaire = idQuestionnaire;
		this.langue = langue;
		this.question = question;
		this.reponse = reponse;
		this.source = source;
		this.difficulte = difficulte;
	}
	
	/*----------------------------------*/

	public int getIdQuestion() {
		return idQuestion;
	}
	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}
	public Langues getLangue() {
		return langue;
	}
	public void setLangue(Langues langue) {
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
	public StatsQuestionDTO getStats() {
		return stats;
	}
	public void setStats(StatsQuestionDTO stats) {
		this.stats = stats;
	}
	public int getDifficulte() {
		return difficulte;
	}
	public void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
	}

}
