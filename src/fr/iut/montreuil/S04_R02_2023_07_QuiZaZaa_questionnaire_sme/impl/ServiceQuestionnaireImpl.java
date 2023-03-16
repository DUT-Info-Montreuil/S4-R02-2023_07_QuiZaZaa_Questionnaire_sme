package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.bo.FichierQuestionBO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.QuestionBOBuilder;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {
    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String URL_CSV) {
        return null;
    }

    @Override
    public ArrayList<QuestionDTO> chargerCSV(String URL_CSV) {
        return null;
    }

    @Override
    public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire) {
        ArrayList<QuestionDTO> list = questionnaire.getListeQuestions();
        QuestionDTO mQ;
        if(list.isEmpty()) {mQ = null;}
        else {mQ = list.get(0);}

        for (QuestionDTO q : list){
            if (tauxBonneReponse(q) > tauxBonneReponse(mQ))
                mQ = q;
        }
        return mQ;
    }

    @Override
    public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire) {
        ArrayList<QuestionDTO> list = questionnaire.getListeQuestions();
        QuestionDTO pQ;
        if(list.isEmpty()) {pQ = null;}
        else {pQ = list.get(0);}

        for (QuestionDTO q : list){
            if (tauxBonneReponse(q) < tauxBonneReponse(pQ))
                pQ = q;
        }
        return pQ;
    }

    @Override
    public double tauxBonneReponse(QuestionDTO question) {
        int bonneReponse = question.getStats().getNbBonneReponses();
        int mauvaiseReponse = question.getStats().getNbMauvaisesReponses();
        return bonneReponse/(bonneReponse+mauvaiseReponse);
    }

    @Override
    public void incrementationQuestionnaire(QuestionnaireDTO questionnaire) {

    }
}
