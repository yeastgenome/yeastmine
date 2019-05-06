package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class PublicationShadow implements Publication, ShadowClass
{
    public static final Class<Publication> shadowOf = Publication.class;
    // Attr: org.intermine.model.bio.Publication.year
    protected java.lang.Integer year;
    public java.lang.Integer getYear() { return year; }
    public void setYear(final java.lang.Integer year) { this.year = year; }

    // Attr: org.intermine.model.bio.Publication.citation
    protected java.lang.String citation;
    public java.lang.String getCitation() { return citation; }
    public void setCitation(final java.lang.String citation) { this.citation = citation; }

    // Attr: org.intermine.model.bio.Publication.issue
    protected java.lang.String issue;
    public java.lang.String getIssue() { return issue; }
    public void setIssue(final java.lang.String issue) { this.issue = issue; }

    // Attr: org.intermine.model.bio.Publication.title
    protected java.lang.String title;
    public java.lang.String getTitle() { return title; }
    public void setTitle(final java.lang.String title) { this.title = title; }

    // Attr: org.intermine.model.bio.Publication.doi
    protected java.lang.String doi;
    public java.lang.String getDoi() { return doi; }
    public void setDoi(final java.lang.String doi) { this.doi = doi; }

    // Attr: org.intermine.model.bio.Publication.volume
    protected java.lang.String volume;
    public java.lang.String getVolume() { return volume; }
    public void setVolume(final java.lang.String volume) { this.volume = volume; }

    // Attr: org.intermine.model.bio.Publication.journal
    protected java.lang.String journal;
    public java.lang.String getJournal() { return journal; }
    public void setJournal(final java.lang.String journal) { this.journal = journal; }

    // Attr: org.intermine.model.bio.Publication.dateCreated
    protected java.util.Date dateCreated;
    public java.util.Date getDateCreated() { return dateCreated; }
    public void setDateCreated(final java.util.Date dateCreated) { this.dateCreated = dateCreated; }

    // Attr: org.intermine.model.bio.Publication.firstAuthor
    protected java.lang.String firstAuthor;
    public java.lang.String getFirstAuthor() { return firstAuthor; }
    public void setFirstAuthor(final java.lang.String firstAuthor) { this.firstAuthor = firstAuthor; }

    // Attr: org.intermine.model.bio.Publication.month
    protected java.lang.String month;
    public java.lang.String getMonth() { return month; }
    public void setMonth(final java.lang.String month) { this.month = month; }

    // Attr: org.intermine.model.bio.Publication.abstractText
    protected java.lang.String abstractText;
    public java.lang.String getAbstractText() { return abstractText; }
    public void setAbstractText(final java.lang.String abstractText) { this.abstractText = abstractText; }

    // Attr: org.intermine.model.bio.Publication.summary
    protected java.lang.String summary;
    public java.lang.String getSummary() { return summary; }
    public void setSummary(final java.lang.String summary) { this.summary = summary; }

    // Attr: org.intermine.model.bio.Publication.pages
    protected java.lang.String pages;
    public java.lang.String getPages() { return pages; }
    public void setPages(final java.lang.String pages) { this.pages = pages; }

    // Attr: org.intermine.model.bio.Publication.pubXrefId
    protected java.lang.String pubXrefId;
    public java.lang.String getPubXrefId() { return pubXrefId; }
    public void setPubXrefId(final java.lang.String pubXrefId) { this.pubXrefId = pubXrefId; }

    // Attr: org.intermine.model.bio.Publication.pubMedId
    protected java.lang.String pubMedId;
    public java.lang.String getPubMedId() { return pubMedId; }
    public void setPubMedId(final java.lang.String pubMedId) { this.pubMedId = pubMedId; }

    // Col: org.intermine.model.bio.Publication.phenotypes
    protected java.util.Set<org.intermine.model.bio.Phenotype> phenotypes = new java.util.HashSet<org.intermine.model.bio.Phenotype>();
    public java.util.Set<org.intermine.model.bio.Phenotype> getPhenotypes() { return phenotypes; }
    public void setPhenotypes(final java.util.Set<org.intermine.model.bio.Phenotype> phenotypes) { this.phenotypes = phenotypes; }
    public void addPhenotypes(final org.intermine.model.bio.Phenotype arg) { phenotypes.add(arg); }

    // Col: org.intermine.model.bio.Publication.authors
    protected java.util.Set<org.intermine.model.bio.Author> authors = new java.util.HashSet<org.intermine.model.bio.Author>();
    public java.util.Set<org.intermine.model.bio.Author> getAuthors() { return authors; }
    public void setAuthors(final java.util.Set<org.intermine.model.bio.Author> authors) { this.authors = authors; }
    public void addAuthors(final org.intermine.model.bio.Author arg) { authors.add(arg); }

    // Col: org.intermine.model.bio.Publication.literatureTopics
    protected java.util.Set<org.intermine.model.bio.LiteratureTopic> literatureTopics = new java.util.HashSet<org.intermine.model.bio.LiteratureTopic>();
    public java.util.Set<org.intermine.model.bio.LiteratureTopic> getLiteratureTopics() { return literatureTopics; }
    public void setLiteratureTopics(final java.util.Set<org.intermine.model.bio.LiteratureTopic> literatureTopics) { this.literatureTopics = literatureTopics; }
    public void addLiteratureTopics(final org.intermine.model.bio.LiteratureTopic arg) { literatureTopics.add(arg); }

    // Col: org.intermine.model.bio.Publication.crossReferences
    protected java.util.Set<org.intermine.model.bio.DatabaseReference> crossReferences = new java.util.HashSet<org.intermine.model.bio.DatabaseReference>();
    public java.util.Set<org.intermine.model.bio.DatabaseReference> getCrossReferences() { return crossReferences; }
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.DatabaseReference> crossReferences) { this.crossReferences = crossReferences; }
    public void addCrossReferences(final org.intermine.model.bio.DatabaseReference arg) { crossReferences.add(arg); }

    // Col: org.intermine.model.bio.Publication.entities
    protected java.util.Set<org.intermine.model.bio.Annotatable> entities = new java.util.HashSet<org.intermine.model.bio.Annotatable>();
    public java.util.Set<org.intermine.model.bio.Annotatable> getEntities() { return entities; }
    public void setEntities(final java.util.Set<org.intermine.model.bio.Annotatable> entities) { this.entities = entities; }
    public void addEntities(final org.intermine.model.bio.Annotatable arg) { entities.add(arg); }

    // Col: org.intermine.model.bio.Publication.meshTerms
    protected java.util.Set<org.intermine.model.bio.MeshTerm> meshTerms = new java.util.HashSet<org.intermine.model.bio.MeshTerm>();
    public java.util.Set<org.intermine.model.bio.MeshTerm> getMeshTerms() { return meshTerms; }
    public void setMeshTerms(final java.util.Set<org.intermine.model.bio.MeshTerm> meshTerms) { this.meshTerms = meshTerms; }
    public void addMeshTerms(final org.intermine.model.bio.MeshTerm arg) { meshTerms.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Publication && id != null) ? id.equals(((Publication)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Publication [abstractText=" + (abstractText == null ? "null" : "\"" + abstractText + "\"") + ", citation=" + (citation == null ? "null" : "\"" + citation + "\"") + ", dateCreated=" + (dateCreated == null ? "null" : "\"" + dateCreated + "\"") + ", doi=" + (doi == null ? "null" : "\"" + doi + "\"") + ", firstAuthor=" + (firstAuthor == null ? "null" : "\"" + firstAuthor + "\"") + ", id=" + id + ", issue=" + (issue == null ? "null" : "\"" + issue + "\"") + ", journal=" + (journal == null ? "null" : "\"" + journal + "\"") + ", month=" + (month == null ? "null" : "\"" + month + "\"") + ", pages=" + (pages == null ? "null" : "\"" + pages + "\"") + ", pubMedId=" + (pubMedId == null ? "null" : "\"" + pubMedId + "\"") + ", pubXrefId=" + (pubXrefId == null ? "null" : "\"" + pubXrefId + "\"") + ", summary=" + (summary == null ? "null" : "\"" + summary + "\"") + ", title=" + (title == null ? "null" : "\"" + title + "\"") + ", volume=" + (volume == null ? "null" : "\"" + volume + "\"") + ", year=" + year + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("year".equals(fieldName)) {
            return year;
        }
        if ("citation".equals(fieldName)) {
            return citation;
        }
        if ("issue".equals(fieldName)) {
            return issue;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("doi".equals(fieldName)) {
            return doi;
        }
        if ("volume".equals(fieldName)) {
            return volume;
        }
        if ("journal".equals(fieldName)) {
            return journal;
        }
        if ("dateCreated".equals(fieldName)) {
            return dateCreated;
        }
        if ("firstAuthor".equals(fieldName)) {
            return firstAuthor;
        }
        if ("month".equals(fieldName)) {
            return month;
        }
        if ("abstractText".equals(fieldName)) {
            return abstractText;
        }
        if ("summary".equals(fieldName)) {
            return summary;
        }
        if ("pages".equals(fieldName)) {
            return pages;
        }
        if ("pubXrefId".equals(fieldName)) {
            return pubXrefId;
        }
        if ("pubMedId".equals(fieldName)) {
            return pubMedId;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("authors".equals(fieldName)) {
            return authors;
        }
        if ("literatureTopics".equals(fieldName)) {
            return literatureTopics;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("entities".equals(fieldName)) {
            return entities;
        }
        if ("meshTerms".equals(fieldName)) {
            return meshTerms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("year".equals(fieldName)) {
            return year;
        }
        if ("citation".equals(fieldName)) {
            return citation;
        }
        if ("issue".equals(fieldName)) {
            return issue;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("doi".equals(fieldName)) {
            return doi;
        }
        if ("volume".equals(fieldName)) {
            return volume;
        }
        if ("journal".equals(fieldName)) {
            return journal;
        }
        if ("dateCreated".equals(fieldName)) {
            return dateCreated;
        }
        if ("firstAuthor".equals(fieldName)) {
            return firstAuthor;
        }
        if ("month".equals(fieldName)) {
            return month;
        }
        if ("abstractText".equals(fieldName)) {
            return abstractText;
        }
        if ("summary".equals(fieldName)) {
            return summary;
        }
        if ("pages".equals(fieldName)) {
            return pages;
        }
        if ("pubXrefId".equals(fieldName)) {
            return pubXrefId;
        }
        if ("pubMedId".equals(fieldName)) {
            return pubMedId;
        }
        if ("phenotypes".equals(fieldName)) {
            return phenotypes;
        }
        if ("authors".equals(fieldName)) {
            return authors;
        }
        if ("literatureTopics".equals(fieldName)) {
            return literatureTopics;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("entities".equals(fieldName)) {
            return entities;
        }
        if ("meshTerms".equals(fieldName)) {
            return meshTerms;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("year".equals(fieldName)) {
            year = (java.lang.Integer) value;
        } else if ("citation".equals(fieldName)) {
            citation = (java.lang.String) value;
        } else if ("issue".equals(fieldName)) {
            issue = (java.lang.String) value;
        } else if ("title".equals(fieldName)) {
            title = (java.lang.String) value;
        } else if ("doi".equals(fieldName)) {
            doi = (java.lang.String) value;
        } else if ("volume".equals(fieldName)) {
            volume = (java.lang.String) value;
        } else if ("journal".equals(fieldName)) {
            journal = (java.lang.String) value;
        } else if ("dateCreated".equals(fieldName)) {
            dateCreated = (java.util.Date) value;
        } else if ("firstAuthor".equals(fieldName)) {
            firstAuthor = (java.lang.String) value;
        } else if ("month".equals(fieldName)) {
            month = (java.lang.String) value;
        } else if ("abstractText".equals(fieldName)) {
            abstractText = (java.lang.String) value;
        } else if ("summary".equals(fieldName)) {
            summary = (java.lang.String) value;
        } else if ("pages".equals(fieldName)) {
            pages = (java.lang.String) value;
        } else if ("pubXrefId".equals(fieldName)) {
            pubXrefId = (java.lang.String) value;
        } else if ("pubMedId".equals(fieldName)) {
            pubMedId = (java.lang.String) value;
        } else if ("phenotypes".equals(fieldName)) {
            phenotypes = (java.util.Set) value;
        } else if ("authors".equals(fieldName)) {
            authors = (java.util.Set) value;
        } else if ("literatureTopics".equals(fieldName)) {
            literatureTopics = (java.util.Set) value;
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences = (java.util.Set) value;
        } else if ("entities".equals(fieldName)) {
            entities = (java.util.Set) value;
        } else if ("meshTerms".equals(fieldName)) {
            meshTerms = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("year".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("citation".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("issue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("title".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("doi".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("volume".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("journal".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("dateCreated".equals(fieldName)) {
            return java.util.Date.class;
        }
        if ("firstAuthor".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("month".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("abstractText".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("summary".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pages".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pubXrefId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pubMedId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("phenotypes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("authors".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("literatureTopics".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("entities".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("meshTerms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Publication.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.PublicationShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Publication");
        if (year != null) {
            sb.append("$_^ayear$_^").append(year);
        }
        if (citation != null) {
            sb.append("$_^acitation$_^");
            String string = citation;
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
        if (issue != null) {
            sb.append("$_^aissue$_^");
            String string = issue;
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
        if (doi != null) {
            sb.append("$_^adoi$_^");
            String string = doi;
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
        if (volume != null) {
            sb.append("$_^avolume$_^");
            String string = volume;
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
        if (dateCreated != null) {
            sb.append("$_^adateCreated$_^").append(dateCreated.getTime());
        }
        if (firstAuthor != null) {
            sb.append("$_^afirstAuthor$_^");
            String string = firstAuthor;
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
        if (month != null) {
            sb.append("$_^amonth$_^");
            String string = month;
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
        if (abstractText != null) {
            sb.append("$_^aabstractText$_^");
            String string = abstractText;
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
        if (summary != null) {
            sb.append("$_^asummary$_^");
            String string = summary;
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
        if (pages != null) {
            sb.append("$_^apages$_^");
            String string = pages;
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
        if (pubXrefId != null) {
            sb.append("$_^apubXrefId$_^");
            String string = pubXrefId;
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
        if (pubMedId != null) {
            sb.append("$_^apubMedId$_^");
            String string = pubMedId;
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
        if (!org.intermine.model.bio.PublicationShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Publication)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ayear".equals(notXml[i])) {
                i++;
                year = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "acitation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                citation = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aissue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                issue = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "adoi".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                doi = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "avolume".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                volume = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "adateCreated".equals(notXml[i])) {
                i++;
                dateCreated = new java.util.Date(Long.parseLong(notXml[i]));
                i++;
            }
            if ((i < notXml.length) && "afirstAuthor".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                firstAuthor = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amonth".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                month = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aabstractText".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                abstractText = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asummary".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                summary = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apages".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pages = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apubXrefId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pubXrefId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apubMedId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pubMedId = string == null ? notXml[i] : string.toString();
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
        phenotypes = new ProxyCollection<org.intermine.model.bio.Phenotype>(os, this, "phenotypes", org.intermine.model.bio.Phenotype.class);
        authors = new ProxyCollection<org.intermine.model.bio.Author>(os, this, "authors", org.intermine.model.bio.Author.class);
        literatureTopics = new ProxyCollection<org.intermine.model.bio.LiteratureTopic>(os, this, "literatureTopics", org.intermine.model.bio.LiteratureTopic.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.DatabaseReference>(os, this, "crossReferences", org.intermine.model.bio.DatabaseReference.class);
        entities = new ProxyCollection<org.intermine.model.bio.Annotatable>(os, this, "entities", org.intermine.model.bio.Annotatable.class);
        meshTerms = new ProxyCollection<org.intermine.model.bio.MeshTerm>(os, this, "meshTerms", org.intermine.model.bio.MeshTerm.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("phenotypes".equals(fieldName)) {
            phenotypes.add((org.intermine.model.bio.Phenotype) element);
        } else if ("authors".equals(fieldName)) {
            authors.add((org.intermine.model.bio.Author) element);
        } else if ("literatureTopics".equals(fieldName)) {
            literatureTopics.add((org.intermine.model.bio.LiteratureTopic) element);
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences.add((org.intermine.model.bio.DatabaseReference) element);
        } else if ("entities".equals(fieldName)) {
            entities.add((org.intermine.model.bio.Annotatable) element);
        } else if ("meshTerms".equals(fieldName)) {
            meshTerms.add((org.intermine.model.bio.MeshTerm) element);
        } else {
            if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("phenotypes".equals(fieldName)) {
            return org.intermine.model.bio.Phenotype.class;
        }
        if ("authors".equals(fieldName)) {
            return org.intermine.model.bio.Author.class;
        }
        if ("literatureTopics".equals(fieldName)) {
            return org.intermine.model.bio.LiteratureTopic.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return org.intermine.model.bio.DatabaseReference.class;
        }
        if ("entities".equals(fieldName)) {
            return org.intermine.model.bio.Annotatable.class;
        }
        if ("meshTerms".equals(fieldName)) {
            return org.intermine.model.bio.MeshTerm.class;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Publication.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
