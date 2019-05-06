package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class CausalRelationshipShadow implements CausalRelationship, ShadowClass
{
    public static final Class<CausalRelationship> shadowOf = CausalRelationship.class;
    // Ref: org.intermine.model.bio.CausalRelationship.type
    protected org.intermine.model.InterMineObject type;
    public org.intermine.model.bio.OntologyTerm getType() { if (type instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) type).getObject()); }; return (org.intermine.model.bio.OntologyTerm) type; }
    public void setType(final org.intermine.model.bio.OntologyTerm type) { this.type = type; }
    public void proxyType(final org.intermine.objectstore.proxy.ProxyReference type) { this.type = type; }
    public org.intermine.model.InterMineObject proxGetType() { return type; }

    // Ref: org.intermine.model.bio.CausalRelationship.feature
    protected org.intermine.model.InterMineObject feature;
    public org.intermine.model.bio.BioEntity getFeature() { if (feature instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) feature).getObject()); }; return (org.intermine.model.bio.BioEntity) feature; }
    public void setFeature(final org.intermine.model.bio.BioEntity feature) { this.feature = feature; }
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature) { this.feature = feature; }
    public org.intermine.model.InterMineObject proxGetFeature() { return feature; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof CausalRelationship && id != null) ? id.equals(((CausalRelationship)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "CausalRelationship [feature=" + (feature == null ? "null" : (feature.getId() == null ? "no id" : feature.getId().toString())) + ", id=" + id + ", type=" + (type == null ? "null" : (type.getId() == null ? "no id" : type.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            if (type instanceof ProxyReference) {
                return ((ProxyReference) type).getObject();
            } else {
                return type;
            }
        }
        if ("feature".equals(fieldName)) {
            if (feature instanceof ProxyReference) {
                return ((ProxyReference) feature).getObject();
            } else {
                return feature;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.CausalRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("feature".equals(fieldName)) {
            return feature;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.CausalRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("type".equals(fieldName)) {
            type = (org.intermine.model.InterMineObject) value;
        } else if ("feature".equals(fieldName)) {
            feature = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.CausalRelationship.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("type".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("feature".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.CausalRelationship.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.CausalRelationship.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.CausalRelationshipShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.CausalRelationship");
        if (type != null) {
            sb.append("$_^rtype$_^").append(type.getId());
        }
        if (feature != null) {
            sb.append("$_^rfeature$_^").append(feature.getId());
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
        if (!org.intermine.model.bio.CausalRelationshipShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.CausalRelationship)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) &&"rtype".equals(notXml[i])) {
                i++;
                type = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rfeature".equals(notXml[i])) {
                i++;
                feature = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
            if (!org.intermine.model.bio.CausalRelationship.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.CausalRelationship.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.CausalRelationship.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
