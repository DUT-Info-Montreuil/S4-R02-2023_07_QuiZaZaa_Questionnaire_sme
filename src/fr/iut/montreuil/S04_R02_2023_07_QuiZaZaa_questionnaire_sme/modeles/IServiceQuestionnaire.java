package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles;

import java.util.ArrayList;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;

public interface IServiceQuestionnaire {

	public ArrayList<QuestionDTO> fournirListeQuestionnaire(String URL_CSV);
	
}
