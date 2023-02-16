import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;

import java.util.ArrayList;

public class ServiceQuestionnaireImplMokCasOK implements IServiceQuestionnaire {

    @Override
    public ArrayList<QuestionDTO> fournirUnQuestionnaire(String URL_CSV) {
        ArrayList<QuestionDTO> reponse = new ArrayList<>();
        reponse.add(new QuestionDTO(1,1, 3, 1, "fr",
                "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?",
                "Tee","https://Wikipedia.org", 1));
        return reponse;
    }
}
