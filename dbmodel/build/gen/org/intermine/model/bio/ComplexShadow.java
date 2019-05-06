package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ComplexShadow implements Complex, ShadowClass
{
    public static final Class<Complex> shadowOf = Complex.class;
    // Attr: org.intermine.model.bio.Complex.properties
    protected java.lang.String properties;
    public java.lang.String getProperties() { return properties; }
    public void setProperties(final java.lang.String properties) { this.properties = properties; }

    // Attr: org.intermine.model.bio.Complex.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.Complex.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.Complex.systematicName
    protected java.lang.String systematicName;
    public java.lang.String getSystematicName() { return systematicName; }
    public void setSystematicName(final java.lang.String systematicName) { this.systematicName = systematicName; }

    // Attr: org.intermine.model.bio.Complex.function
    protected java.lang.String function;
    public java.lang.String getFunction() { return function; }
    public void setFunction(final java.lang.String function) { this.function = function; }

    // Col: org.intermine.model.bio.Complex.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.Complex.allInteractors
    protected java.util.Set<org.intermine.model.bio.Interactor> allInteractors = new java.util.HashSet<org.intermine.model.bio.Interactor>();
    public java.util.Set<org.intermine.model.bio.Interactor> getAllInteractors() { return allInteractors; }
    public void setAllInteractors(final java.util.Set<org.intermine.model.bio.Interactor> allInteractors) { this.allInteractors = allInteractors; }
    public void addAllInteractors(final org.intermine.model.bio.Interactor arg) { allInteractors.add(arg); }

    // Col: org.intermine.model.bio.Complex.goAnnotation
    protected java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation = new java.util.HashSet<org.intermine.model.bio.GOAnnotation>();
    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation() { return goAnnotation; }
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation) { this.goAnnotation = goAnnotation; }
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg) { goAnnotation.add(arg); }

    // Col: org.intermine.model.bio.Complex.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Complex && id != null) ? id.equals(((Complex)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Complex [function=" + (function == null ? "null" : "\"" + function + "\"") + ", id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", properties=" + (properties == null ? "null" : "\"" + properties + "\"") + ", systematicName=" + (systematicName == null ? "null" : "\"" + systematicName + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("properties".equals(fieldName)) {
            return properties;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("systematicName".equals(fieldName)) {
            return systematicName;
        }
        if ("function".equals(fieldName)) {
            return function;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("allInteractors".equals(fieldName)) {
            return allInteractors;
        }
        if ("goAnnotation".equals(fieldName)) {
            return goAnnotation;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Complex.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("properties".equals(fieldName)) {
            return properties;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("systematicName".equals(fieldName)) {
            return systematicName;
        }
        if ("function".equals(fieldName)) {
            return function;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("allInteractors".equals(fieldName)) {
            return allInteractors;
        }
        if ("goAnnotation".equals(fieldName)) {
            return goAnnotation;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Complex.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("properties".equals(fieldName)) {
            properties = (java.lang.String) value;
        } else if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("systematicName".equals(fieldName)) {
            systematicName = (java.lang.String) value;
        } else if ("function".equals(fieldName)) {
            function = (java.lang.String) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("allInteractors".equals(fieldName)) {
            allInteractors = (java.util.Set) value;
        } else if ("goAnnotation".equals(fieldName)) {
            goAnnotation = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Complex.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("properties".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("systematicName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("function".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("allInteractors".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("goAnnotation".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Complex.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Complex.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ComplexShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Complex");
        if (properties != null) {
            sb.append("$_^aproperties$_^");
            String string = properties;
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
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (systematicName != null) {
            sb.append("$_^asystematicName$_^");
            String string = systematicName;
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
        if (function != null) {
            sb.append("$_^afunction$_^");
            String string = function;
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
        if (!org.intermine.model.bio.ComplexShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Complex)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aproperties".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                properties = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "asystematicName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                systematicName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afunction".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                function = string == null ? notXml[i] : string.toString();
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
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
        allInteractors = new ProxyCollection<org.intermine.model.bio.Interactor>(os, this, "allInteractors", org.intermine.model.bio.Interactor.class);
        goAnnotation = new ProxyCollection<org.intermine.model.bio.GOAnnotation>(os, this, "goAnnotation", org.intermine.model.bio.GOAnnotation.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("allInteractors".equals(fieldName)) {
            allInteractors.add((org.intermine.model.bio.Interactor) element);
        } else if ("goAnnotation".equals(fieldName)) {
            goAnnotation.add((org.intermine.model.bio.GOAnnotation) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.Complex.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("allInteractors".equals(fieldName)) {
            return org.intermine.model.bio.Interactor.class;
        }
        if ("goAnnotation".equals(fieldName)) {
            return org.intermine.model.bio.GOAnnotation.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.Complex.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Complex.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
