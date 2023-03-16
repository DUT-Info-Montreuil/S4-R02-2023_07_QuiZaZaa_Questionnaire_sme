//import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
//import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
//import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ServiceQuestionnaireTest {
//
//    private IServiceQuestionnaire serviceQuestionnaire;
//
//    @BeforeEach
//    public void init(){
//
//    }
//
//    @Test
//    public void recupQuestionnaireOKTest() {
//        serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
//        ArrayList<QuestionnaireDTO> bien =
//                serviceQuestionnaire.fournirListeQuestionnaires("e");
//
//
//        assertIterableEquals(bien, serviceQuestionnaire.fournirListeQuestionnaires("e"));
//    }
//}