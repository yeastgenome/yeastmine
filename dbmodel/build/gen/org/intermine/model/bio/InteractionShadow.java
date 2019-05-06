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

public class InteractionShadow implements Interaction, ShadowClass
{
    public static final Class<Interaction> shadowOf = Interaction.class;
    // Ref: org.intermine.model.bio.Interaction.participant2
    protected org.intermine.model.InterMineObject participant2;
    public org.intermine.model.bio.BioEntity getParticipant2() { if (participant2 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) participant2).getObject()); }; return (org.intermine.model.bio.BioEntity) participant2; }
    public void setParticipant2(final org.intermine.model.bio.BioEntity participant2) { this.participant2 = participant2; }
    public void proxyParticipant2(final org.intermine.objectstore.proxy.ProxyReference participant2) { this.participant2 = participant2; }
    public org.intermine.model.InterMineObject proxGetParticipant2() { return participant2; }

    // Ref: org.intermine.model.bio.Interaction.complex
    protected org.intermine.model.InterMineObject complex;
    public org.intermine.model.bio.Complex getComplex() { if (complex instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Complex) ((org.intermine.objectstore.proxy.ProxyReference) complex).getObject()); }; return (org.intermine.model.bio.Complex) complex; }
    public void setComplex(final org.intermine.model.bio.Complex complex) { this.complex = complex; }
    public void proxyComplex(final org.intermine.objectstore.proxy.ProxyReference complex) { this.complex = complex; }
    public org.intermine.model.InterMineObject proxGetComplex() { return complex; }

    // Ref: org.intermine.model.bio.Interaction.participant1
    protected org.intermine.model.InterMineObject participant1;
    public org.intermine.model.bio.BioEntity getParticipant1() { if (participant1 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) participant1).getObject()); }; return (org.intermine.model.bio.BioEntity) participant1; }
    public void setParticipant1(final org.intermine.model.bio.BioEntity participant1) { this.participant1 = participant1; }
    public void proxyParticipant1(final org.intermine.objectstore.proxy.ProxyReference participant1) { this.participant1 = participant1; }
    public org.intermine.model.InterMineObject proxGetParticipant1() { return participant1; }

    // Col: org.intermine.model.bio.Interaction.details
    protected java.util.Set<org.intermine.model.bio.InteractionDetail> details = new java.util.HashSet<org.intermine.model.bio.InteractionDetail>();
    public java.util.Set<org.intermine.model.bio.InteractionDetail> getDetails() { return details; }
    public void setDetails(final java.util.Set<org.intermine.model.bio.InteractionDetail> details) { this.details = details; }
    public void addDetails(final org.intermine.model.bio.InteractionDetail arg) { details.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Interaction && id != null) ? id.equals(((Interaction)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Interaction [complex=" + (complex == null ? "null" : (complex.getId() == null ? "no id" : complex.getId().toString())) + ", id=" + id + ", participant1=" + (participant1 == null ? "null" : (participant1.getId() == null ? "no id" : participant1.getId().toString())) + ", participant2=" + (participant2 == null ? "null" : (participant2.getId() == null ? "no id" : participant2.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("participant2".equals(fieldName)) {
            if (participant2 instanceof ProxyReference) {
                return ((ProxyReference) participant2).getObject();
            } else {
                return participant2;
            }
        }
        if ("complex".equals(fieldName)) {
            if (complex instanceof ProxyReference) {
                return ((ProxyReference) complex).getObject();
            } else {
                return complex;
            }
        }
        if ("participant1".equals(fieldName)) {
            if (participant1 instanceof ProxyReference) {
                return ((ProxyReference) participant1).getObject();
            } else {
                return participant1;
            }
        }
        if ("details".equals(fieldName)) {
            return details;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Interaction.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("participant2".equals(fieldName)) {
            return participant2;
        }
        if ("complex".equals(fieldName)) {
            return complex;
        }
        if ("participant1".equals(fieldName)) {
            return participant1;
        }
        if ("details".equals(fieldName)) {
            return details;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Interaction.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("participant2".equals(fieldName)) {
            participant2 = (org.intermine.model.InterMineObject) value;
        } else if ("complex".equals(fieldName)) {
            complex = (org.intermine.model.InterMineObject) value;
        } else if ("participant1".equals(fieldName)) {
            participant1 = (org.intermine.model.InterMineObject) value;
        } else if ("details".equals(fieldName)) {
            details = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Interaction.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("participant2".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("complex".equals(fieldName)) {
            return org.intermine.model.bio.Complex.class;
        }
        if ("participant1".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("details".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Interaction.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Interaction.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.InteractionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Interaction");
        if (participant2 != null) {
            sb.append("$_^rparticipant2$_^").append(participant2.getId());
        }
        if (complex != null) {
            sb.append("$_^rcomplex$_^").append(complex.getId());
        }
        if (participant1 != null) {
            sb.append("$_^rparticipant1$_^").append(participant1.getId());
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
        if (!org.intermine.model.bio.InteractionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Interaction)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) &&"rparticipant2".equals(notXml[i])) {
                i++;
                participant2 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
                i++;
            };
            if ((i < notXml.length) &&"rcomplex".equals(notXml[i])) {
                i++;
                complex = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Complex.class);
                i++;
            };
            if ((i < notXml.length) &&"rparticipant1".equals(notXml[i])) {
                i++;
                participant1 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
        details = new ProxyCollection<org.intermine.model.bio.InteractionDetail>(os, this, "details", org.intermine.model.bio.InteractionDetail.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("details".equals(fieldName)) {
            details.add((org.intermine.model.bio.InteractionDetail) element);
        } else {
            if (!org.intermine.model.bio.Interaction.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("details".equals(fieldName)) {
            return org.intermine.model.bio.InteractionDetail.class;
        }
        if (!org.intermine.model.bio.Interaction.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Interaction.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
