package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ProteinPropertyShadow implements ProteinProperty, ShadowClass
{
    public static final Class<ProteinProperty> shadowOf = ProteinProperty.class;
    // Attr: org.intermine.model.bio.ProteinProperty.location
    protected java.lang.String location;
    public java.lang.String getLocation() { return location; }
    public void setLocation(final java.lang.String location) { this.location = location; }

    // Attr: org.intermine.model.bio.ProteinProperty.source
    protected java.lang.String source;
    public java.lang.String getSource() { return source; }
    public void setSource(final java.lang.String source) { this.source = source; }

    // Attr: org.intermine.model.bio.ProteinProperty.propertyName
    protected java.lang.String propertyName;
    public java.lang.String getPropertyName() { return propertyName; }
    public void setPropertyName(final java.lang.String propertyName) { this.propertyName = propertyName; }

    // Attr: org.intermine.model.bio.ProteinProperty.isReversible
    protected java.lang.String isReversible;
    public java.lang.String getIsReversible() { return isReversible; }
    public void setIsReversible(final java.lang.String isReversible) { this.isReversible = isReversible; }

    // Attr: org.intermine.model.bio.ProteinProperty.condition
    protected java.lang.String condition;
    public java.lang.String getCondition() { return condition; }
    public void setCondition(final java.lang.String condition) { this.condition = condition; }

    // Ref: org.intermine.model.bio.ProteinProperty.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.ProteinProperty.proteins
    protected java.util.Set<org.intermine.model.bio.Protein> proteins = new java.util.HashSet<org.intermine.model.bio.Protein>();
    public java.util.Set<org.intermine.model.bio.Protein> getProteins() { return proteins; }
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins) { this.proteins = proteins; }
    public void addProteins(final org.intermine.model.bio.Protein arg) { proteins.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ProteinProperty && id != null) ? id.equals(((ProteinProperty)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ProteinProperty [condition=" + (condition == null ? "null" : "\"" + condition + "\"") + ", id=" + id + ", isReversible=" + (isReversible == null ? "null" : "\"" + isReversible + "\"") + ", location=" + (location == null ? "null" : "\"" + location + "\"") + ", propertyName=" + (propertyName == null ? "null" : "\"" + propertyName + "\"") + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", source=" + (source == null ? "null" : "\"" + source + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("location".equals(fieldName)) {
            return location;
        }
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("propertyName".equals(fieldName)) {
            return propertyName;
        }
        if ("isReversible".equals(fieldName)) {
            return isReversible;
        }
        if ("condition".equals(fieldName)) {
            return condition;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinProperty.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("location".equals(fieldName)) {
            return location;
        }
        if ("source".equals(fieldName)) {
            return source;
        }
        if ("propertyName".equals(fieldName)) {
            return propertyName;
        }
        if ("isReversible".equals(fieldName)) {
            return isReversible;
        }
        if ("condition".equals(fieldName)) {
            return condition;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinProperty.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("location".equals(fieldName)) {
            location = (java.lang.String) value;
        } else if ("source".equals(fieldName)) {
            source = (java.lang.String) value;
        } else if ("propertyName".equals(fieldName)) {
            propertyName = (java.lang.String) value;
        } else if ("isReversible".equals(fieldName)) {
            isReversible = (java.lang.String) value;
        } else if ("condition".equals(fieldName)) {
            condition = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("proteins".equals(fieldName)) {
            proteins = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ProteinProperty.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("location".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("source".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("propertyName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("isReversible".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("condition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("proteins".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ProteinProperty.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ProteinProperty.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinPropertyShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ProteinProperty");
        if (location != null) {
            sb.append("$_^alocation$_^");
            String string = location;
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
        if (source != null) {
            sb.append("$_^asource$_^");
            String string = source;
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
        if (propertyName != null) {
            sb.append("$_^apropertyName$_^");
            String string = propertyName;
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
        if (isReversible != null) {
            sb.append("$_^aisReversible$_^");
            String string = isReversible;
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
        if (condition != null) {
            sb.append("$_^acondition$_^");
            String string = condition;
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
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
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
        if (!org.intermine.model.bio.ProteinPropertyShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ProteinProperty)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "alocation".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                location = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                source = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apropertyName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                propertyName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aisReversible".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                isReversible = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acondition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                condition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        proteins = new ProxyCollection<org.intermine.model.bio.Protein>(os, this, "proteins", org.intermine.model.bio.Protein.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("proteins".equals(fieldName)) {
            proteins.add((org.intermine.model.bio.Protein) element);
        } else {
            if (!org.intermine.model.bio.ProteinProperty.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("proteins".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if (!org.intermine.model.bio.ProteinProperty.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ProteinProperty.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
