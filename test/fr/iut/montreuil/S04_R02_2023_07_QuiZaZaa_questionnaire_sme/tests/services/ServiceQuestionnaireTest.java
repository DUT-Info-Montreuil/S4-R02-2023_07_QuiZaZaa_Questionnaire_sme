package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.tests.services;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.exception.QuestionnaireVideException;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.impl.ServiceQuestionnaireImpl;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.Langues;

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
    
    @Test
    public void questionnaireVide() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasVide();
  
    	QuestionnaireDTO questionnaireVide = new QuestionnaireDTO(1);

    	assertThrows(QuestionnaireVideException.class, () -> {
    		this.serviceQuestionnaire.questionMeilleurTaux(questionnaireVide);
    	});
    	assertThrows(QuestionnaireVideException.class, () -> {
    		this.serviceQuestionnaire.questionPireTaux(questionnaireVide);
    	});
    	
    }
    
    @Test
    public void questionAucuneReponse() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasVide();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(0,0);
    	QuestionDTO q1 = new QuestionDTO(1, 1, Langues.FRANCAIS, statsQ1, "q1", "r1", "s1", 1);
    	
    	assertEquals(0, serviceQuestionnaire.tauxBonneReponse(q1));
    }
    
    @Test
    public void uneDesDeuxStatsQuestionVide() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasVide();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(5,0);
    	QuestionDTO q1 = new QuestionDTO(1, 1, Langues.FRANCAIS, statsQ1, "q1", "r1", "s1", 1);
    	
    	StatsQuestionDTO statsQ2 = new StatsQuestionDTO(0,4);
    	QuestionDTO q2 = new QuestionDTO(2, 1, Langues.FRANCAIS, statsQ2, "q2", "r2", "s2", 1);
    	
    	assertEquals(1, this.serviceQuestionnaire.tauxBonneReponse(q1));
    	assertEquals(0, this.serviceQuestionnaire.tauxBonneReponse(q2));
    }
    
    @Test
    public void questionnaireNormal() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
    	
    	QuestionnaireDTO questionnaireOK = new QuestionnaireDTO(1);
    	
    	// Meilleur Taux
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(5,0);
    	QuestionDTO q1 = new QuestionDTO(1, questionnaireOK.getIdQuestionnaire(), Langues.FRANCAIS, statsQ1, "q1", "r1", "s1", 1);
    	
    	StatsQuestionDTO statsQ2 = new StatsQuestionDTO(250, 5);
    	QuestionDTO q2 = new QuestionDTO(2, questionnaireOK.getIdQuestionnaire(), Langues.FRANCAIS, statsQ2, "q2", "r2", "s2", 1);
    	
    	// Pire Taux
    	StatsQuestionDTO statsQ3 = new StatsQuestionDTO(0,1);
    	QuestionDTO q3 = new QuestionDTO(3, questionnaireOK.getIdQuestionnaire(), Langues.FRANCAIS, statsQ3, "q3", "r3", "s3", 1);
    	
    	
    	StatsQuestionDTO statsQ4 = new StatsQuestionDTO(5,2);
    	QuestionDTO q4 = new QuestionDTO(4, questionnaireOK.getIdQuestionnaire(), Langues.FRANCAIS, statsQ4, "q4", "r4", "s4", 1);
    	
    	StatsQuestionDTO statsQ5 = new StatsQuestionDTO(10,5);
    	QuestionDTO q5 = new QuestionDTO(5, questionnaireOK.getIdQuestionnaire(), Langues.FRANCAIS, statsQ5, "q5", "r5", "s5", 1);
    	
    	questionnaireOK.ajouterQuestion(q1);
    	questionnaireOK.ajouterQuestion(q2);
    	questionnaireOK.ajouterQuestion(q3);
    	questionnaireOK.ajouterQuestion(q4);
    	questionnaireOK.ajouterQuestion(q5);
    	
    	try {
			assertEquals(q1, this.serviceQuestionnaire.questionMeilleurTaux(questionnaireOK));
			assertEquals(q3, this.serviceQuestionnaire.questionPireTaux(questionnaireOK));
		} catch (QuestionnaireVideException e) {
			assertEquals(0,1,"Erreur dans conception test \"questionnaireNormal\"");
		}
    	
    }
    
    @Test
    public void questionNormal() {
    	this.serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(10,90);
    	QuestionDTO q1 = new QuestionDTO(1, 1, Langues.FRANCAIS, statsQ1, "q1", "r1", "s1", 1);
    	
    	assertEquals(0.1, this.serviceQuestionnaire.tauxBonneReponse(q1));
    }
    
    @Test
    public void questionnaireMemeTaux() {
//    	this.serviceQuestionnaire = new ();
    	
    	QuestionnaireDTO questionnaireMemeTaux = new QuestionnaireDTO(1);
    	
    	StatsQuestionDTO statsQ1 = new StatsQuestionDTO(5,5);
    	QuestionDTO q1 = new QuestionDTO(1, questionnaireMemeTaux.getIdQuestionnaire(), Langues.FRANCAIS, statsQ1, "q1", "r1", "s1", 1);
    	
    	StatsQuestionDTO statsQ2 = new StatsQuestionDTO(1, 1);
    	QuestionDTO q2 = new QuestionDTO(2, questionnaireMemeTaux.getIdQuestionnaire(), Langues.FRANCAIS, statsQ2, "q2", "r2", "s2", 1);
    	
    	StatsQuestionDTO statsQ3 = new StatsQuestionDTO(7,7);
    	QuestionDTO q3 = new QuestionDTO(3, questionnaireMemeTaux.getIdQuestionnaire(), Langues.FRANCAIS, statsQ3, "q3", "r3", "s3", 1);
    	
    	questionnaireMemeTaux.ajouterQuestion(q1);
    	questionnaireMemeTaux.ajouterQuestion(q2);
    	questionnaireMemeTaux.ajouterQuestion(q3);
    	
    	// ????
    	
    }
    
}