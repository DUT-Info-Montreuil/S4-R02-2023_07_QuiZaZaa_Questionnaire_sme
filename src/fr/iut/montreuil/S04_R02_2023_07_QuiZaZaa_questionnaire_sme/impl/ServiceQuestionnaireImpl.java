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
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.exception.QuestionnaireVideException;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.QuestionBOBuilder;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

	@Override
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String URL_CSV) {
		return null;
	}

	@Override
	public ArrayList<QuestionDTO> chargerCSV(String URL_CSV) {
		//		Path pathToFile = Paths.get(URL_CSV);
		//
		//		FichierQuestionBO question;
		//		ArrayList<FichierQuestionBO> listeQuestions = new ArrayList<FichierQuestionBO>();
		//
		//		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
		//            String line = br.readLine();  //Read the first line from the text file
		//            while (line != null) {  // loop until all lines are read
		//            	String arguments[] = line.split(";");
		//            	//if manque un argument ?
		//            	// if to parse int fonctionne pas
		//            	question = new QuestionBOBuilder()
		//            			.withIdQuestionnaire(Integer.parseInt(arguments[1]))
		//            			.withIdQuestion(Integer.parseInt(arguments[2]))
		//            			.withLangue(arguments[3])
		//            			.withQuestion(arguments[4])
		//            			.withReponse(arguments[5])
		//            			.withDifficulte(Integer.parseInt(arguments[6]))
		//            			.withSource(arguments[7])
		//            			.build();
		//            	listeQuestions.add(question);
		//                line = br.readLine(); //read next line before looping, if end of file reached, line would be null
		//            }
		//
		//        } catch (IOException ioe) {
		//            ioe.printStackTrace();
		//        }
		//
		//		return listeQuestions;
		return null;
	}

	/*--------*/

	@Override
	public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire) throws QuestionnaireVideException {
		ArrayList<QuestionDTO> list = questionnaire.getListeQuestions();
		QuestionDTO mQ = null;
		if (list.isEmpty()) {
			throw new QuestionnaireVideException();
		} else {
			mQ = list.get(0);
			for (QuestionDTO q : list){
				if (tauxBonneReponse(q) > tauxBonneReponse(mQ))
					mQ = q;
			}
		}
		return mQ;
	}

	@Override
	public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire) throws QuestionnaireVideException {
		ArrayList<QuestionDTO> list = questionnaire.getListeQuestions();
		QuestionDTO pQ = null;
		if (list.isEmpty()) {
			throw new QuestionnaireVideException();
		} else {
			pQ = list.get(0);
			for (QuestionDTO q : list){
				if (tauxBonneReponse(q) < tauxBonneReponse(pQ))
					pQ = q;
			}
		}
		return pQ;
	}

	@Override
	public double tauxBonneReponse(QuestionDTO question) {
		int bonneReponse = question.getStats().getNbBonneReponses();
		int mauvaiseReponse = question.getStats().getNbMauvaisesReponses();
		double total = bonneReponse+mauvaiseReponse;
		return bonneReponse/total;
	}

	@Override
	public void incrementationQuestionnaire(QuestionnaireDTO questionnaire) {
		questionnaire.getStats().incrementationNbFoisJoue(1);
	}
}
