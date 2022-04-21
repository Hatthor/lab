package md.usm.laborator1;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class musicCreateXMLDom {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.newDocument();

            Element rootElement = doc.createElement("playlist");
            doc.appendChild(rootElement);

            // 1 child of document
            Element musics = doc.createElement("musics");
            rootElement.appendChild(musics);

                // 1 child of musics
                Element rap = doc.createElement("rap");
                musics.appendChild(rap);

                    // 1 child of rap
                    Element musics1 = doc.createElement("musics");
                    // setting attribute to celestial object 1
                    Attr attr1 = doc.createAttribute("type");
                    attr1.setValue("new_school");
                    musics1.setAttributeNode(attr1);
                    musics1.appendChild(doc.createTextNode("new_school"));
                    rap.appendChild(musics1);


                    // 2 child of rap
                    Element musics2 = doc.createElement("musics");
                    // setting attribute to celestial object 2
                    Attr attr2 = doc.createAttribute("type");
                    attr2.setValue("old_school");
                    musics2.setAttributeNode(attr2);
                    rap.appendChild(musics2);

                        // 1 child of musics2
                        Element old_school = doc.createElement("old_school");
                        musics2.appendChild(old_school);

                            // 1 child of old_school
                            Element eminem = doc.createElement("eminem");
                            old_school.appendChild(eminem);

                                // 1 child of eminem
                                Element song1 = doc.createElement("song");
                                Attr attrP1 = doc.createAttribute("year");
                                attrP1.setValue("2010");
                                song1.setAttributeNode(attrP1);
                                Attr attrP11 = doc.createAttribute("type");
                                song1.appendChild(doc.createTextNode("am_not_afraid"));
                                eminem.appendChild(song1);

                                // 2 child of bigPlanet
                                Element song2 = doc.createElement("song");
                                Attr attrP2 = doc.createAttribute("year");
                                attrP2.setValue("2004");
                                song2.setAttributeNode(attrP2);
                                Attr attrP22 = doc.createAttribute("type");
                                song2.appendChild(doc.createTextNode("lose_yourself"));
                                eminem.appendChild(song2);

                                // 3 child of bigPlanet
                                Element song3 = doc.createElement("song");
                                Attr attrP3 = doc.createAttribute("year");
                                attrP3.setValue("2020");
                                song3.setAttributeNode(attrP3);
                                Attr attrP33 = doc.createAttribute("type");
                                song3.appendChild(doc.createTextNode("godzila"));
                                eminem.appendChild(song3);

                                // 4 child of bigPlanet
                                Element song4 = doc.createElement("song");
                                Attr attrP4 = doc.createAttribute("year");
                                attrP4.setValue("2013");
                                song4.setAttributeNode(attrP4);
                                Attr attrP44 = doc.createAttribute("type");
                                song4.appendChild(doc.createTextNode("rap_god"));
                                eminem.appendChild(song4);
                       //2 child of old school
                          Element snoop_dog = doc.createElement("snoop_dog");
                          musics2.appendChild(old_school);
                             //1 child of snoop_dog

            Element songr1 = doc.createElement("songr");
            Attr attrA1 = doc.createAttribute("year");
            attrA1.setValue("2005");
            songr1.setAttributeNode(attrA1);
            Attr attrA11 = doc.createAttribute("type");
            songr1.appendChild(doc.createTextNode("gangsta_zoon"));
            eminem.appendChild(songr1);

            //child 2 of snoop_dog
            Element songr2 = doc.createElement("songr");
            Attr attrA2 = doc.createAttribute("year");
            attrA2.setValue("2001");
            songr2.setAttributeNode(attrA2);
            Attr attrA22 = doc.createAttribute("type");
            songr2.appendChild(doc.createTextNode("beautiful"));
            eminem.appendChild(songr2);

            //child 3 of snoop_dog

            Element songr3 = doc.createElement("songr");
            Attr attrA3 = doc.createAttribute("year");
            attrA3.setValue("2006");
            songr3.setAttributeNode(attrA3);
            Attr attrA33 = doc.createAttribute("type");
            songr3.appendChild(doc.createTextNode("vato"));
            eminem.appendChild(songr3);





            //write content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/main/java/md/usm/laborator1/files/astronomy.xml"));
            transformer.transform(source, result);

            //output to console for testing
            //StreamResult condoleResult = new StreamResult(System.out);
            //transformer.transform(source, condoleResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
