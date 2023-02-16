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
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S04_R02_2023_07_QuiZaZaa_questionnaire_sme.modeles.QuestionBOBuilder;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

	@Override
	public ArrayList<QuestionDTO> fournirUnQuestionnaire(String URL_CSV) { // excepetion si idquestionnaire existe pas {
		return null;
	}
	
	public ArrayList<FichierQuestionBO> chargerCSV(String URL_CSV) /*throw exception si fichier existe pas*/{
		Path pathToFile = Paths.get(URL_CSV);
		
		FichierQuestionBO question;
		ArrayList<FichierQuestionBO> listeQuestions = new ArrayList<FichierQuestionBO>();
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
            String line = br.readLine();  //Read the first line from the text file
            while (line != null) {  // loop until all lines are read
            	String arguments[] = line.split(";");
            	//if manque un argument ?
            	// if to parse int fonctionne pas
            	question = new QuestionBOBuilder()
            			.withIdQuestionnaire(Integer.parseInt(arguments[1]))
            			.withIdQuestion(Integer.parseInt(arguments[2]))
            			.withLangue(arguments[3])
            			.withQuestion(arguments[4])
            			.withReponse(arguments[5])
            			.withDifficulte(Integer.parseInt(arguments[6]))
            			.withSource(arguments[7])
            			.build();
            	listeQuestions.add(question);
                line = br.readLine(); //read next line before looping, if end of file reached, line would be null
            }
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

		return listeQuestions;

	}

}
