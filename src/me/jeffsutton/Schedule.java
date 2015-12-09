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
import java.util.Date;
import java.util.List;

@Root(name = "schedule")
public class Schedule {

    @Element(name = "service", required = false)
    Service service;

    @Element(name = "day", required = false)
    Day day;

    public Service getService() {
        return this.service;
    }

    public void setService(Service value) {
        this.service = value;
    }

    public Day getDay() {
        return this.day;
    }

    public void setDay(Day value) {
        this.day = value;
    }

    public static class Programme {

        @Element(name = "position", required = false)
        String position;

        @Element(name = "media_type", required = false)
        String mediaType;

        @Element(name = "short_synopsis", required = false)
        String shortSynopsis;

        @Element(name = "image", required = false)
        Image image;

        @Element(name = "pid", required = false)
        String pid;

        @Attribute(name = "type", required = false)
        String type;

        @Element(name = "first_broadcast_date", required = false)
        String firstBroadcastDate;

        @Element(name = "programme", required = false)
        Programme programme;

        @Element(name = "is_available_mediaset_pc_sd", required = false)
        String isAvailableMediasetPcSd;

        @Element(name = "available_until", required = false)
        String availableUntil;

        @Element(name = "title", required = false)
        String title;

        @Element(name = "duration", required = false)
        String duration;

        @Element(name = "ownership", required = false)
        Ownership ownership;

        @Element(name = "actual_start", required = false)
        String actualStart;

        @Element(name = "display_titles", required = false)
        DisplayTitles displayTitles;

        @Element(name = "is_legacy_media", required = false)
        String isLegacyMedia;

        @Element(name = "expected_child_count", required = false)
        String expectedChildCount;

        @Element(name = "media", required = false)
        Media media;

        public String getPosition() {
            return this.position;
        }

        public void setPosition(String value) {
            this.position = value;
        }

        public String getMediaType() {
            return this.mediaType;
        }

        public void setMediaType(String value) {
            this.mediaType = value;
        }

        public String getShortSynopsis() {
            return this.shortSynopsis;
        }

        public void setShortSynopsis(String value) {
            this.shortSynopsis = value;
        }

        public Image getImage() {
            return this.image;
        }

        public void setImage(Image value) {
            this.image = value;
        }

        public String getPid() {
            return this.pid;
        }

        public void setPid(String value) {
            this.pid = value;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String value) {
            this.type = value;
        }

        public String getFirstBroadcastDate() {
            return this.firstBroadcastDate;
        }

        public void setFirstBroadcastDate(String value) {
            this.firstBroadcastDate = value;
        }

        public Programme getProgramme() {
            return this.programme;
        }

        public void setProgramme(Programme value) {
            this.programme = value;
        }

        public String getIsAvailableMediasetPcSd() {
            return this.isAvailableMediasetPcSd;
        }

        public void setIsAvailableMediasetPcSd(String value) {
            this.isAvailableMediasetPcSd = value;
        }

        public String getAvailableUntil() {
            return this.availableUntil;
        }

        public void setAvailableUntil(String value) {
            this.availableUntil = value;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String value) {
            this.title = value;
        }

        public String getDuration() {
            return this.duration;
        }

        public void setDuration(String value) {
            this.duration = value;
        }

        public Ownership getOwnership() {
            return this.ownership;
        }

        public void setOwnership(Ownership value) {
            this.ownership = value;
        }

        public String getActualStart() {
            return this.actualStart;
        }

        public void setActualStart(String value) {
            this.actualStart = value;
        }

        public DisplayTitles getDisplayTitles() {
            return this.displayTitles;
        }

        public void setDisplayTitles(DisplayTitles value) {
            this.displayTitles = value;
        }

        public String getIsLegacyMedia() {
            return this.isLegacyMedia;
        }

        public void setIsLegacyMedia(String value) {
            this.isLegacyMedia = value;
        }

        public String getExpectedChildCount() {
            return this.expectedChildCount;
        }

        public void setExpectedChildCount(String value) {
            this.expectedChildCount = value;
        }

        public Media getMedia() {
            return this.media;
        }

        public void setMedia(Media value) {
            this.media = value;
        }

    }

    public static class Outlet {

        @Element(name = "title", required = false)
        String title;

        @Attribute(name = "key", required = false)
        String key;

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String value) {
            this.title = value;
        }

        public String getKey() {
            return this.key;
        }

        public void setKey(String value) {
            this.key = value;
        }

    }

    public static class Ownership {

        @Element(name = "service", required = false)
        Service service;

        public Service getService() {
            return this.service;
        }

        public void setService(Service value) {
            this.service = value;
        }

    }

    public static class DisplayTitles {

        @Element(name = "title", required = false)
        String title;

        @Element(name = "subtitle", required = false)
        String subtitle;

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String value) {
            this.title = value;
        }

        public String getSubtitle() {
            return this.subtitle;
        }

        public void setSubtitle(String value) {
            this.subtitle = value;
        }

    }

    public static class Broadcast {

        @Element(name = "programme", required = false)
        Programme programme;

        @Element(name = "duration", required = false)
        String duration;

        @Element(name = "start", required = false)
        String start;

        @Attribute(name = "is_repeat", required = false)
        Integer isRepeat;

        @Element(name = "pid", required = false)
        String pid;

        @Attribute(name = "is_blanked", required = false)
        String isBlanked;

        @Element(name = "end", required = false)
        String end;

        public Programme getProgramme() {
            return this.programme;
        }

        public void setProgramme(Programme value) {
            this.programme = value;
        }

        public String getDuration() {
            return this.duration;
        }

        public void setDuration(String value) {
            this.duration = value;
        }

        public String getStart() {
            return this.start;
        }

        public void setStart(String value) {
            this.start = value;
        }

        public Integer getIsRepeat() {
            return this.isRepeat;
        }

        public void setIsRepeat(Integer value) {
            this.isRepeat = value;
        }

        public String getPid() {
            return this.pid;
        }

        public void setPid(String value) {
            this.pid = value;
        }

        public String getIsBlanked() {
            return this.isBlanked;
        }

        public void setIsBlanked(String value) {
            this.isBlanked = value;
        }

        public String getEnd() {
            return this.end;
        }

        public void setEnd(String value) {
            this.end = value;
        }

    }

    public static class Service {

        @Attribute(name = "id", required = false)
        String id;

        @Element(name = "title", required = false)
        String title;

        @Element(name = "outlet", required = false)
        Outlet outlet;

        @Attribute(name = "type", required = false)
        String type;

        @Attribute(name = "key", required = false)
        String key;

        public String getId() {
            return this.id;
        }

        public void setId(String value) {
            this.id = value;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String value) {
            this.title = value;
        }

        public Outlet getOutlet() {
            return this.outlet;
        }

        public void setOutlet(Outlet value) {
            this.outlet = value;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String value) {
            this.type = value;
        }

        public String getKey() {
            return this.key;
        }

        public void setKey(String value) {
            this.key = value;
        }

    }

    public static class Image {

        @Element(name = "pid", required = false)
        String pid;

        public String getPid() {
            return this.pid;
        }

        public void setPid(String value) {
            this.pid = value;
        }

    }

    public static class Day {

        @Attribute(name = "has_previous", required = false)
        Integer hasPrevious;

        @Attribute(name = "has_next", required = false)
        Integer hasNext;

        @Attribute(name = "date", required = false)
        Date date;

        @ElementList(name = "broadcasts", required = false)
        List<Broadcast> broadcasts;

        public Integer getHasPrevious() {
            return this.hasPrevious;
        }

        public void setHasPrevious(Integer value) {
            this.hasPrevious = value;
        }

        public Integer getHasNext() {
            return this.hasNext;
        }

        public void setHasNext(Integer value) {
            this.hasNext = value;
        }

        public Date getDate() {
            return this.date;
        }

        public void setDate(Date value) {
            this.date = value;
        }

        public List<Broadcast> getBroadcasts() {
            return this.broadcasts;
        }

        public void setBroadcasts(List<Broadcast> value) {
            this.broadcasts = value;
        }

    }

    public static class Media {

        @Element(name = "expires", required = false)
        String expires;

        @Attribute(name = "format", required = false)
        String format;

        @Element(name = "availability", required = false)
        String availability;

        public String getExpires() {
            return this.expires;
        }

        public void setExpires(String value) {
            this.expires = value;
        }

        public String getFormat() {
            return this.format;
        }

        public void setFormat(String value) {
            this.format = value;
        }

        public String getAvailability() {
            return this.availability;
        }

        public void setAvailability(String value) {
            this.availability = value;
        }

    }

}
