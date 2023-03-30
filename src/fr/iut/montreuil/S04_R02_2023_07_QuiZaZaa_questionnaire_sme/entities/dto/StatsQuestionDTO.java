package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto;

public class StatsQuestionDTO {

    private int nbBonneReponses;
    private int nbMauvaisesReponses;

    public StatsQuestionDTO(int nbBonneReponses, int nbMauvaisesReponses) {
        this.nbBonneReponses = nbBonneReponses;
        this.nbMauvaisesReponses = nbMauvaisesReponses;
    }
    
    /*----------------------------------*/

    public int getNbBonneReponses() {
        return nbBonneReponses;
    }

    public void setNbBonneReponses(int nbBonneReponses) {
        this.nbBonneReponses = nbBonneReponses;
    }

    public int getNbMauvaisesReponses() {
        return nbMauvaisesReponses;
    }

    public void setNbMauvaisesReponses(int nbMauvaisesReponses) {
        this.nbMauvaisesReponses = nbMauvaisesReponses;
    }
	
	/*----------------------------------*/
	
	public void incrementerBonneReponse(int nbBonneReponse) {
		this.nbBonneReponses+= nbBonneReponse;
	}
	
	public void incrementerMauvaiseReponse(int nbMauvaiseReponse) {
		this.nbMauvaisesReponses+= nbMauvaisesReponses;
	}
}
