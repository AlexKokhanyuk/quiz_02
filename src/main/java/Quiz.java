import beans.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

/**
 * User: Kokhaniuk
 * Date: 26.10.2018 14:55
 */
public class Quiz {
    public static void main(String[] args) {
        User user = new beans.User();
        Scanner scan = new Scanner(System.in);
        try {
            File inputFile = new File("questions.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("question");
//            System.out.println("----------------------------");

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

                    int answ = scan.nextInt();

                    switch (answ) {
                        case 1:
                            user.incrThunderClan();
                            break;
                        case 2:
                            user.incrRiverClan();
                            break;
                        case 3:
                            user.incrSkyClan();
                            break;
                        case 4:
                            user.incrWindClan();
                            break;
                        case 5:
                            user.incrShadowClan();
                            break;
                        case 6:
                            user.incrKittyPet();
                            break;
                        case 7:
//                            user.incrThunderClan();
                            break;
                        case 8:
//                            user.incrThunderClan();
                            break;
                        case 9:
//                            user.incrThunderClan();
                            break;
                        default:
                            System.out.println("Please enter number between 1-9");
                            break;

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(user.toString());
    }

}
