import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ServiceQuestionnaireTest {

    IServiceQuestionnaire serviceQuestionnaire;

    @BeforeEach
    public void init(){

    }

    @Test
    public void recupQuestionnaireOKTest() {
        serviceQuestionnaire = new ServiceQuestionnaireImplMokCasOK();
        ArrayList<QuestionDTO> oui = serviceQuestionnaire.fournirUnQuestionnaire(" ");
        //Assertions.assertEquals();
    }


}
