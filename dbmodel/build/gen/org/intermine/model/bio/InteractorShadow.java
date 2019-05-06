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

public class InteractorShadow implements Interactor, ShadowClass
{
    public static final Class<Interactor> shadowOf = Interactor.class;
    // Attr: org.intermine.model.bio.Interactor.annotations
    protected java.lang.String annotations;
    public java.lang.String getAnnotations() { return annotations; }
    public void setAnnotations(final java.lang.String annotations) { this.annotations = annotations; }

    // Attr: org.intermine.model.bio.Interactor.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.Interactor.stoichiometry
    protected java.lang.Integer stoichiometry;
    public java.lang.Integer getStoichiometry() { return stoichiometry; }
    public void setStoichiometry(final java.lang.Integer stoichiometry) { this.stoichiometry = stoichiometry; }

    // Attr: org.intermine.model.bio.Interactor.biologicalRole
    protected java.lang.String biologicalRole;
    public java.lang.String getBiologicalRole() { return biologicalRole; }
    public void setBiologicalRole(final java.lang.String biologicalRole) { this.biologicalRole = biologicalRole; }

    // Ref: org.intermine.model.bio.Interactor.participant
    protected org.intermine.model.InterMineObject participant;
    public org.intermine.model.bio.BioEntity getParticipant() { if (participant instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) participant).getObject()); }; return (org.intermine.model.bio.BioEntity) participant; }
    public void setParticipant(final org.intermine.model.bio.BioEntity participant) { this.participant = participant; }
    public void proxyParticipant(final org.intermine.objectstore.proxy.ProxyReference participant) { this.participant = participant; }
    public org.intermine.model.InterMineObject proxGetParticipant() { return participant; }

    // Col: org.intermine.model.bio.Interactor.interactions
    protected java.util.Set<org.intermine.model.bio.Interaction> interactions = new java.util.HashSet<org.intermine.model.bio.Interaction>();
    public java.util.Set<org.intermine.model.bio.Interaction> getInteractions() { return interactions; }
    public void setInteractions(final java.util.Set<org.intermine.model.bio.Interaction> interactions) { this.interactions = interactions; }
    public void addInteractions(final org.intermine.model.bio.Interaction arg) { interactions.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Interactor && id != null) ? id.equals(((Interactor)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Interactor [annotations=" + (annotations == null ? "null" : "\"" + annotations + "\"") + ", biologicalRole=" + (biologicalRole == null ? "null" : "\"" + biologicalRole + "\"") + ", id=" + id + ", participant=" + (participant == null ? "null" : (participant.getId() == null ? "no id" : participant.getId().toString())) + ", stoichiometry=" + stoichiometry + ", type=" + (type == null ? "null" : "\"" + type + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("annotations".equals(fieldName)) {
            return annotations;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("stoichiometry".equals(fieldName)) {
            return stoichiometry;
        }
        if ("biologicalRole".equals(fieldName)) {
            return biologicalRole;
        }
        if ("participant".equals(fieldName)) {
            if (participant instanceof ProxyReference) {
                return ((ProxyReference) participant).getObject();
            } else {
                return participant;
            }
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Interactor.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("annotations".equals(fieldName)) {
            return annotations;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("stoichiometry".equals(fieldName)) {
            return stoichiometry;
        }
        if ("biologicalRole".equals(fieldName)) {
            return biologicalRole;
        }
        if ("participant".equals(fieldName)) {
            return participant;
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Interactor.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("annotations".equals(fieldName)) {
            annotations = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("stoichiometry".equals(fieldName)) {
            stoichiometry = (java.lang.Integer) value;
        } else if ("biologicalRole".equals(fieldName)) {
            biologicalRole = (java.lang.String) value;
        } else if ("participant".equals(fieldName)) {
            participant = (org.intermine.model.InterMineObject) value;
        } else if ("interactions".equals(fieldName)) {
            interactions = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Interactor.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("annotations".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("stoichiometry".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("biologicalRole".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("participant".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("interactions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Interactor.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Interactor.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.InteractorShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Interactor");
        if (annotations != null) {
            sb.append("$_^aannotations$_^");
            String string = annotations;
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
        if (stoichiometry != null) {
            sb.append("$_^astoichiometry$_^").append(stoichiometry);
        }
        if (biologicalRole != null) {
            sb.append("$_^abiologicalRole$_^");
            String string = biologicalRole;
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
        if (participant != null) {
            sb.append("$_^rparticipant$_^").append(participant.getId());
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
        if (!org.intermine.model.bio.InteractorShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Interactor)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aannotations".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                annotations = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "astoichiometry".equals(notXml[i])) {
                i++;
                stoichiometry = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "abiologicalRole".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                biologicalRole = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rparticipant".equals(notXml[i])) {
                i++;
                participant = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
        interactions = new ProxyCollection<org.intermine.model.bio.Interaction>(os, this, "interactions", org.intermine.model.bio.Interaction.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("interactions".equals(fieldName)) {
            interactions.add((org.intermine.model.bio.Interaction) element);
        } else {
            if (!org.intermine.model.bio.Interactor.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("interactions".equals(fieldName)) {
            return org.intermine.model.bio.Interaction.class;
        }
        if (!org.intermine.model.bio.Interactor.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Interactor.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
