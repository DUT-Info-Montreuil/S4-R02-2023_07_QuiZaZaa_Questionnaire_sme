package fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.impl;


import java.util.ArrayList;

import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;


public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

//	@Override
//	public ArrayList<QuestionDTO> fournirUnQuestionnaire(String URL_CSV) { // excepetion si idquestionnaire existe pas {
//		return null;
//	}

	public ArrayList<QuestionDTO> chargerCSV(String URL_CSV) /*throw exception si fichier existe pas*/{
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

	@Override
	public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String URL_CSV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionDTO questionMeilleurTaux(QuestionnaireDTO questionnaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionDTO questionPireTaux(QuestionnaireDTO questionnaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double tauxBonneReponse(QuestionDTO question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void incrementationQuestionnaire(QuestionnaireDTO questionnaire) {
		// TODO Auto-generated method stub
		
	}

}
