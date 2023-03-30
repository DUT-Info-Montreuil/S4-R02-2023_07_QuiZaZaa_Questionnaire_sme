package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.tests.services;

import java.util.ArrayList;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.exception.QuestionnaireVideException;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;

public class ServiceQuestionnaireImplMokCasVide implements IServiceQuestionnaire  {

	@Override
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String URL_CSV) {
		return null;
	}
	@Override
	public ArrayList<QuestionDTO> chargerCSV(String URL_CSV) {
		return null;
	}

	
	/*-------------------------*/
	
	@Override
	public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire) throws QuestionnaireVideException {
		throw new QuestionnaireVideException();
	}

	@Override
	public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire) throws QuestionnaireVideException {
		throw new QuestionnaireVideException();
	}

	@Override
	public double tauxBonneReponse(QuestionDTO question) {
		int nbBon = question.getStats().getNbBonneReponses();
		int nbMauv = question.getStats().getNbMauvaisesReponses();
		if (nbBon == 0 && nbMauv == 0)
			return 0;
		else if (nbBon == 5 && nbMauv ==0)
			return 1;
		else
			return 0;
	}

	@Override
	public void incrementationQuestionnaire(QuestionnaireDTO questionnaire) {
		// TODO Auto-generated method stub
		
	}

}
