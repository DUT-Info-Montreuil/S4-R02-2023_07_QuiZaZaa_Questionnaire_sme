package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

public class QuestionDTO {

	private int idQuestion;
	private int nbBonneReponses;
	private int nbMauvaisesReponses;
	
	private int idQuestionnaire;
	private String langue;
	private String question;
	private String reponse;
	private String source;
	private int difficulte;

	public QuestionDTO(int idQuestion, int nbBonneReponses, int nbMauvaisesReponses, int idQuestionnaire, String langue,
					   String question, String reponse, String source, int difficulte) {
		this.idQuestion = idQuestion;
		this.nbBonneReponses = nbBonneReponses;
		this.nbMauvaisesReponses = nbMauvaisesReponses;
		this.idQuestionnaire = idQuestionnaire;
		this.langue = langue;
		this.question = question;
		this.reponse = reponse;
		this.source = source;
		this.difficulte = difficulte;
	}

	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public int getNbBonneReponses() {
		return nbBonneReponses;
	}
	public void setNbBonneReponses(int nbBonneReponses) {
		this.nbBonneReponses = nbBonneReponses;
	}
	public int getNbMauvaisesReponses() {
		return nbMauvaisesReponses;
	}
	public void setNbMauvaisesReponses(int nbMauvaisesReponses) {
		this.nbMauvaisesReponses = nbMauvaisesReponses;
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
