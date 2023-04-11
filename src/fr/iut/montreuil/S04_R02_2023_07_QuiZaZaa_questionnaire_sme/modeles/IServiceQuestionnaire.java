package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles;

import java.util.ArrayList;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.LotStatsDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.exception.QuestionnaireVideException;

public interface IServiceQuestionnaire {

	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires (String URL_CSV);
	public ArrayList<QuestionDTO> chargerCSV (String URL_CSV);

	/*------------------------------------------*/

	public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire) throws QuestionnaireVideException;
	public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire) throws QuestionnaireVideException;
	public double tauxBonneReponse(QuestionDTO question);
	
	/*------------------------------------------*/
	
	public void incrementationQuestionnaire(QuestionnaireDTO questionnaire);
	public void incrementerReponses(int bonneReponse, int mauvaiseReponse, QuestionDTO question);
	public LotStatsDTO FournirStatsQuestionnaire(QuestionnaireDTO questionnaire);
	
	
}
