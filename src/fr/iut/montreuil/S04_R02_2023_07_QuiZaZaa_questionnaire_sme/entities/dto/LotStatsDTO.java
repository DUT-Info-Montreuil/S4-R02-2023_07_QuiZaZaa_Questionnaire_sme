package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class LotStatsDTO {
	
	private StatsQuestionnaireDTO statQuestionnaire;
	private ArrayList<StatsQuestionDTO> statsQuestionDTO;
	
	/*----------------------------------*/
	
	public LotStatsDTO(StatsQuestionnaireDTO statQuestionnaire, ArrayList<StatsQuestionDTO> statsQuestionDTO) {
		super();
		this.statQuestionnaire = statQuestionnaire;
		this.statsQuestionDTO = statsQuestionDTO;
	}
	
	/*----------------------------------*/

	public StatsQuestionnaireDTO getStatQuestionnaire() {
		return statQuestionnaire;
	}

	public void setStatQuestionnaire(StatsQuestionnaireDTO statQuestionnaire) {
		this.statQuestionnaire = statQuestionnaire;
	}

	public ArrayList<StatsQuestionDTO> getStatsQuestionDTO() {
		return statsQuestionDTO;
	}

	public void setStatsQuestionDTO(ArrayList<StatsQuestionDTO> statsQuestionDTO) {
		this.statsQuestionDTO = statsQuestionDTO;
	}
	
	
	
	
}
