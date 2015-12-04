package me.jeffsutton;

import com.github.underscore.Function1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by jeff on 03/12/2015.
 */
public class SimplePOJO {

    private final String packageName;
    HashMap<String, XClass> classes = new HashMap<>();
    private String rootTageName;

    public SimplePOJO(String packageName) {
        this.packageName = packageName;
    }

    public static void main(String[] argv) {
        String sampleXML2 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "\n" +
                "\n" +
                "<tv source-info-url=\"http://www.schedulesdirect.org/\" source-info-name=\"Schedules Direct\" generator-info-name=\"XMLTV/$Id: tv_grab_na_dd.in,v 1.70 2008/03/03 15:21:41 rmeden Exp $\" generator-info-url=\"http://www.xmltv.org/\">\n" +
                "  <channel id=\"I10436.labs.zap2it.com\">\n" +
                "    <display-name>13 KERA</display-name>\n" +
                "    <display-name>13 KERA TX42822:-</display-name>\n" +
                "    <display-name>13</display-name>\n" +
                "    <display-name>13 KERA fcc</display-name>\n" +
                "    <display-name>KERA</display-name>\n" +
                "    <display-name>KERA</display-name>\n" +
                "    <display-name>PBS Affiliate</display-name>\n" +
                "    <icon src=\"file://C:\\Perl\\site/share/xmltv/icons/KERA.gif\" />\n" +
                "  </channel>\n" +
                "  <channel id=\"I10759.labs.zap2it.com\">\n" +
                "    <display-name>11 KTVT</display-name>\n" +
                "    <display-name>11 KTVT TX42822:-</display-name>\n" +
                "    <display-name>11</display-name>\n" +
                "    <display-name>11 KTVT fcc</display-name>\n" +
                "    <display-name>KTVT</display-name>\n" +
                "    <display-name>KTVT</display-name>\n" +
                "    <display-name>CBS Affiliate</display-name>\n" +
                "    <icon src=\"file://C:\\Perl\\site/share/xmltv/icons/KTVT.gif\" />\n" +
                "  </channel>\n" +
                "  <programme start=\"20080715003000 -0600\" stop=\"20080715010000 -0600\" channel=\"I10436.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">NOW on PBS</title>\n" +
                "    <desc lang=\"en\">Jordan's Queen Rania has made job creation a priority to help curb the staggering unemployment rates among youths in the Middle East.</desc>\n" +
                "    <date>20080711</date>\n" +
                "    <category lang=\"en\">Newsmagazine</category>\n" +
                "    <category lang=\"en\">Interview</category>\n" +
                "    <category lang=\"en\">Public affairs</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP01006886.0028</episode-num>\n" +
                "    <episode-num system=\"onscreen\">427</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <previously-shown start=\"20080711000000\" />\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715010000 -0600\" stop=\"20080715023000 -0600\" channel=\"I10436.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">Mystery!</title>\n" +
                "    <sub-title lang=\"en\">Foyle's War, Series IV: Bleak Midwinter</sub-title>\n" +
                "    <desc lang=\"en\">Foyle investigates an explosion at a munitions factory, which he comes to believe may have been premeditated.</desc>\n" +
                "    <date>20070701</date>\n" +
                "    <category lang=\"en\">Anthology</category>\n" +
                "    <category lang=\"en\">Mystery</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00003026.0665</episode-num>\n" +
                "    <episode-num system=\"onscreen\">2705</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <previously-shown start=\"20070701000000\" />\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715023000 -0600\" stop=\"20080715040000 -0600\" channel=\"I10436.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">Mystery!</title>\n" +
                "    <sub-title lang=\"en\">Foyle's War, Series IV: Casualties of War</sub-title>\n" +
                "    <desc lang=\"en\">The murder of a prominent scientist may have been due to a gambling debt.</desc>\n" +
                "    <date>20070708</date>\n" +
                "    <category lang=\"en\">Anthology</category>\n" +
                "    <category lang=\"en\">Mystery</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00003026.0666</episode-num>\n" +
                "    <episode-num system=\"onscreen\">2706</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <previously-shown start=\"20070708000000\" />\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715040000 -0600\" stop=\"20080715043000 -0600\" channel=\"I10436.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">BBC World News</title>\n" +
                "    <desc lang=\"en\">International issues.</desc>\n" +
                "    <category lang=\"en\">News</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">SH00315789.0000</episode-num>\n" +
                "    <previously-shown />\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715043000 -0600\" stop=\"20080715050000 -0600\" channel=\"I10436.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">Sit and Be Fit</title>\n" +
                "    <date>20070924</date>\n" +
                "    <category lang=\"en\">Exercise</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00003847.0074</episode-num>\n" +
                "    <episode-num system=\"onscreen\">901</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <previously-shown start=\"20070924000000\" />\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715060000 -0600\" stop=\"20080715080000 -0600\" channel=\"I10759.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">The Early Show</title>\n" +
                "    <desc lang=\"en\">Republican candidate John McCain; premiere of the film \"The Dark Knight.\"</desc>\n" +
                "    <date>20080715</date>\n" +
                "    <category lang=\"en\">Talk</category>\n" +
                "    <category lang=\"en\">News</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00337003.2361</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715080000 -0600\" stop=\"20080715090000 -0600\" channel=\"I10759.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">Rachael Ray</title>\n" +
                "    <desc lang=\"en\">Actresses Kim Raver, Brooke Shields and Lindsay Price (\"Lipstick Jungle\"); women in their 40s tell why they got breast implants; a 30-minute meal.</desc>\n" +
                "    <credits>\n" +
                "      <presenter>Rachael Ray</presenter>\n" +
                "    </credits>\n" +
                "    <date>20080306</date>\n" +
                "    <category lang=\"en\">Talk</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00847333.0303</episode-num>\n" +
                "    <episode-num system=\"onscreen\">2119</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <previously-shown start=\"20080306000000\" />\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715090000 -0600\" stop=\"20080715100000 -0600\" channel=\"I10759.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">The Price Is Right</title>\n" +
                "    <desc lang=\"en\">Contestants bid for prizes then compete for fabulous showcases.</desc>\n" +
                "    <credits>\n" +
                "      <director>Bart Eskander</director>\n" +
                "      <producer>Roger Dobkowitz</producer>\n" +
                "      <presenter>Drew Carey</presenter>\n" +
                "    </credits>\n" +
                "    <category lang=\"en\">Game show</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">SH00004372.0000</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "    <rating system=\"VCHIP\">\n" +
                "      <value>TV-G</value>\n" +
                "    </rating>\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715100000 -0600\" stop=\"20080715103000 -0600\" channel=\"I10759.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">Jeopardy!</title>\n" +
                "    <credits>\n" +
                "      <presenter>Alex Trebek</presenter>\n" +
                "    </credits>\n" +
                "    <date>20080715</date>\n" +
                "    <category lang=\"en\">Game show</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00002348.1700</episode-num>\n" +
                "    <episode-num system=\"onscreen\">5507</episode-num>\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "    <rating system=\"VCHIP\">\n" +
                "      <value>TV-G</value>\n" +
                "    </rating>\n" +
                "  </programme>\n" +
                "  <programme start=\"20080715103000 -0600\" stop=\"20080715113000 -0600\" channel=\"I10759.labs.zap2it.com\">\n" +
                "    <title lang=\"en\">The Young and the Restless</title>\n" +
                "    <sub-title lang=\"en\">Sabrina Offers Victoria a Truce</sub-title>\n" +
                "    <desc lang=\"en\">Jeff thinks Kyon stole the face cream; Nikki asks Nick to give David a chance; Amber begs Adrian to go to Australia.</desc>\n" +
                "    <credits>\n" +
                "      <actor>Peter Bergman</actor>\n" +
                "      <actor>Eric Braeden</actor>\n" +
                "      <actor>Jeanne Cooper</actor>\n" +
                "      <actor>Melody Thomas Scott</actor>\n" +
                "    </credits>\n" +
                "    <date>20080715</date>\n" +
                "    <category lang=\"en\">Soap</category>\n" +
                "    <category lang=\"en\">Series</category>\n" +
                "    <episode-num system=\"dd_progid\">EP00004422.1359</episode-num>\n" +
                "    <episode-num system=\"onscreen\">8937</episode-num>\n" +
                "    <audio>\n" +
                "      <stereo>stereo</stereo>\n" +
                "    </audio>\n" +
                "    <subtitles type=\"teletext\" />\n" +
                "    <rating system=\"VCHIP\">\n" +
                "      <value>TV-14</value>\n" +
                "    </rating>\n" +
                "  </programme>\n" +
                "</tv>";

        ;

        try {
            String r = new SimplePOJO("me.jeffsutton").generate(sampleXML2);
            System.out.println(r);
        } catch (Exception eek) {
            eek.printStackTrace();
        }

        try {
            Serializer serializer = new Persister();
            Tv html = serializer.read(Tv.class, sampleXML2);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("\n\n\n" + gson.toJson(html, Tv.class));
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public String generate(String xml) throws ParserConfigurationException, SAXException, IOException {
        Document document = parse(xml);
        rootTageName = stripNS(document.getFirstChild().getNodeName());
        visitClass(document.getFirstChild());

//        ArrayList<String> toRemove = new ArrayList<>();
//        for (Map.Entry<String, XClass> cls : classes.entrySet()) {
//            XClass c = cls.getValue();
//            String key = cls.getKey();
//
//            if (c.fields.size() <= 1 && (c.fields.size() == 0)) {
//                toRemove.add(key);
//            }
//
//        }
//
//        for (Map.Entry<String, XClass> cls : classes.entrySet()) {
//
//            for (Map.Entry<String, XField> f: cls.getValue().fields.entrySet()) {
//                if (toRemove.contains(f.getValue().dataType)) {
//                    f.getValue().dataType = "String";
//                }
//            }
//
//        }
//
//        for (String s: toRemove) {
//            classes.remove(s);
//        }
//
//
//        for (Map.Entry<String, XClass> cls : classes.entrySet()) {
//            boolean hasAttributes = false;
//            int attributeCount = 0;
//            for (Map.Entry<String, XField> f: cls.getValue().fields.entrySet()) {
//                XField fd = f.getValue();
//                if (fd.isAttribute) {
//                    hasAttributes = true;
//                    attributeCount++;
//                }
//            }
//
//        }

        return (generateClassText(classes.get(rootTageName)));
    }

    public Document parse(String xml) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        Document document = db.parse(is);
        return document;
    }

    public String stripNS(String str) {
        if (str.contains(":")) {
            return str.substring(str.indexOf(":") + 1);
        }
        return str;
    }

    public XClass visitClass(Node node) {
        String name = stripNS(node.getNodeName());
        if (!classes.containsKey(name)) {
            XClass cla = new XClass();
            cla.name = name;
            classes.put(name, cla);
        }

        XClass cla = classes.get(name);
        if (node.getAttributes() != null) {
            for (int i = 0; i < node.getAttributes().getLength(); i++) {
                String akey = node.getAttributes().item(i).getNodeName();
                if (akey.contains("xmlns:") || akey.equals("xmlns")) {
                    continue;
                }
                akey = stripNS(akey);

                if (!cla.fields.containsKey(akey)) {
                    XField xf = new XField();
                    xf.name = akey;
                    xf.isInlineList = false;
                    xf.isAttribute = true;
                    cla.fields.put(akey, xf);
                }
                XField xf = cla.fields.get(akey);
                xf.dataType = getLiteralDataType(node.getAttributes().item(i).getNodeValue());
                cla.fields.put(akey, xf);
            }
        }


        Map<String, List<Node>> grouped = groupBy(node.getChildNodes(), new Function1<Node, String>() {


            @Override
            public String apply(Node arg) {
                return arg.getNodeName();
            }
        });

        for (Map.Entry<String, List<Node>> entry : grouped.entrySet()) {
            String key = stripNS(entry.getKey());
            List<Node> nodes = entry.getValue();
            if (key.equals("#text") && node.getChildNodes().getLength() > 1) {
                continue;
            }
            {

                if (!cla.fields.containsKey(key)) {
                    XField field = new XField();
                    field.name = key;
                    cla.fields.put(key, field);
                }

                XField field = cla.fields.get(key);
                if (nodes.size() > 1) {
                    field.isInlineList = true;
                }

                for (Node node1 : nodes) {
                    if (isClass(node1)) {
                        {
                            field.dataType = key;
                            XClass nested = visitClass(node1);

                            if (nested.fields != null && nested.fields.size() == 1 && values(nested.fields).toArray(new XField[1])[0].isInlineList) {
                                classes.remove(nested.name);
                                XField nestedField = values(nested.fields).toArray(new XField[1])[0];
                                field.dataType = nestedField.dataType;
                                field.isList = true;
                            }
                        }
                        if (node1.getAttributes() != null) {
                            for (int i = 0; i < node1.getAttributes().getLength(); i++) {
                                String akey = node.getAttributes().item(i).getNodeName();
                                if (akey.contains("xmlns:") || akey.equals("xmlns")) {
                                    continue;
                                }
                                akey = stripNS(akey);

                                if (!cla.fields.containsKey(akey)) {
                                    XField xf = new XField();
                                    xf.name = akey;
                                    xf.isInlineList = false;
                                    xf.isAttribute = true;
                                    cla.fields.put(akey, xf);
                                }
                                XField xf = cla.fields.get(akey);
                                xf.dataType = getLiteralDataType(node.getAttributes().item(i).getNodeValue());
                                cla.fields.put(akey, xf);
                            }
                        }

                    } else {
                        field.dataType = getLiteralDataType(node.getNodeValue());
                    }
                }


                cla.fields.put(key, field);
            }
        }
        return cla;
    }

    public String generateClassText(XClass cls) {
        String headers = "", root = "", isStatic = "", fields = "", accessors = "", inners = "";

        if (cls.name.equals(rootTageName)) {

            if (packageName != null) {
                headers = "package " + packageName + ";\n\n";
            }

            headers += "\nimport org.simpleframework.xml.Attribute;\n" +
                    "import org.simpleframework.xml.Element;\n" +
                    "import org.simpleframework.xml.Text;\n" +
                    "import org.simpleframework.xml.ElementList;\n" +
                    "import org.simpleframework.xml.Root;\n\n" +
                    "import java.net.URL;\n" +
                    "import java.util.List;\n\n";

            root = "@Root(name=\"" + cls.name + "\")\n";

            for (Map.Entry<String, XClass> cl : classes.entrySet()) {
                if (cl.getValue().name.equals(rootTageName)) {

                } else {
                    inners += "\n\n" + generateClassText(cl.getValue());
                }
            }
        } else {
            isStatic = "static ";
        }

        fields = generateFieldText(cls.fields);
        accessors = generateAccessors(cls.fields);

        return headers + root + "\n\npublic " + isStatic + "class " + mkClassName(cls.name) + " {\n\n" +
                fields + "\n\n" + accessors + inners + "\n}";
    }

    public String generateFieldText(HashMap<String, XField> fields) {
        String str = "";

        for (Map.Entry<String, XField> field : fields.entrySet()) {
            XField f = field.getValue();

            if (f.name.equals("#text")) {
                f.name = "textValue";
                f.dataType = "String";
                f.isInlineList = false;
                f.isList = false;
            }

            String annotation = f.isAttribute ? "@Attribute(name=\"" + f.name + "\", required=false)" : "@Element(name=\"" + f.name + "\", required=false)";
            boolean isClass = classes.containsKey(f.dataType);
            String dataType = isClass ? mkClassName(f.dataType) : f.dataType;

            if (f.isList || f.isInlineList) {
                dataType = "List<" + dataType + ">";

                annotation = "@ElementList(name=\"" + f.name + "\", required=false" + (f.isInlineList ? ", entry=\"" + f.name + "\", inline=true)" : ")");

            }

            if (f.name.equals("textValue")) {
                annotation = "@Text(required=false)";
            }

            str += annotation + "\n" + dataType + " " + mkFieldName(f.name) + ";\n\n";
        }
        return str;
    }

    public String generateAccessors(HashMap<String, XField> fields) {
        String str = "";

        for (Map.Entry<String, XField> field : fields.entrySet()) {
            XField f = field.getValue();
            boolean isClass = classes.containsKey(f.dataType);
            String dataType = isClass ? mkClassName(f.dataType) : f.dataType;
            if (f.isList || f.isInlineList) {
                dataType = "List<" + dataType + ">";
            }

            str += "public " + dataType + " get" + mkFieldName(cap(f.name)) + "() {return this." + mkFieldName(f.name) + ";}\n";
            str += "public void set" + mkFieldName(cap(f.name)) + "(" + dataType + " value) {this." + mkFieldName(f.name) + " = value;}\n\n";
        }
        return str;
    }

    public String mkFieldName(String name) {
        name = getLastDotInList(name);
        name = name.replace("-", "_");
        name = name.replace("#", "");
        return name;
    }

    public String mkClassName(String name) {
        name = getLastDotInList(name);
        name = name.replace("-", "_");
        name = name.replace("#", "");
        return name;
    }

    public String getLastDotInList(String str) {
        if (str.indexOf('.') > -1) {
            String[] sr = str.split("/`./");
            str = "";
            for (int i = 0; i < sr.length; i++) {
                sr[i] = cap(sr[i]);
                str += sr[i];
            }
        } else {
            str = cap(str);
        }
        return str;
    }

    public String cap(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String getLiteralDataType(String nodeValue) {
        if (nodeValue == null) return "String";
        try {
            DateType.getDate(nodeValue);
            return "Date";
        } catch (Exception err) {

        }
        try {
            new URL(nodeValue);
            return "URL";
        } catch (Exception err) {

        }
        if (nodeValue.equals("true") || nodeValue.equals("false")) {
            return "Boolean";
        } else if (isNumeric(nodeValue)) {
            if (nodeValue.contains(".")) {
                return "Double";
            } else {
                try {
                    Integer.parseInt(nodeValue);
                    return "Integer";
                } catch (NumberFormatException err) {
                    return "Long";
                }
            }
        }

        return "String";
    }

    public boolean isNumeric(String value) {
        if (value.contains(" ")) {
            return false;
        }
        try {
            NumberFormat.getInstance().parse(value);
            return true;
        } catch (ParseException e) {
            // Not a number.
            return false;
        }
    }

    public boolean isClass(Node node) {
        int childNodes = 0;
        int attributes = 0;
        boolean isTextOnly = false;

        if (node.getChildNodes() != null && node.getChildNodes().getLength() > 0) {
            childNodes = node.getChildNodes().getLength();
        }

        if (node.getAttributes() != null && node.getAttributes().getLength() > 0) {
            attributes = node.getAttributes().getLength();
        }

        if (node.getChildNodes() != null && node.getChildNodes().getLength() == 1 && node.getChildNodes().item(0).getNodeName().equals("#text") && attributes == 0) {
            isTextOnly = true;
        }

        boolean isC = !isTextOnly;

        return isC;
    }

    public static <String, XField> Collection<XField> values(final Map<String, XField> object) {
        return object.values();
    }

    public static <String, E> Map<String, List<Node>> groupBy(final NodeList iterable, final Function1<Node, String> func) {
        final Map<String, List<Node>> retVal = newLinkedHashMap();
        for (int i = 0; i < iterable.getLength(); i++) {
            Node e = iterable.item(i);
            final String key = func.apply(e);
            List<Node> val;
            if (retVal.containsKey(key)) {
                val = retVal.get(key);
            } else {
                val = newArrayList();
            }
            val.add(e);
            retVal.put(key, val);
        }
        return retVal;
    }

    @SuppressWarnings("unchecked")
    protected static <K, E> Map<K, E> newLinkedHashMap() {
        return new LinkedHashMap<K, E>();
    }

    @SuppressWarnings("unchecked")
    protected static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }


}
