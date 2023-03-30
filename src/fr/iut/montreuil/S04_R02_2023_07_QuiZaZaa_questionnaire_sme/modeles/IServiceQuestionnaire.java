package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles;

import java.util.ArrayList;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;

public interface IServiceQuestionnaire {

	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires (String URL_CSV);
	public ArrayList<QuestionDTO> chargerCSV (String URL_CSV);

	/*------------------------------------------*/

	public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire);
	public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire);
	public double tauxBonneReponse(QuestionDTO question);
	public void incrementationQuestionnaire(QuestionnaireDTO questionnaire);
	
	
}
