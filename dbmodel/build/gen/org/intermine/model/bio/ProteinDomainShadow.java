package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ProteinDomainShadow implements ProteinDomain, ShadowClass
{
    public static final Class<ProteinDomain> shadowOf = ProteinDomain.class;
    // Attr: org.intermine.model.bio.ProteinDomain.method
    protected java.lang.String method;
    public java.lang.String getMethod() { return method; }
    public void setMethod(final java.lang.String method) { this.method = method; }

    // Attr: org.intermine.model.bio.ProteinDomain.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.ProteinDomain.interpro
    protected java.lang.String interpro;
    public java.lang.String getInterpro() { return interpro; }
    public void setInterpro(final java.lang.String interpro) { this.interpro = interpro; }

    // Attr: org.intermine.model.bio.ProteinDomain.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.ProteinDomain.start
    protected java.lang.Integer start;
    public java.lang.Integer getStart() { return start; }
    public void setStart(final java.lang.Integer start) { this.start = start; }

    // Attr: org.intermine.model.bio.ProteinDomain.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.ProteinDomain.runDate
    protected java.lang.String runDate;
    public java.lang.String getRunDate() { return runDate; }
    public void setRunDate(final java.lang.String runDate) { this.runDate = runDate; }

    // Attr: org.intermine.model.bio.ProteinDomain.end
    protected java.lang.Integer end;
    public java.lang.Integer getEnd() { return end; }
    public void setEnd(final java.lang.Integer end) { this.end = end; }

    // Col: org.intermine.model.bio.ProteinDomain.proteins
    protected java.util.Set<org.intermine.model.bio.Protein> proteins = new java.util.HashSet<org.intermine.model.bio.Protein>();
    public java.util.Set<org.intermine.model.bio.Protein> getProteins() { return proteins; }
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins) { this.proteins = proteins; }
    public void addProteins(final org.intermine.model.bio.Protein arg) { proteins.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ProteinDomain && id != null) ? id.equals(((ProteinDomain)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ProteinDomain [description=" + (description == null ? "null" : "\"" + description + "\"") + ", end=" + end + ", id=" + id + ", interpro=" + (interpro == null ? "null" : "\"" + interpro + "\"") + ", method=" + (method == null ? "null" : "\"" + method + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", runDate=" + (runDate == null ? "null" : "\"" + runDate + "\"") + ", start=" + start + ", type=" + (type == null ? "null" : "\"" + type + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("method".equals(fieldName)) {
            return method;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("interpro".equals(fieldName)) {
            return interpro;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("runDate".equals(fieldName)) {
            return runDate;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinDomain.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("method".equals(fieldName)) {
            return method;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("interpro".equals(fieldName)) {
            return interpro;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("runDate".equals(fieldName)) {
            return runDate;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("proteins".equals(fieldName)) {
            return proteins;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinDomain.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("method".equals(fieldName)) {
            method = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("interpro".equals(fieldName)) {
            interpro = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("start".equals(fieldName)) {
            start = (java.lang.Integer) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("runDate".equals(fieldName)) {
            runDate = (java.lang.String) value;
        } else if ("end".equals(fieldName)) {
            end = (java.lang.Integer) value;
        } else if ("proteins".equals(fieldName)) {
            proteins = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ProteinDomain.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("method".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("interpro".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("start".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("runDate".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("end".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("proteins".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ProteinDomain.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ProteinDomain.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinDomainShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ProteinDomain");
        if (method != null) {
            sb.append("$_^amethod$_^");
            String string = method;
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
        if (interpro != null) {
            sb.append("$_^ainterpro$_^");
            String string = interpro;
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
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
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
        if (start != null) {
            sb.append("$_^astart$_^").append(start);
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
        if (runDate != null) {
            sb.append("$_^arunDate$_^");
            String string = runDate;
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
        if (end != null) {
            sb.append("$_^aend$_^").append(end);
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
        if (!org.intermine.model.bio.ProteinDomainShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ProteinDomain)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "amethod".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                method = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "ainterpro".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                interpro = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astart".equals(notXml[i])) {
                i++;
                start = Integer.valueOf(notXml[i]);
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
            if ((i < notXml.length) && "arunDate".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                runDate = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aend".equals(notXml[i])) {
                i++;
                end = Integer.valueOf(notXml[i]);
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
        proteins = new ProxyCollection<org.intermine.model.bio.Protein>(os, this, "proteins", org.intermine.model.bio.Protein.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("proteins".equals(fieldName)) {
            proteins.add((org.intermine.model.bio.Protein) element);
        } else {
            if (!org.intermine.model.bio.ProteinDomain.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.ProteinDomain.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ProteinDomain.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
