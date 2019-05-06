package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionDataSetTagShadow implements ExpressionDataSetTag, ShadowClass
{
    public static final Class<ExpressionDataSetTag> shadowOf = ExpressionDataSetTag.class;
    // Attr: org.intermine.model.bio.ExpressionDataSetTag.tagname
    protected java.lang.String tagname;
    public java.lang.String getTagname() { return tagname; }
    public void setTagname(final java.lang.String tagname) { this.tagname = tagname; }

    // Col: org.intermine.model.bio.ExpressionDataSetTag.expressiondatasets
    protected java.util.Set<org.intermine.model.bio.ExpressionDataSet> expressiondatasets = new java.util.HashSet<org.intermine.model.bio.ExpressionDataSet>();
    public java.util.Set<org.intermine.model.bio.ExpressionDataSet> getExpressiondatasets() { return expressiondatasets; }
    public void setExpressiondatasets(final java.util.Set<org.intermine.model.bio.ExpressionDataSet> expressiondatasets) { this.expressiondatasets = expressiondatasets; }
    public void addExpressiondatasets(final org.intermine.model.bio.ExpressionDataSet arg) { expressiondatasets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionDataSetTag && id != null) ? id.equals(((ExpressionDataSetTag)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionDataSetTag [id=" + id + ", tagname=" + (tagname == null ? "null" : "\"" + tagname + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("tagname".equals(fieldName)) {
            return tagname;
        }
        if ("expressiondatasets".equals(fieldName)) {
            return expressiondatasets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionDataSetTag.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("tagname".equals(fieldName)) {
            return tagname;
        }
        if ("expressiondatasets".equals(fieldName)) {
            return expressiondatasets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionDataSetTag.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("tagname".equals(fieldName)) {
            tagname = (java.lang.String) value;
        } else if ("expressiondatasets".equals(fieldName)) {
            expressiondatasets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionDataSetTag.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("tagname".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("expressiondatasets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionDataSetTag.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionDataSetTag.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionDataSetTagShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionDataSetTag");
        if (tagname != null) {
            sb.append("$_^atagname$_^");
            String string = tagname;
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
        if (!org.intermine.model.bio.ExpressionDataSetTagShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionDataSetTag)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atagname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                tagname = string == null ? notXml[i] : string.toString();
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
        expressiondatasets = new ProxyCollection<org.intermine.model.bio.ExpressionDataSet>(os, this, "expressiondatasets", org.intermine.model.bio.ExpressionDataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("expressiondatasets".equals(fieldName)) {
            expressiondatasets.add((org.intermine.model.bio.ExpressionDataSet) element);
        } else {
            if (!org.intermine.model.bio.ExpressionDataSetTag.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("expressiondatasets".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionDataSet.class;
        }
        if (!org.intermine.model.bio.ExpressionDataSetTag.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionDataSetTag.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
