package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.bo.FichierQuestionBO;

public class QuestionBOBuilder {

	private int idQuestionnaire;
	private int idQuestion;
	private String langue;
	private String question;
	private String reponse;
	private int difficulte;
	private String source;
	
	public QuestionBOBuilder withIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
		return this;
	}
	
	public QuestionBOBuilder withIdQuestion (int idQuestion) {
		this.idQuestion = idQuestion;
		return this;
	}
	
	public QuestionBOBuilder withLangue (String langue) {
		this.langue = langue;
		return this;
	}
	
	public QuestionBOBuilder withQuestion (String question) {
		this.question = question;
		return this;
	}
	
	public QuestionBOBuilder withReponse (String reponse) {
		this.reponse = reponse;
		return this;
	}
	
	public QuestionBOBuilder withDifficulte (int difficulte) {
		this.difficulte = difficulte;
		return this;
	}
	
	public QuestionBOBuilder withSource (String source) {
		this.source = source;
		return this;
	}

	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}

	public int getIdQuestion() {
		return idQuestion;
	}
	
	public FichierQuestionBO build() {
		return new FichierQuestionBO(this);
	}

	public String getLangue() {
		return langue;
	}

	public String getQuestion() {
		return question;
	}

	public String getReponse() {
		return reponse;
	}

	public int getDifficulte() {
		return difficulte;
	}

	public String getSource() {
		return source;
	}
	
	
}
