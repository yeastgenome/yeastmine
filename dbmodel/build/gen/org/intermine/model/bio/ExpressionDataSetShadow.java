package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionDataSetShadow implements ExpressionDataSet, ShadowClass
{
    public static final Class<ExpressionDataSet> shadowOf = ExpressionDataSet.class;
    // Attr: org.intermine.model.bio.ExpressionDataSet.numGenes
    protected java.lang.String numGenes;
    public java.lang.String getNumGenes() { return numGenes; }
    public void setNumGenes(final java.lang.String numGenes) { this.numGenes = numGenes; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.geoID
    protected java.lang.String geoID;
    public java.lang.String getGeoID() { return geoID; }
    public void setGeoID(final java.lang.String geoID) { this.geoID = geoID; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.title
    protected java.lang.String title;
    public java.lang.String getTitle() { return title; }
    public void setTitle(final java.lang.String title) { this.title = title; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.pubmedID
    protected java.lang.String pubmedID;
    public java.lang.String getPubmedID() { return pubmedID; }
    public void setPubmedID(final java.lang.String pubmedID) { this.pubmedID = pubmedID; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.journal
    protected java.lang.String journal;
    public java.lang.String getJournal() { return journal; }
    public void setJournal(final java.lang.String journal) { this.journal = journal; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.channelCount
    protected java.lang.String channelCount;
    public java.lang.String getChannelCount() { return channelCount; }
    public void setChannelCount(final java.lang.String channelCount) { this.channelCount = channelCount; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.platformID
    protected java.lang.String platformID;
    public java.lang.String getPlatformID() { return platformID; }
    public void setPlatformID(final java.lang.String platformID) { this.platformID = platformID; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.allAuthors
    protected java.lang.String allAuthors;
    public java.lang.String getAllAuthors() { return allAuthors; }
    public void setAllAuthors(final java.lang.String allAuthors) { this.allAuthors = allAuthors; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.numConds
    protected java.lang.Integer numConds;
    public java.lang.Integer getNumConds() { return numConds; }
    public void setNumConds(final java.lang.Integer numConds) { this.numConds = numConds; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.tags
    protected java.lang.String tags;
    public java.lang.String getTags() { return tags; }
    public void setTags(final java.lang.String tags) { this.tags = tags; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.publicationYear
    protected java.lang.String publicationYear;
    public java.lang.String getPublicationYear() { return publicationYear; }
    public void setPublicationYear(final java.lang.String publicationYear) { this.publicationYear = publicationYear; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.fileName
    protected java.lang.String fileName;
    public java.lang.String getFileName() { return fileName; }
    public void setFileName(final java.lang.String fileName) { this.fileName = fileName; }

    // Attr: org.intermine.model.bio.ExpressionDataSet.author
    protected java.lang.String author;
    public java.lang.String getAuthor() { return author; }
    public void setAuthor(final java.lang.String author) { this.author = author; }

    // Col: org.intermine.model.bio.ExpressionDataSet.expressionconditions
    protected java.util.Set<org.intermine.model.bio.ExpressionCondition> expressionconditions = new java.util.HashSet<org.intermine.model.bio.ExpressionCondition>();
    public java.util.Set<org.intermine.model.bio.ExpressionCondition> getExpressionconditions() { return expressionconditions; }
    public void setExpressionconditions(final java.util.Set<org.intermine.model.bio.ExpressionCondition> expressionconditions) { this.expressionconditions = expressionconditions; }
    public void addExpressionconditions(final org.intermine.model.bio.ExpressionCondition arg) { expressionconditions.add(arg); }

    // Col: org.intermine.model.bio.ExpressionDataSet.expressiondatasettags
    protected java.util.Set<org.intermine.model.bio.ExpressionDataSetTag> expressiondatasettags = new java.util.HashSet<org.intermine.model.bio.ExpressionDataSetTag>();
    public java.util.Set<org.intermine.model.bio.ExpressionDataSetTag> getExpressiondatasettags() { return expressiondatasettags; }
    public void setExpressiondatasettags(final java.util.Set<org.intermine.model.bio.ExpressionDataSetTag> expressiondatasettags) { this.expressiondatasettags = expressiondatasettags; }
    public void addExpressiondatasettags(final org.intermine.model.bio.ExpressionDataSetTag arg) { expressiondatasettags.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionDataSet && id != null) ? id.equals(((ExpressionDataSet)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionDataSet [allAuthors=" + (allAuthors == null ? "null" : "\"" + allAuthors + "\"") + ", author=" + (author == null ? "null" : "\"" + author + "\"") + ", channelCount=" + (channelCount == null ? "null" : "\"" + channelCount + "\"") + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", fileName=" + (fileName == null ? "null" : "\"" + fileName + "\"") + ", geoID=" + (geoID == null ? "null" : "\"" + geoID + "\"") + ", id=" + id + ", journal=" + (journal == null ? "null" : "\"" + journal + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", numConds=" + numConds + ", numGenes=" + (numGenes == null ? "null" : "\"" + numGenes + "\"") + ", platformID=" + (platformID == null ? "null" : "\"" + platformID + "\"") + ", publicationYear=" + (publicationYear == null ? "null" : "\"" + publicationYear + "\"") + ", pubmedID=" + (pubmedID == null ? "null" : "\"" + pubmedID + "\"") + ", tags=" + (tags == null ? "null" : "\"" + tags + "\"") + ", title=" + (title == null ? "null" : "\"" + title + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("numGenes".equals(fieldName)) {
            return numGenes;
        }
        if ("geoID".equals(fieldName)) {
            return geoID;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("pubmedID".equals(fieldName)) {
            return pubmedID;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("journal".equals(fieldName)) {
            return journal;
        }
        if ("channelCount".equals(fieldName)) {
            return channelCount;
        }
        if ("platformID".equals(fieldName)) {
            return platformID;
        }
        if ("allAuthors".equals(fieldName)) {
            return allAuthors;
        }
        if ("numConds".equals(fieldName)) {
            return numConds;
        }
        if ("tags".equals(fieldName)) {
            return tags;
        }
        if ("publicationYear".equals(fieldName)) {
            return publicationYear;
        }
        if ("fileName".equals(fieldName)) {
            return fileName;
        }
        if ("author".equals(fieldName)) {
            return author;
        }
        if ("expressionconditions".equals(fieldName)) {
            return expressionconditions;
        }
        if ("expressiondatasettags".equals(fieldName)) {
            return expressiondatasettags;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionDataSet.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("numGenes".equals(fieldName)) {
            return numGenes;
        }
        if ("geoID".equals(fieldName)) {
            return geoID;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("pubmedID".equals(fieldName)) {
            return pubmedID;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("journal".equals(fieldName)) {
            return journal;
        }
        if ("channelCount".equals(fieldName)) {
            return channelCount;
        }
        if ("platformID".equals(fieldName)) {
            return platformID;
        }
        if ("allAuthors".equals(fieldName)) {
            return allAuthors;
        }
        if ("numConds".equals(fieldName)) {
            return numConds;
        }
        if ("tags".equals(fieldName)) {
            return tags;
        }
        if ("publicationYear".equals(fieldName)) {
            return publicationYear;
        }
        if ("fileName".equals(fieldName)) {
            return fileName;
        }
        if ("author".equals(fieldName)) {
            return author;
        }
        if ("expressionconditions".equals(fieldName)) {
            return expressionconditions;
        }
        if ("expressiondatasettags".equals(fieldName)) {
            return expressiondatasettags;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionDataSet.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("numGenes".equals(fieldName)) {
            numGenes = (java.lang.String) value;
        } else if ("geoID".equals(fieldName)) {
            geoID = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("title".equals(fieldName)) {
            title = (java.lang.String) value;
        } else if ("pubmedID".equals(fieldName)) {
            pubmedID = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("journal".equals(fieldName)) {
            journal = (java.lang.String) value;
        } else if ("channelCount".equals(fieldName)) {
            channelCount = (java.lang.String) value;
        } else if ("platformID".equals(fieldName)) {
            platformID = (java.lang.String) value;
        } else if ("allAuthors".equals(fieldName)) {
            allAuthors = (java.lang.String) value;
        } else if ("numConds".equals(fieldName)) {
            numConds = (java.lang.Integer) value;
        } else if ("tags".equals(fieldName)) {
            tags = (java.lang.String) value;
        } else if ("publicationYear".equals(fieldName)) {
            publicationYear = (java.lang.String) value;
        } else if ("fileName".equals(fieldName)) {
            fileName = (java.lang.String) value;
        } else if ("author".equals(fieldName)) {
            author = (java.lang.String) value;
        } else if ("expressionconditions".equals(fieldName)) {
            expressionconditions = (java.util.Set) value;
        } else if ("expressiondatasettags".equals(fieldName)) {
            expressiondatasettags = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionDataSet.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("numGenes".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("geoID".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("title".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pubmedID".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("journal".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("channelCount".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("platformID".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("allAuthors".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("numConds".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("tags".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publicationYear".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("fileName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("author".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("expressionconditions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("expressiondatasettags".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionDataSet.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionDataSet.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionDataSetShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionDataSet");
        if (numGenes != null) {
            sb.append("$_^anumGenes$_^");
            String string = numGenes;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (geoID != null) {
            sb.append("$_^ageoID$_^");
            String string = geoID;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (title != null) {
            sb.append("$_^atitle$_^");
            String string = title;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (pubmedID != null) {
            sb.append("$_^apubmedID$_^");
            String string = pubmedID;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (journal != null) {
            sb.append("$_^ajournal$_^");
            String string = journal;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (channelCount != null) {
            sb.append("$_^achannelCount$_^");
            String string = channelCount;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (platformID != null) {
            sb.append("$_^aplatformID$_^");
            String string = platformID;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (allAuthors != null) {
            sb.append("$_^aallAuthors$_^");
            String string = allAuthors;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (numConds != null) {
            sb.append("$_^anumConds$_^").append(numConds);
        }
        if (tags != null) {
            sb.append("$_^atags$_^");
            String string = tags;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (publicationYear != null) {
            sb.append("$_^apublicationYear$_^");
            String string = publicationYear;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (fileName != null) {
            sb.append("$_^afileName$_^");
            String string = fileName;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (author != null) {
            sb.append("$_^aauthor$_^");
            String string = author;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ExpressionDataSetShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionDataSet)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "anumGenes".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                numGenes = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ageoID".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                geoID = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atitle".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                title = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apubmedID".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pubmedID = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ajournal".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                journal = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "achannelCount".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                channelCount = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aplatformID".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                platformID = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aallAuthors".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                allAuthors = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "anumConds".equals(notXml[i])) {
                i++;
                numConds = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "atags".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                tags = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apublicationYear".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                publicationYear = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afileName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                fileName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aauthor".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                author = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        expressionconditions = new ProxyCollection<org.intermine.model.bio.ExpressionCondition>(os, this, "expressionconditions", org.intermine.model.bio.ExpressionCondition.class);
        expressiondatasettags = new ProxyCollection<org.intermine.model.bio.ExpressionDataSetTag>(os, this, "expressiondatasettags", org.intermine.model.bio.ExpressionDataSetTag.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("expressionconditions".equals(fieldName)) {
            expressionconditions.add((org.intermine.model.bio.ExpressionCondition) element);
        } else if ("expressiondatasettags".equals(fieldName)) {
            expressiondatasettags.add((org.intermine.model.bio.ExpressionDataSetTag) element);
        } else {
            if (!org.intermine.model.bio.ExpressionDataSet.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("expressionconditions".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionCondition.class;
        }
        if ("expressiondatasettags".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionDataSetTag.class;
        }
        if (!org.intermine.model.bio.ExpressionDataSet.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionDataSet.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
