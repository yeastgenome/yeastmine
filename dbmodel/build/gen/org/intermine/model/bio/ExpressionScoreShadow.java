package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ExpressionScoreShadow implements ExpressionScore, ShadowClass
{
    public static final Class<ExpressionScore> shadowOf = ExpressionScore.class;
    // Attr: org.intermine.model.bio.ExpressionScore.score
    protected java.lang.Float score;
    public java.lang.Float getScore() { return score; }
    public void setScore(final java.lang.Float score) { this.score = score; }

    // Ref: org.intermine.model.bio.ExpressionScore.expressioncondition
    protected org.intermine.model.InterMineObject expressioncondition;
    public org.intermine.model.bio.ExpressionCondition getExpressioncondition() { if (expressioncondition instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ExpressionCondition) ((org.intermine.objectstore.proxy.ProxyReference) expressioncondition).getObject()); }; return (org.intermine.model.bio.ExpressionCondition) expressioncondition; }
    public void setExpressioncondition(final org.intermine.model.bio.ExpressionCondition expressioncondition) { this.expressioncondition = expressioncondition; }
    public void proxyExpressioncondition(final org.intermine.objectstore.proxy.ProxyReference expressioncondition) { this.expressioncondition = expressioncondition; }
    public org.intermine.model.InterMineObject proxGetExpressioncondition() { return expressioncondition; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionScore && id != null) ? id.equals(((ExpressionScore)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionScore [expressioncondition=" + (expressioncondition == null ? "null" : (expressioncondition.getId() == null ? "no id" : expressioncondition.getId().toString())) + ", id=" + id + ", score=" + score + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("expressioncondition".equals(fieldName)) {
            if (expressioncondition instanceof ProxyReference) {
                return ((ProxyReference) expressioncondition).getObject();
            } else {
                return expressioncondition;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionScore.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("expressioncondition".equals(fieldName)) {
            return expressioncondition;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionScore.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("score".equals(fieldName)) {
            score = (java.lang.Float) value;
        } else if ("expressioncondition".equals(fieldName)) {
            expressioncondition = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionScore.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("score".equals(fieldName)) {
            return java.lang.Float.class;
        }
        if ("expressioncondition".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionCondition.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionScore.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionScore.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionScoreShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionScore");
        if (score != null) {
            sb.append("$_^ascore$_^").append(score);
        }
        if (expressioncondition != null) {
            sb.append("$_^rexpressioncondition$_^").append(expressioncondition.getId());
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
        if (!org.intermine.model.bio.ExpressionScoreShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionScore)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ascore".equals(notXml[i])) {
                i++;
                score = Float.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rexpressioncondition".equals(notXml[i])) {
                i++;
                expressioncondition = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ExpressionCondition.class);
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
            if (!org.intermine.model.bio.ExpressionScore.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.ExpressionScore.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionScore.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
