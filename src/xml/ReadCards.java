package xml;

import javax.xml.parsers.*; 
import org.w3c.dom.*; 
import org.xml.sax.*; 

import java.awt.List;
import java.io.*; 
import java.util.Iterator;

import common.Card;
import common.CardsList;
import common.Logs;

public class ReadCards {
	
	public static void readCardsInXML(){
		File folder = new File("xml/cards");
		Logs.logger.info("Searching for cards XML files in "+folder.getPath());
		FilenameFilter xmlFilter = new XMLFilter();
		String[] xmlFiles = folder.list(xmlFilter);
		if (xmlFiles.length > 0){
			String xmlFilesList="";
			for (int i = 0 ; i<xmlFiles.length ; i++){xmlFilesList+=" "+xmlFiles[i];}
			Logs.logger.info(xmlFiles.length+" XML files found:"+xmlFilesList);
			for (int i = 0 ; i<xmlFiles.length ; i++){
				readXML(new File("xml/cards/" + xmlFiles[i]));
			}
		}
		else{
			Logs.logger.error("no XML files found!");
		}
		
	}
	
	private static void readXML(File xmlFile){
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder constructor = factory.newDocumentBuilder();
            Document document = constructor.parse(xmlFile);
            Element root = document.getDocumentElement();

            NodeList cardList = root.getElementsByTagName("card");

            for (int i = 0 ; i < cardList.getLength() ; i++){
            	Element e = (Element)cardList.item(i);
            	//if(e.hasAttribute("id")){Logs.logger.info("new card: "+e.getAttribute("id"));}
            	CardsList.add(xmlToCard(e));
            }

		
		}catch(ParserConfigurationException pce){
			Logs.logger.error("Erreur de configuration du parseur DOM");
			Logs.logger.error("lors de l'appel à fabrique.newDocumentBuilder();");
        }catch(SAXException se){
        	Logs.logger.error("Erreur lors du parsing du document");
        	Logs.logger.error("lors de l'appel à construteur.parse(xml)");
        }catch(IOException ioe){
        	Logs.logger.error("Erreur d'entrée/sortie");
        	Logs.logger.error("lors de l'appel à construteur.parse(xml)");
        }
	}	
	
	private static Card xmlToCard(Element e){
		Card card=new Card();
		
		card.setCardtext(e.getAttribute("cardtext"));
		card.setCost(e.getAttribute("cost"));
		card.setName(e.getAttribute("name"));
		card.setId(e.getAttribute("id"));
		card.setType(e.getAttribute("type"));
		card.setRarity(e.getAttribute("rarity"));
		
		return card;
	}
}
