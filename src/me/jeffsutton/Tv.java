package me.jeffsutton;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.net.URL;
import java.util.List;

@Root(name = "tv")
public class Tv {

    @ElementList(name = "programme", required = false, entry = "programme", inline = true)
    List<Programme> programme;

    @Attribute(name = "generator-info-name", required = false)
    String generatorInfoName;

    @Attribute(name = "generator-info-url", required = false)
    String generatorInfoUrl;

    @ElementList(name = "channel", required = false, entry = "channel", inline = true)
    List<Channel> channel;

    @Attribute(name = "source-info-name", required = false)
    String sourceInfoName;

    public List<Programme> getProgramme() {
        return this.programme;
    }

    public void setProgramme(List<Programme> value) {
        this.programme = value;
    }

    public String getGeneratorInfoName() {
        return this.generatorInfoName;
    }

    public void setGeneratorInfoName(String value) {
        this.generatorInfoName = value;
    }

    public String getGeneratorInfoUrl() {
        return this.generatorInfoUrl;
    }

    public void setGeneratorInfoUrl(String value) {
        this.generatorInfoUrl = value;
    }

    public List<Channel> getChannel() {
        return this.channel;
    }

    public void setChannel(List<Channel> value) {
        this.channel = value;
    }

    public String getSourceInfoName() {
        return this.sourceInfoName;
    }

    public void setSourceInfoName(String value) {
        this.sourceInfoName = value;
    }

    public static class Programme {

        @Attribute(name = "stop", required = false)
        String stop;

        @ElementList(name = "category", required = false, entry = "category", inline = true)
        List<Category> category;

        @Element(name = "title", required = false)
        Title title;

        @Element(name = "desc", required = false)
        Desc desc;

        @Element(name = "star-rating", required = false)
        StarRating starRating;

        @Attribute(name = "start", required = false)
        String start;

        @ElementList(name = "episode-num", required = false, entry = "episode-num", inline = true)
        List<EpisodeNum> episodeNum;

        @Element(name = "length", required = false)
        Length length;

        @Element(name = "credits", required = false)
        Credits credits;

        @Element(name = "sub-title", required = false)
        SubTitle subTitle;

        @Element(name = "date", required = false)
        String date;

        @Attribute(name = "channel", required = false)
        String channel;

        public String getStop() {
            return this.stop;
        }

        public void setStop(String value) {
            this.stop = value;
        }

        public List<Category> getCategory() {
            return this.category;
        }

        public void setCategory(List<Category> value) {
            this.category = value;
        }

        public Title getTitle() {
            return this.title;
        }

        public void setTitle(Title value) {
            this.title = value;
        }

        public Desc getDesc() {
            return this.desc;
        }

        public void setDesc(Desc value) {
            this.desc = value;
        }

        public StarRating getStarRating() {
            return this.starRating;
        }

        public void setStarRating(StarRating value) {
            this.starRating = value;
        }

        public String getStart() {
            return this.start;
        }

        public void setStart(String value) {
            this.start = value;
        }

        public List<EpisodeNum> getEpisodeNum() {
            return this.episodeNum;
        }

        public void setEpisodeNum(List<EpisodeNum> value) {
            this.episodeNum = value;
        }

        public Length getLength() {
            return this.length;
        }

        public void setLength(Length value) {
            this.length = value;
        }

        public Credits getCredits() {
            return this.credits;
        }

        public void setCredits(Credits value) {
            this.credits = value;
        }

        public SubTitle getSubTitle() {
            return this.subTitle;
        }

        public void setSubTitle(SubTitle value) {
            this.subTitle = value;
        }

        public String getDate() {
            return this.date;
        }

        public void setDate(String value) {
            this.date = value;
        }

        public String getChannel() {
            return this.channel;
        }

        public void setChannel(String value) {
            this.channel = value;
        }

    }

    public static class Category {

        @Text(required = false)
        String textValue;

        @Attribute(name = "lang", required = false)
        String lang;

        public String getTextValue() {
            return this.textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

        public String getLang() {
            return this.lang;
        }

        public void setLang(String value) {
            this.lang = value;
        }

    }

    public static class Title {

        @Text(required = false)
        String textValue;

        @Attribute(name = "lang", required = false)
        String lang;

        public String getTextValue() {
            return this.textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

        public String getLang() {
            return this.lang;
        }

        public void setLang(String value) {
            this.lang = value;
        }

    }

    public static class Desc {

        @Text(required = false)
        String textValue;

        @Attribute(name = "lang", required = false)
        String lang;

        public String getTextValue() {
            return this.textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

        public String getLang() {
            return this.lang;
        }

        public void setLang(String value) {
            this.lang = value;
        }

    }

    public static class StarRating {

        @Element(name = "value", required = false)
        String value;

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public static class EpisodeNum {

        @Attribute(name = "system", required = false)
        String system;

        @Text(required = false)
        String textValue;

        public String getSystem() {
            return this.system;
        }

        public void setSystem(String value) {
            this.system = value;
        }

        public String getTextValue() {
            return this.textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

    }

    public static class Length {

        @Text(required = false)
        String textValue;

        @Attribute(name = "units", required = false)
        String units;

        public String getTextValue() {
            return this.textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

        public String getUnits() {
            return this.units;
        }

        public void setUnits(String value) {
            this.units = value;
        }

    }

    public static class Credits {

        @ElementList(name = "actor", required = false, entry = "actor", inline = true)
        List<String> actor;

        @ElementList(name = "director", required = false, entry = "director", inline = true)
        List<String> director;

        @ElementList(name = "presenter", required = false, entry = "presenter", inline = true)
        List<String> presenter;

        public List<String> getActor() {
            return this.actor;
        }

        public void setActor(List<String> value) {
            this.actor = value;
        }

        public List<String> getDirector() {
            return this.director;
        }

        public void setDirector(List<String> value) {
            this.director = value;
        }

        public List<String> getPresenter() {
            return this.presenter;
        }

        public void setPresenter(List<String> value) {
            this.presenter = value;
        }

    }

    public static class SubTitle {

        @Text(required = false)
        String textValue;

        @Attribute(name = "lang", required = false)
        String lang;

        public String getTextValue() {
            return this.textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

        public String getLang() {
            return this.lang;
        }

        public void setLang(String value) {
            this.lang = value;
        }

    }

    public static class Channel {

        @Attribute(name = "id", required = false)
        String id;

        @ElementList(name = "display-name", required = false, entry = "display-name", inline = true)
        List<String> displayName;

        public String getId() {
            return this.id;
        }

        public void setId(String value) {
            this.id = value;
        }

        public List<String> getDisplayName() {
            return this.displayName;
        }

        public void setDisplayName(List<String> value) {
            this.displayName = value;
        }

    }

}