package dao;

import beans.Question;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Kokhaniuk
 * on 09.11.2018 16:36
 */
public abstract class questionsXML implements questionsDao {
    private List<Question> questionList;


    public List<Question> listQuestionns() {

        try {
            File inputFile = new File("questions.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("question");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
//                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Question number : "
                            + eElement.getAttribute("quesno"));

                    System.out.println("Question : "
                            + eElement.getAttribute("body"));

                    System.out.println("1 : "
                            + eElement
                            .getElementsByTagName("thunderClan")
                            .item(0)
                            .getTextContent());
                    System.out.println("2 : "
                            + eElement
                            .getElementsByTagName("riverClan")
                            .item(0)
                            .getTextContent());
                    System.out.println("3 : "
                            + eElement
                            .getElementsByTagName("skyClan")
                            .item(0)
                            .getTextContent());
                    System.out.println("4 : "
                            + eElement
                            .getElementsByTagName("windClan")
                            .item(0)
                            .getTextContent());
                    System.out.println("5 : "
                            + eElement
                            .getElementsByTagName("shadowClan")
                            .item(0)
                            .getTextContent());
                    System.out.println("6 : "
                            + eElement
                            .getElementsByTagName("kittyPet")
                            .item(0)
                            .getTextContent());


                }
            }


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
