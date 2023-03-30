package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

public class StatsQuestionnaireDTO {

    private static int nbFoisJoue = 0;
    private QuestionnaireDTO questionnaireDTO;


    public StatsQuestionnaireDTO(QuestionnaireDTO quest){
        questionnaireDTO = quest;
    }

    public int getNbFoisJoue() {return nbFoisJoue;}

    public void setNbFoisJoue(int nbFoisJoue) {StatsQuestionnaireDTO.nbFoisJoue = nbFoisJoue;}

    public void incrNbFoisJoue(){StatsQuestionnaireDTO.nbFoisJoue += 1;}

    public QuestionnaireDTO getQuestionnaireDTO() {return questionnaireDTO;}

    public void setQuestionnaireDTO(QuestionnaireDTO questionnaireDTO) {this.questionnaireDTO = questionnaireDTO;}
}
