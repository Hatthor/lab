package md.usm.laborator1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class musicDOMParserDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/main/java/md/usm/laborator1/files/music.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Node rootElement = doc.getFirstChild();
            System.out.println("Root element : " + rootElement.getNodeName());

            NodeList firstChildRoot = doc.getElementsByTagName("musics");
            System.out.printf("   First element of root element : " + firstChildRoot.item(0).getNodeName());

            NodeList firstChildmusic = doc.getElementsByTagName("rap");
            System.out.println("      First element of music element : " + firstChildmusic.item(0).getNodeName());

            NodeList musics = doc.getElementsByTagName("musics");
            System.out.println();

            for (int i = 0; i < musics.getLength(); i++) {
                Node music = musics.item(i);
                if (music.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) music;
                    System.out.println("         Type of music object " + (i + 1) + " : "
                            + element.getAttribute("type"));

                    if (element.getAttribute("type").equals("rap")) {
                        NodeList rap = doc.getElementsByTagName("rap");
                        System.out.println("            --------- " + rap.item(0).getNodeName() + " ---------");

                        NodeList eminem = doc.getElementsByTagName("eminem");
                        System.out.println("            a. " + eminem.item(0).getNodeName());

                        NodeList eminemList = doc.getElementsByTagName("song");
                        for (int j = 0; j < eminemList.getLength(); j++) {
                            Node songNode = eminemList.item(j);
                            if (songNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element emusic = (Element) songNode;
                                if(emusic.getAttribute("year") == ""){

                                }else{
                                    System.out.print("               " + (j + 1) + " planet : " + emusic.getTextContent());
                                    System.out.println(" --> satellites : "
                                            + emusic.getAttribute("satellites") + " and type : "
                                            + emusic.getAttribute("type"));
                                }
                            }
                        }
                            System.out.println();
                            NodeList dwarfeminem = doc.getElementsByTagName("dwarf-eminem");
                            System.out.println("            b. " + dwarfeminem.item(0).getNodeName());

                            for (int x = 0; x < eminemList.getLength(); x++) {
                                Node song1Node = eminemList.item(x);
                                if (song1Node.getNodeType() == Node.ELEMENT_NODE) {
                                    Element esong = (Element) song1Node;
                                    if(esong.getAttribute("year") == ""){
                                        System.out.println("               " + (x + 1) + " song : " + esong.getTextContent());
                                    }
                                }
                            }





                    }













                }

            }




            }catch(Exception e){
                e.printStackTrace();
            }

    }
}
