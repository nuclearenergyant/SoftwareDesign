package util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

    public static Object getidea() {
        // TODO Auto-generated method stub
        String Ideacard=null;
        //创建DocumentBuilderFactory
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder=dbf.newDocumentBuilder();
            Document document= dBuilder.parse(new File("AbstractModel.xml"));

            //获得idea
            NodeList nl=document.getElementsByTagName("ClassName");
            Node ideaNode=nl.item(0).getFirstChild();
            String idea_no=ideaNode.getNodeValue().trim();

            Class c=Class.forName(idea_no);
            Object object=c.newInstance();
            return object;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };

        return null;
    }
}

