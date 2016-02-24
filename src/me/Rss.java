package me;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.net.URL;
import java.util.List;

@Root(name="rss")
public class Rss {

    @Text(required=false)
    String textValue;

    @Element(name="channel", required=false)
    Channel channel;

    @Attribute(name="version", required=false)
    Double version;

    public String getTextValue() {return this.textValue;}
    public void setTextValue(String value) {this.textValue = value;}

    public Channel getChannel() {return this.channel;}
    public void setChannel(Channel value) {this.channel = value;}

    public Double getVersion() {return this.version;}
    public void setVersion(Double value) {this.version = value;}

    public static class Item {

        @Element(name="copyright", required=false)
        String copyright;

        @Element(name="keywords", required=false)
        String keywords;

        @Element(name="added", required=false)
        String added;

        @Element(name="description", required=false)
        String description;

        @Element(name="defaultThumbnailUrl", required=false)
        String defaultThumbnailUrl;

        @Element(name="title", required=false)
        String title;

        @Element(name="locale", required=false)
        String locale;

        @Element(name="seriesId", required=false)
        String seriesId;

        @Element(name="tvSeasonEpisodeNumber", required=false)
        String tvSeasonEpisodeNumber;

        @Element(name="valid", required=false)
        String valid;

        @Element(name="provider", required=false)
        String provider;

        @Element(name="id", required=false)
        String id;

        @Element(name="primaryGenre", required=false)
        String primaryGenre;

        @ElementList(name="group", required=false)
        List<Content> group;

        @ElementList(name="thumbnail", required=false, entry="thumbnail", inline=true)
        List<Thumbnail> thumbnail;

        @Element(name="programType", required=false)
        String programType;

        @Element(name="author", required=false)
        String author;

        @Element(name="latinAmericaRating", required=false)
        String latinAmericaRating;

        @Element(name="pubDate", required=false)
        String pubDate;

        @Element(name="restriction", required=false)
        Restriction restriction;

        @Element(name="tvSeasonNumber", required=false)
        String tvSeasonNumber;

        @Element(name="guid", required=false)
        Guid guid;

        @ElementList(name="category", required=false, entry="category", inline=true)
        List<Category> category;

        @Element(name="updated", required=false)
        String updated;

        @Element(name="programId", required=false)
        String programId;

        public String getCopyright() {return this.copyright;}
        public void setCopyright(String value) {this.copyright = value;}

        public String getKeywords() {return this.keywords;}
        public void setKeywords(String value) {this.keywords = value;}

        public String getAdded() {return this.added;}
        public void setAdded(String value) {this.added = value;}

        public String getDescription() {return this.description;}
        public void setDescription(String value) {this.description = value;}

        public String getDefaultThumbnailUrl() {return this.defaultThumbnailUrl;}
        public void setDefaultThumbnailUrl(String value) {this.defaultThumbnailUrl = value;}

        public String getTitle() {return this.title;}
        public void setTitle(String value) {this.title = value;}

        public String getLocale() {return this.locale;}
        public void setLocale(String value) {this.locale = value;}

        public String getSeriesId() {return this.seriesId;}
        public void setSeriesId(String value) {this.seriesId = value;}

        public String getTvSeasonEpisodeNumber() {return this.tvSeasonEpisodeNumber;}
        public void setTvSeasonEpisodeNumber(String value) {this.tvSeasonEpisodeNumber = value;}

        public String getValid() {return this.valid;}
        public void setValid(String value) {this.valid = value;}

        public String getProvider() {return this.provider;}
        public void setProvider(String value) {this.provider = value;}

        public String getId() {return this.id;}
        public void setId(String value) {this.id = value;}

        public String getPrimaryGenre() {return this.primaryGenre;}
        public void setPrimaryGenre(String value) {this.primaryGenre = value;}

        public List<Content> getGroup() {return this.group;}
        public void setGroup(List<Content> value) {this.group = value;}

        public List<Thumbnail> getThumbnail() {return this.thumbnail;}
        public void setThumbnail(List<Thumbnail> value) {this.thumbnail = value;}

        public String getProgramType() {return this.programType;}
        public void setProgramType(String value) {this.programType = value;}

        public String getAuthor() {return this.author;}
        public void setAuthor(String value) {this.author = value;}

        public String getLatinAmericaRating() {return this.latinAmericaRating;}
        public void setLatinAmericaRating(String value) {this.latinAmericaRating = value;}

        public String getPubDate() {return this.pubDate;}
        public void setPubDate(String value) {this.pubDate = value;}

        public Restriction getRestriction() {return this.restriction;}
        public void setRestriction(Restriction value) {this.restriction = value;}

        public String getTvSeasonNumber() {return this.tvSeasonNumber;}
        public void setTvSeasonNumber(String value) {this.tvSeasonNumber = value;}

        public Guid getGuid() {return this.guid;}
        public void setGuid(Guid value) {this.guid = value;}

        public List<Category> getCategory() {return this.category;}
        public void setCategory(List<Category> value) {this.category = value;}

        public String getUpdated() {return this.updated;}
        public void setUpdated(String value) {this.updated = value;}

        public String getProgramId() {return this.programId;}
        public void setProgramId(String value) {this.programId = value;}

    }

    public static class Thumbnail {

        @Attribute(name="isDefault", required=false)
        Boolean isDefault;

        @Attribute(name="expression", required=false)
        String expression;

        @Attribute(name="fileSize", required=false)
        Integer fileSize;

        @Attribute(name="width", required=false)
        Integer width;

        @Attribute(name="time", required=false)
        Double time;

        @Attribute(name="lang", required=false)
        String lang;

        @Attribute(name="type", required=false)
        String type;

        @Attribute(name="url", required=false)
        URL url;

        @Element(name="hash", required=false)
        Hash hash;

        @Attribute(name="height", required=false)
        Integer height;

        public Boolean getIsDefault() {return this.isDefault;}
        public void setIsDefault(Boolean value) {this.isDefault = value;}

        public String getExpression() {return this.expression;}
        public void setExpression(String value) {this.expression = value;}

        public Integer getFileSize() {return this.fileSize;}
        public void setFileSize(Integer value) {this.fileSize = value;}

        public Integer getWidth() {return this.width;}
        public void setWidth(Integer value) {this.width = value;}

        public Double getTime() {return this.time;}
        public void setTime(Double value) {this.time = value;}

        public String getLang() {return this.lang;}
        public void setLang(String value) {this.lang = value;}

        public String getType() {return this.type;}
        public void setType(String value) {this.type = value;}

        public URL getUrl() {return this.url;}
        public void setUrl(URL value) {this.url = value;}

        public Hash getHash() {return this.hash;}
        public void setHash(Hash value) {this.hash = value;}

        public Integer getHeight() {return this.height;}
        public void setHeight(Integer value) {this.height = value;}

    }

    public static class Channel {

        @Element(name="startIndex", required=false)
        String startIndex;

        @ElementList(name="item", required=false, entry="item", inline=true)
        List<Item> item;

        @Element(name="entryCount", required=false)
        String entryCount;

        @Element(name="itemsPerPage", required=false)
        String itemsPerPage;

        @Element(name="link", required=false)
        String link;

        @Element(name="description", required=false)
        String description;

        @Element(name="title", required=false)
        String title;

        public String getStartIndex() {return this.startIndex;}
        public void setStartIndex(String value) {this.startIndex = value;}

        public List<Item> getItem() {return this.item;}
        public void setItem(List<Item> value) {this.item = value;}

        public String getEntryCount() {return this.entryCount;}
        public void setEntryCount(String value) {this.entryCount = value;}

        public String getItemsPerPage() {return this.itemsPerPage;}
        public void setItemsPerPage(String value) {this.itemsPerPage = value;}

        public String getLink() {return this.link;}
        public void setLink(String value) {this.link = value;}

        public String getDescription() {return this.description;}
        public void setDescription(String value) {this.description = value;}

        public String getTitle() {return this.title;}
        public void setTitle(String value) {this.title = value;}

    }

    public static class Content {

        @Attribute(name="expression", required=false)
        String expression;

        @Attribute(name="framerate", required=false)
        Double framerate;

        @Attribute(name="bitrate", required=false)
        String bitrate;

        @Attribute(name="samplingrate", required=false)
        Double samplingrate;

        @Attribute(name="medium", required=false)
        String medium;

        @Attribute(name="type", required=false)
        String type;

        @Attribute(name="url", required=false)
        URL url;

        @Attribute(name="duration", required=false)
        Double duration;

        @Attribute(name="isDefault", required=false)
        Boolean isDefault;

        @Attribute(name="channels", required=false)
        Integer channels;

        @Attribute(name="fileSize", required=false)
        Integer fileSize;

        @Attribute(name="width", required=false)
        Integer width;

        @Attribute(name="lang", required=false)
        String lang;

        @Element(name="hash", required=false)
        Hash hash;

        @Attribute(name="height", required=false)
        Integer height;

        public String getExpression() {return this.expression;}
        public void setExpression(String value) {this.expression = value;}

        public Double getFramerate() {return this.framerate;}
        public void setFramerate(Double value) {this.framerate = value;}

        public String getBitrate() {return this.bitrate;}
        public void setBitrate(String value) {this.bitrate = value;}

        public Double getSamplingrate() {return this.samplingrate;}
        public void setSamplingrate(Double value) {this.samplingrate = value;}

        public String getMedium() {return this.medium;}
        public void setMedium(String value) {this.medium = value;}

        public String getType() {return this.type;}
        public void setType(String value) {this.type = value;}

        public URL getUrl() {return this.url;}
        public void setUrl(URL value) {this.url = value;}

        public Double getDuration() {return this.duration;}
        public void setDuration(Double value) {this.duration = value;}

        public Boolean getIsDefault() {return this.isDefault;}
        public void setIsDefault(Boolean value) {this.isDefault = value;}

        public Integer getChannels() {return this.channels;}
        public void setChannels(Integer value) {this.channels = value;}

        public Integer getFileSize() {return this.fileSize;}
        public void setFileSize(Integer value) {this.fileSize = value;}

        public Integer getWidth() {return this.width;}
        public void setWidth(Integer value) {this.width = value;}

        public String getLang() {return this.lang;}
        public void setLang(String value) {this.lang = value;}

        public Hash getHash() {return this.hash;}
        public void setHash(Hash value) {this.hash = value;}

        public Integer getHeight() {return this.height;}
        public void setHeight(Integer value) {this.height = value;}

    }

    public static class Restriction {

        @Attribute(name="relationship", required=false)
        String relationship;

        @Attribute(name="type", required=false)
        String type;

        public String getRelationship() {return this.relationship;}
        public void setRelationship(String value) {this.relationship = value;}

        public String getType() {return this.type;}
        public void setType(String value) {this.type = value;}

    }

    public static class Guid {

        @Text(required=false)
        String textValue;

        @Attribute(name="isPermaLink", required=false)
        Boolean isPermaLink;

        public String getTextValue() {return this.textValue;}
        public void setTextValue(String value) {this.textValue = value;}

        public Boolean getIsPermaLink() {return this.isPermaLink;}
        public void setIsPermaLink(Boolean value) {this.isPermaLink = value;}

    }

    public static class Category {

        @Text(required=false)
        String textValue;

        @Attribute(name="scheme", required=false)
        String scheme;

        @Attribute(name="label", required=false)
        String label;

        public String getTextValue() {return this.textValue;}
        public void setTextValue(String value) {this.textValue = value;}

        public String getScheme() {return this.scheme;}
        public void setScheme(String value) {this.scheme = value;}

        public String getLabel() {return this.label;}
        public void setLabel(String value) {this.label = value;}

    }

    public static class Hash {

        @Text(required=false)
        String textValue;

        @Attribute(name="algo", required=false)
        String algo;

        public String getTextValue() {return this.textValue;}
        public void setTextValue(String value) {this.textValue = value;}

        public String getAlgo() {return this.algo;}
        public void setAlgo(String value) {this.algo = value;}

    }

}