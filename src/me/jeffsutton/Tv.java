
/*
 * Copyright (c) 2015 Jeff Sutton.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

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
    List<Programme> Programme;

    @Attribute(name = "generator-info-name", required = false)
    String Generator_info_name;

    @Attribute(name = "source-info-url", required = false)
    URL Source_info_url;

    @Attribute(name = "generator-info-url", required = false)
    URL Generator_info_url;

    @ElementList(name = "channel", required = false, entry = "channel", inline = true)
    List<Channel> Channel;

    @Attribute(name = "source-info-name", required = false)
    String Source_info_name;


    public List<Programme> getProgramme() {
        return this.Programme;
    }

    public void setProgramme(List<Programme> value) {
        this.Programme = value;
    }

    public String getGenerator_info_name() {
        return this.Generator_info_name;
    }

    public void setGenerator_info_name(String value) {
        this.Generator_info_name = value;
    }

    public URL getSource_info_url() {
        return this.Source_info_url;
    }

    public void setSource_info_url(URL value) {
        this.Source_info_url = value;
    }

    public URL getGenerator_info_url() {
        return this.Generator_info_url;
    }

    public void setGenerator_info_url(URL value) {
        this.Generator_info_url = value;
    }

    public List<Channel> getChannel() {
        return this.Channel;
    }

    public void setChannel(List<Channel> value) {
        this.Channel = value;
    }

    public String getSource_info_name() {
        return this.Source_info_name;
    }

    public void setSource_info_name(String value) {
        this.Source_info_name = value;
    }


    public static class Subtitles {

        @Attribute(name = "type", required = false)
        String Type;


        public String getType() {
            return this.Type;
        }

        public void setType(String value) {
            this.Type = value;
        }


    }


    public static class Programme {

        @Element(name = "subtitles", required = false)
        Subtitles Subtitles;

        @Attribute(name = "stop", required = false)
        String Stop;

        @ElementList(name = "category", required = false, entry = "category", inline = true)
        List<Category> Category;

        @Element(name = "title", required = false)
        Title Title;

        @Element(name = "desc", required = false)
        Desc Desc;

        @Element(name = "audio", required = false)
        Audio Audio;

        @Attribute(name = "start", required = false)
        String Start;

        @ElementList(name = "episode-num", required = false, entry = "episode-num", inline = true)
        List<Episode_num> Episode_num;

        @Element(name = "credits", required = false)
        Credits Credits;

        @Element(name = "rating", required = false)
        Rating Rating;

        @Element(name = "sub-title", required = false)
        Sub_title Sub_title;

        @Element(name = "date", required = false)
        String Date;

        @Attribute(name = "channel", required = false)
        String Channel;

        @Element(name = "previously-shown", required = false)
        Previously_shown Previously_shown;

        @Element(name = "length", required = false)
        Length Length;

        @Element(name = "star-rating", required = false)
        Star_rating Star_rating;

        public Star_rating getStar_rating() {
            return this.Star_rating;
        }

        public void setStar_rating(Star_rating value) {
            this.Star_rating = value;
        }

        public Length getLength() {
            return this.Length;
        }

        public void setLength(Length value) {
            this.Length = value;
        }

        public Subtitles getSubtitles() {
            return this.Subtitles;
        }

        public void setSubtitles(Subtitles value) {
            this.Subtitles = value;
        }

        public String getStop() {
            return this.Stop;
        }

        public void setStop(String value) {
            this.Stop = value;
        }

        public List<Category> getCategory() {
            return this.Category;
        }

        public void setCategory(List<Category> value) {
            this.Category = value;
        }

        public Title getTitle() {
            return this.Title;
        }

        public void setTitle(Title value) {
            this.Title = value;
        }

        public Desc getDesc() {
            return this.Desc;
        }

        public void setDesc(Desc value) {
            this.Desc = value;
        }

        public Audio getAudio() {
            return this.Audio;
        }

        public void setAudio(Audio value) {
            this.Audio = value;
        }

        public String getStart() {
            return this.Start;
        }

        public void setStart(String value) {
            this.Start = value;
        }

        public List<Episode_num> getEpisode_num() {
            return this.Episode_num;
        }

        public void setEpisode_num(List<Episode_num> value) {
            this.Episode_num = value;
        }

        public Credits getCredits() {
            return this.Credits;
        }

        public void setCredits(Credits value) {
            this.Credits = value;
        }

        public Rating getRating() {
            return this.Rating;
        }

        public void setRating(Rating value) {
            this.Rating = value;
        }

        public Sub_title getSub_title() {
            return this.Sub_title;
        }

        public void setSub_title(Sub_title value) {
            this.Sub_title = value;
        }

        public String getDate() {
            return this.Date;
        }

        public void setDate(String value) {
            this.Date = value;
        }

        public String getChannel() {
            return this.Channel;
        }

        public void setChannel(String value) {
            this.Channel = value;
        }

        public Previously_shown getPreviously_shown() {
            return this.Previously_shown;
        }

        public void setPreviously_shown(Previously_shown value) {
            this.Previously_shown = value;
        }


    }


    public static class Icon {

        @Attribute(name = "src", required = false)
        String Src;


        public String getSrc() {
            return this.Src;
        }

        public void setSrc(String value) {
            this.Src = value;
        }


    }


    public static class Category {

        @Text(required = false)
        String TextValue;

        @Attribute(name = "lang", required = false)
        String Lang;


        public String getTextValue() {
            return this.TextValue;
        }

        public void setTextValue(String value) {
            this.TextValue = value;
        }

        public String getLang() {
            return this.Lang;
        }

        public void setLang(String value) {
            this.Lang = value;
        }


    }


    public static class Title {

        @Text(required = false)
        String TextValue;

        @Attribute(name = "lang", required = false)
        String Lang;


        public String getTextValue() {
            return this.TextValue;
        }

        public void setTextValue(String value) {
            this.TextValue = value;
        }

        public String getLang() {
            return this.Lang;
        }

        public void setLang(String value) {
            this.Lang = value;
        }


    }


    public static class Desc {

        @Text(required = false)
        String TextValue;

        @Attribute(name = "lang", required = false)
        String Lang;


        public String getTextValue() {
            return this.TextValue;
        }

        public void setTextValue(String value) {
            this.TextValue = value;
        }

        public String getLang() {
            return this.Lang;
        }

        public void setLang(String value) {
            this.Lang = value;
        }


    }


    public static class Audio {

        @Element(name = "stereo", required = false)
        String Stereo;


        public String getStereo() {
            return this.Stereo;
        }

        public void setStereo(String value) {
            this.Stereo = value;
        }


    }


    public static class Episode_num {

        @Attribute(name = "system", required = false)
        String System;

        @Text(required = false)
        String TextValue;


        public String getSystem() {
            return this.System;
        }

        public void setSystem(String value) {
            this.System = value;
        }

        public String getTextValue() {
            return this.TextValue;
        }

        public void setTextValue(String value) {
            this.TextValue = value;
        }


    }

    public static class Length {

        @Attribute(name = "units", required = false)
        String Units;

        @Text(required = false)
        String TextValue;


        public String getUnits() {
            return this.Units;
        }

        public void setUnits(String value) {
            this.Units = value;
        }

        public String getTextValue() {
            return this.TextValue;
        }

        public void setTextValue(String value) {
            this.TextValue = value;
        }


    }

    public static class Star_rating {

        @Element(name = "value", required = false)
        String Value;


        public String getValue() {
            return this.Value;
        }

        public void setValue(String value) {
            this.Value = value;
        }


    }

    public static class Credits {

        @ElementList(name = "producer", required = false, entry = "producer", inline = true)
        List<String> Producer;

        @ElementList(name = "actor", required = false, entry = "actor", inline = true)
        List<String> Actor;

        @ElementList(name = "director", required = false, entry = "director", inline = true)
        List<String> Director;

        @ElementList(name = "presenter", required = false, entry = "presenter", inline = true)
        List<String> Presenter;


        public List<String> getProducer() {
            return this.Producer;
        }

        public void setProducer(List<String> value) {
            this.Producer = value;
        }

        public List<String> getActor() {
            return this.Actor;
        }

        public void setActor(List<String> value) {
            this.Actor = value;
        }

        public List<String> getDirector() {
            return this.Director;
        }

        public void setDirector(List<String> value) {
            this.Director = value;
        }

        public List<String> getPresenter() {
            return this.Presenter;
        }

        public void setPresenter(List<String> value) {
            this.Presenter = value;
        }


    }


    public static class Rating {

        @Attribute(name = "system", required = false)
        String System;

        @Element(name = "value", required = false)
        String Value;


        public String getSystem() {
            return this.System;
        }

        public void setSystem(String value) {
            this.System = value;
        }

        public String getValue() {
            return this.Value;
        }

        public void setValue(String value) {
            this.Value = value;
        }


    }


    public static class Sub_title {

        @Text(required = false)
        String TextValue;

        @Attribute(name = "lang", required = false)
        String Lang;


        public String getTextValue() {
            return this.TextValue;
        }

        public void setTextValue(String value) {
            this.TextValue = value;
        }

        public String getLang() {
            return this.Lang;
        }

        public void setLang(String value) {
            this.Lang = value;
        }


    }


    public static class Channel {

        @Attribute(name = "id", required = false)
        String Id;

        @Element(name = "icon", required = false)
        Icon Icon;

        @ElementList(name = "display-name", required = false, entry = "display-name", inline = true)
        List<String> Display_name;


        public String getId() {
            return this.Id;
        }

        public void setId(String value) {
            this.Id = value;
        }

        public Icon getIcon() {
            return this.Icon;
        }

        public void setIcon(Icon value) {
            this.Icon = value;
        }

        public List<String> getDisplay_name() {
            return this.Display_name;
        }

        public void setDisplay_name(List<String> value) {
            this.Display_name = value;
        }


    }


    public static class Previously_shown {

        @Attribute(name = "start", required = false)
        Long Start;


        public Long getStart() {
            return this.Start;
        }

        public void setStart(Long value) {
            this.Start = value;
        }


    }
}