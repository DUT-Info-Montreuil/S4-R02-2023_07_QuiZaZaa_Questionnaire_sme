package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.tests.services;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.LotStatsDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.StatsQuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;

import java.util.ArrayList;

public class ServiceQuestionnaireImplMokCasOK implements IServiceQuestionnaire {

	
    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String URL_CSV){
//        ArrayList<QuestionnaireDTO> reponse = new ArrayList<>();
//        reponse.add(new QuestionnaireDTO());
//        reponse.add(new QuestionnaireDTO());
//        return reponse;
    	return null;
    }



    @Override
    public ArrayList<QuestionDTO> chargerCSV(String URL_CSV) {
//        ArrayList<QuestionDTO> questions = new ArrayList<>();
//        questions.add(new QuestionDTO(1,0,0,
//                1,
//                "fr",
//                "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?",
//                "Badminton",
//                "dfdfv",
//                1
//        ));
//        questions.add(new QuestionDTO(2,0,0,
//                1,
//                "fr",
//                "C'est qui le boss ?",
//                "Moi",
//                "dfdfv",
//                1
//        ));
//        return questions;
    	return null;
    }

    /*------------------------------------------*/
    


	@Override
	public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire) {	
		return questionnaire.getListeQuestions().get(0);
	}

	@Override
	public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire) {
		return questionnaire.getListeQuestions().get(2);
	}

	@Override
	public double tauxBonneReponse(QuestionDTO question) {
		return 0.1;
	}

	@Override
	public void incrementationQuestionnaire(QuestionnaireDTO questionnaire) {
		//Trivial
	}



	@Override
	public void incrementerReponses(int bonneReponse, int mauvaiseReponse, QuestionDTO question) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public LotStatsDTO FournirStatsQuestionnaire(QuestionnaireDTO questionnaire) {
		// TODO Auto-generated method stub
		return null;
	}


	

   
    




}
