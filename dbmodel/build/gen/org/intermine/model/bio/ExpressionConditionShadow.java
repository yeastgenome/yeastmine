package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionConditionShadow implements ExpressionCondition, ShadowClass
{
    public static final Class<ExpressionCondition> shadowOf = ExpressionCondition.class;
    // Attr: org.intermine.model.bio.ExpressionCondition.conditionname
    protected java.lang.String conditionname;
    public java.lang.String getConditionname() { return conditionname; }
    public void setConditionname(final java.lang.String conditionname) { this.conditionname = conditionname; }

    // Attr: org.intermine.model.bio.ExpressionCondition.ordernumber
    protected java.lang.Integer ordernumber;
    public java.lang.Integer getOrdernumber() { return ordernumber; }
    public void setOrdernumber(final java.lang.Integer ordernumber) { this.ordernumber = ordernumber; }

    // Ref: org.intermine.model.bio.ExpressionCondition.expressiondataset
    protected org.intermine.model.InterMineObject expressiondataset;
    public org.intermine.model.bio.ExpressionDataSet getExpressiondataset() { if (expressiondataset instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ExpressionDataSet) ((org.intermine.objectstore.proxy.ProxyReference) expressiondataset).getObject()); }; return (org.intermine.model.bio.ExpressionDataSet) expressiondataset; }
    public void setExpressiondataset(final org.intermine.model.bio.ExpressionDataSet expressiondataset) { this.expressiondataset = expressiondataset; }
    public void proxyExpressiondataset(final org.intermine.objectstore.proxy.ProxyReference expressiondataset) { this.expressiondataset = expressiondataset; }
    public org.intermine.model.InterMineObject proxGetExpressiondataset() { return expressiondataset; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionCondition && id != null) ? id.equals(((ExpressionCondition)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionCondition [conditionname=" + (conditionname == null ? "null" : "\"" + conditionname + "\"") + ", expressiondataset=" + (expressiondataset == null ? "null" : (expressiondataset.getId() == null ? "no id" : expressiondataset.getId().toString())) + ", id=" + id + ", ordernumber=" + ordernumber + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("conditionname".equals(fieldName)) {
            return conditionname;
        }
        if ("ordernumber".equals(fieldName)) {
            return ordernumber;
        }
        if ("expressiondataset".equals(fieldName)) {
            if (expressiondataset instanceof ProxyReference) {
                return ((ProxyReference) expressiondataset).getObject();
            } else {
                return expressiondataset;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionCondition.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("conditionname".equals(fieldName)) {
            return conditionname;
        }
        if ("ordernumber".equals(fieldName)) {
            return ordernumber;
        }
        if ("expressiondataset".equals(fieldName)) {
            return expressiondataset;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionCondition.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("conditionname".equals(fieldName)) {
            conditionname = (java.lang.String) value;
        } else if ("ordernumber".equals(fieldName)) {
            ordernumber = (java.lang.Integer) value;
        } else if ("expressiondataset".equals(fieldName)) {
            expressiondataset = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionCondition.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("conditionname".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ordernumber".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("expressiondataset".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionDataSet.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionCondition.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionCondition.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionConditionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionCondition");
        if (conditionname != null) {
            sb.append("$_^aconditionname$_^");
            String string = conditionname;
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
        if (ordernumber != null) {
            sb.append("$_^aordernumber$_^").append(ordernumber);
        }
        if (expressiondataset != null) {
            sb.append("$_^rexpressiondataset$_^").append(expressiondataset.getId());
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
        if (!org.intermine.model.bio.ExpressionConditionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionCondition)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aconditionname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                conditionname = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aordernumber".equals(notXml[i])) {
                i++;
                ordernumber = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rexpressiondataset".equals(notXml[i])) {
                i++;
                expressiondataset = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ExpressionDataSet.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.ExpressionCondition.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.ExpressionCondition.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionCondition.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
