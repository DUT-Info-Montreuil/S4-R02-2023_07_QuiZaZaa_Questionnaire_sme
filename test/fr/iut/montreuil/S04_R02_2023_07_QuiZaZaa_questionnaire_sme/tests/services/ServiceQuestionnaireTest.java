package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.tests.services;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.impl.ServiceQuestionnaireImpl;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceQuestionnaireTest {

    private IServiceQuestionnaire serviceQuestionnaire;

    @BeforeEach
    public void init(){
    	this.serviceQuestionnaire = new ServiceQuestionnaireImpl();
    }

//    @Test
//    public void recupQuestionnaireOKTest() {
//        serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
//        ArrayList<QuestionnaireDTO> bien =
//                serviceQuestionnaire.fournirListeQuestionnaires("e");
//
//
//        assertIterableEquals(bien, serviceQuestionnaire.fournirListeQuestionnaires("e"));
//    }
    
    /*------------------------------------------*/
    
    // Questionnaire DTO mal foutu, pas de constructeur, nom id bizzare, devrait y avoir constructeur sans rien plus une méthode ajouter question
    
    @Test
    public void questionnaireVide() {
//    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasVide();
    	
    	QuestionnaireDTO questionnaireVide = new QuestionnaireDTO();

//    	this.serviceQuestionnaire.questionMeilleurTaux();
//    	this.serviceQuestionnaire.questionPireTaux();
    	
    	//Exception?
    }
    
    @Test
    public void questionAucuneReponse() {
//    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasVide();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(0,0);
    	QuestionDTO q1 = new QuestionDTO(1, 1, "fr", statsQ1, "q1", "r1", "s1", 1);
    	
//    	this.serviceQuestionnaire.tauxBonneReponse(q1);
    	//Exception?
    }
    
    @Test
    public void uneDesDeuxStatsQuestionVide() {
//    	this.serviceQuestionnaire = new ();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(5,0);
    	QuestionDTO q1 = new QuestionDTO(1, 1, "fr", statsQ1, "q1", "r1", "s1", 1);
    	
    	StatsQuestionDTO statsQ2 = new StatsQuestionDTO(0,5);
    	QuestionDTO q2 = new QuestionDTO(2, 1, "fr", statsQ1, "q1", "r1", "s1", 1);
    	
//    	assertEquals(1, this.serviceQuestionnaire.tauxBonneReponse(q1));
//    	assertEquals(0, this.serviceQuestionnaire.tauxBonneReponse(q2));
    }
    
    @Test
    public void questionnaireNormal() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
    	
    	QuestionnaireDTO questionnaireOK = new QuestionnaireDTO();
    	
    	// Meilleur Taux
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(5,0);
    	QuestionDTO q1 = new QuestionDTO(1, questionnaireOK.idQuestionnaire(), "fr", statsQ1, "q1", "r1", "s1", 1);
    	
    	StatsQuestionDTO statsQ2 = new StatsQuestionDTO(250, 5);
    	QuestionDTO q2 = new QuestionDTO(2, questionnaireOK.idQuestionnaire(), "fr", statsQ2, "q2", "r2", "s2", 1);
    	
    	// Pire Taux
    	StatsQuestionDTO statsQ3 = new StatsQuestionDTO(0,1);
    	QuestionDTO q3 = new QuestionDTO(3, questionnaireOK.idQuestionnaire(), "fr", statsQ3, "q3", "r3", "s3", 1);
    	
    	
    	StatsQuestionDTO statsQ4 = new StatsQuestionDTO(5,2);
    	QuestionDTO q4 = new QuestionDTO(4, questionnaireOK.idQuestionnaire(), "fr", statsQ4, "q4", "r4", "s4", 1);
    	
    	StatsQuestionDTO statsQ5 = new StatsQuestionDTO(10,5);
    	QuestionDTO q5 = new QuestionDTO(5, questionnaireOK.idQuestionnaire(), "fr", statsQ5, "q5", "r5", "s5", 1);
    	
    	questionnaireOK.ajouterQuestion(q1);
    	questionnaireOK.ajouterQuestion(q2);
    	questionnaireOK.ajouterQuestion(q3);
    	questionnaireOK.ajouterQuestion(q4);
    	questionnaireOK.ajouterQuestion(q5);
    	
    	assertEquals(q1, this.serviceQuestionnaire.questionMeilleurTaux(questionnaireOK));
    	assertEquals(q3, this.serviceQuestionnaire.questionPireTaux(questionnaireOK));
    }
    
    @Test
    public void questionNormal() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(10,90);
    	QuestionDTO q1 = new QuestionDTO(1, 1, "fr", statsQ1, "q1", "r1", "s1", 1);
    	
    	assertEquals(0.1, this.serviceQuestionnaire.tauxBonneReponse(q1));
    }
    
    @Test
    public void questionnaireMemeTaux() {
//    	this.serviceQuestionnaire = new ();
    	
    	QuestionnaireDTO questionnaireMemeTaux = new QuestionnaireDTO();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(5,5);
    	QuestionDTO q1 = new QuestionDTO(1, questionnaireMemeTaux.idQuestionnaire(), "fr", statsQ1, "q1", "r1", "s1", 1);
    	
    	StatsQuestionDTO statsQ2 = new StatsQuestionDTO(1, 1);
    	QuestionDTO q2 = new QuestionDTO(2, questionnaireMemeTaux.idQuestionnaire(), "fr", statsQ2, "q2", "r2", "s2", 1);
    	
    	StatsQuestionDTO statsQ3 = new StatsQuestionDTO(7,7);
    	QuestionDTO q3 = new QuestionDTO(3, questionnaireMemeTaux.idQuestionnaire(), "fr", statsQ3, "q3", "r3", "s3", 1);
    	
    	questionnaireMemeTaux.ajouterQuestion(q1);
    	questionnaireMemeTaux.ajouterQuestion(q2);
    	questionnaireMemeTaux.ajouterQuestion(q3);
    	
    	// ????
    	
    }
    
}