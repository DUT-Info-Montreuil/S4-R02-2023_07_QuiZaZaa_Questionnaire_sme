import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;

import java.util.ArrayList;

public class ServiceQuestionnaireImplMokCasOK implements IServiceQuestionnaire {

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String URL_CSV){
        ArrayList<QuestionnaireDTO> reponse = new ArrayList<>();
        reponse.add(new QuestionnaireDTO());
        reponse.add(new QuestionnaireDTO());
        return reponse;
    }



    @Override
    public ArrayList<QuestionDTO> chargerCSV(String URL_CSV) {
        ArrayList<QuestionDTO> questions = new ArrayList<>();
        questions.add(new QuestionDTO(1,0,0,
                1,
                "fr",
                "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?",
                "Badminton",
                "dfdfv",
                1
        ));
        questions.add(new QuestionDTO(2,0,0,
                1,
                "fr",
                "C'est qui le boss ?",
                "Moi",
                "dfdfv",
                1
        ));
        return questions;
    }




}
