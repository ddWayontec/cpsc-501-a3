import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

import java.util.IdentityHashMap;

public class Serializer {
    private Document document;
    private IdentityHashMap<Object, Integer> identityHashMap = new IdentityHashMap<>();
    private int id = 0;

    public Document serialize(Object obj) {
        document = new Document();
        document.setRootElement(new Element("serialized"));
        serializeObject(obj);
        return document;
    }

    private void serializeObject(Object obj) {
        Integer id = getOrCreateId(obj);

        Element objElement = createObjectElement(obj, id);

        if (obj.getClass().isArray()) {
            objElement
        }


    }

    private Element createObjectElement(Object obj, Integer id) {
        Element element = new Element("object");
        element.setAttribute(new Attribute("class", obj.getClass().getName()));
        element.setAttribute(new Attribute("id", id.toString()));
        return element;
    }

    private Integer getOrCreateId(Object obj) {
        int tempId = id;
        if (identityHashMap.containsKey(obj)) {
            return identityHashMap.get(obj);
        }
        else {
            identityHashMap.put(obj, tempId);
            id++;
            return tempId;
        }
    }
}
