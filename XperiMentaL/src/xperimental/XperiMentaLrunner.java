/**
 * 
 */
package xperimental;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 * @author Nick
 * Currently a variation of :
 * https://www.journaldev.com/1191/java-stax-parser-example-read-xml-file
 * 
 * Instead use the example found :
 * https://www.programcreek.com/2011/08/java-parse-xml-by-using-stax/
 * 
 * Second one is much more generic - much better
 */
class XperiMentaLrunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String fileName = ".//xamples/planes.xml";
		List<Plane> planeList = parseXML(fileName);
		for (Plane plane : planeList) {
			System.out.println(plane.toString());
		}

	}

	private static List<Plane> parseXML(String fileName) {
		List<Plane> planeList = new ArrayList<>();
		Plane plane = new Plane();
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
			while(xmlEventReader.hasNext()){
				XMLEvent xmlEvent = xmlEventReader.nextEvent();
				if (xmlEvent.isStartElement()){
					StartElement startElement = xmlEvent.asStartElement();
					if(startElement.getName().getLocalPart().equals("Plane")){
						plane = new Plane();
						//Get the 'id' attribute from Plane element
						Attribute idAttr = startElement.getAttributeByName(new QName("id"));
						if(idAttr != null){
							plane.setId(Integer.parseInt(idAttr.getValue()));
						}
					}
					//set the other varibles from xml elements
					else if(startElement.getName().getLocalPart().equals("year")){
						xmlEvent = xmlEventReader.nextEvent();
						//plane.setYear(Integer.parseInt(xmlEvent.asCharacters().getData()));
						if(startElement.getName().getLocalPart().equals("year")){
							Attribute yearAttr = startElement.getAttributeByName(new QName("year"));
							if(yearAttr != null){
								plane.setId(Integer.parseInt(yearAttr.getValue()));
							}
						}
					}else if(startElement.getName().getLocalPart().equals("make")){
						xmlEvent = xmlEventReader.nextEvent();
						plane.setMake(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("model")){
						xmlEvent = xmlEventReader.nextEvent();
						plane.setModel(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("color")){
						xmlEvent = xmlEventReader.nextEvent();
						plane.setColor(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("description")){
						xmlEvent = xmlEventReader.nextEvent();
						plane.setDescription(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("price")){
						xmlEvent = xmlEventReader.nextEvent();
						plane.setPrice(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("seller")){
						xmlEvent = xmlEventReader.nextEvent();
						plane.setSeller(xmlEvent.asCharacters().getData());
					}else if(startElement.getName().getLocalPart().equals("location")){
						xmlEvent = xmlEventReader.nextEvent();
						System.out.println("parsing location");
						String city = "";
						String state = "";
						if(startElement.getName().getLocalPart().equals("city")){
							xmlEvent = xmlEventReader.nextEvent();
							city = xmlEvent.asCharacters().getData();
						}
						if(startElement.getName().getLocalPart().equals("state")){
							xmlEvent = xmlEventReader.nextEvent();
							state = xmlEvent.asCharacters().getData();
						}
						plane.setLocation(city, state);
					}
					// if Plane end element is reached, add plane object to list
					if(xmlEvent.isEndElement())

					{
						EndElement endElement = xmlEvent.asEndElement();
						if (endElement.getName().getLocalPart().equals("Plane")) {
							planeList.add(plane);
						}
					}}
			}
		}catch(FileNotFoundException|
				XMLStreamException e)
		{
			e.printStackTrace();
		}return planeList;
	}}
