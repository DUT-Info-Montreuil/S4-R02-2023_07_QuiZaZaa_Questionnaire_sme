package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

public class StatsQuestionnaireDTO {

    private int nbFoisJoue;
    private QuestionnaireDTO questionnaireDTO;

    /*----------------------------------*/

    public StatsQuestionnaireDTO(QuestionnaireDTO quest){
        questionnaireDTO = quest;
        this.nbFoisJoue=0;
    }
    
    /*----------------------------------*/

    public int getNbFoisJoue() {
    	return this.nbFoisJoue;
    }

    public void setNbFoisJoue(int nbFoisJoue) {
    	this.nbFoisJoue = nbFoisJoue;
    }

    public QuestionnaireDTO getQuestionnaireDTO() {
    	return questionnaireDTO;
    }

    public void setQuestionnaireDTO(QuestionnaireDTO questionnaireDTO) {
    	this.questionnaireDTO = questionnaireDTO;
    }
    
    /*----------------------------------*/
    
    public void incrementationNbFoisJoue(int nombreIncr) {
    	this.nbFoisJoue+=nombreIncr;
    }
}
