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

public class InteractionExperimentShadow implements InteractionExperiment, ShadowClass
{
    public static final Class<InteractionExperiment> shadowOf = InteractionExperiment.class;
    // Attr: org.intermine.model.bio.InteractionExperiment.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.InteractionExperiment.hostOrganism
    protected java.lang.String hostOrganism;
    public java.lang.String getHostOrganism() { return hostOrganism; }
    public void setHostOrganism(final java.lang.String hostOrganism) { this.hostOrganism = hostOrganism; }

    // Attr: org.intermine.model.bio.InteractionExperiment.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Ref: org.intermine.model.bio.InteractionExperiment.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.InteractionExperiment.interactionDetectionMethods
    protected java.util.Set<org.intermine.model.bio.InteractionTerm> interactionDetectionMethods = new java.util.HashSet<org.intermine.model.bio.InteractionTerm>();
    public java.util.Set<org.intermine.model.bio.InteractionTerm> getInteractionDetectionMethods() { return interactionDetectionMethods; }
    public void setInteractionDetectionMethods(final java.util.Set<org.intermine.model.bio.InteractionTerm> interactionDetectionMethods) { this.interactionDetectionMethods = interactionDetectionMethods; }
    public void addInteractionDetectionMethods(final org.intermine.model.bio.InteractionTerm arg) { interactionDetectionMethods.add(arg); }

    // Col: org.intermine.model.bio.InteractionExperiment.comments
    protected java.util.Set<org.intermine.model.bio.Comment> comments = new java.util.HashSet<org.intermine.model.bio.Comment>();
    public java.util.Set<org.intermine.model.bio.Comment> getComments() { return comments; }
    public void setComments(final java.util.Set<org.intermine.model.bio.Comment> comments) { this.comments = comments; }
    public void addComments(final org.intermine.model.bio.Comment arg) { comments.add(arg); }

    // Col: org.intermine.model.bio.InteractionExperiment.interactions
    protected java.util.Set<org.intermine.model.bio.InteractionDetail> interactions = new java.util.HashSet<org.intermine.model.bio.InteractionDetail>();
    public java.util.Set<org.intermine.model.bio.InteractionDetail> getInteractions() { return interactions; }
    public void setInteractions(final java.util.Set<org.intermine.model.bio.InteractionDetail> interactions) { this.interactions = interactions; }
    public void addInteractions(final org.intermine.model.bio.InteractionDetail arg) { interactions.add(arg); }

    // Col: org.intermine.model.bio.InteractionExperiment.participantIdentificationMethods
    protected java.util.Set<org.intermine.model.bio.InteractionTerm> participantIdentificationMethods = new java.util.HashSet<org.intermine.model.bio.InteractionTerm>();
    public java.util.Set<org.intermine.model.bio.InteractionTerm> getParticipantIdentificationMethods() { return participantIdentificationMethods; }
    public void setParticipantIdentificationMethods(final java.util.Set<org.intermine.model.bio.InteractionTerm> participantIdentificationMethods) { this.participantIdentificationMethods = participantIdentificationMethods; }
    public void addParticipantIdentificationMethods(final org.intermine.model.bio.InteractionTerm arg) { participantIdentificationMethods.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof InteractionExperiment && id != null) ? id.equals(((InteractionExperiment)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "InteractionExperiment [description=" + (description == null ? "null" : "\"" + description + "\"") + ", hostOrganism=" + (hostOrganism == null ? "null" : "\"" + hostOrganism + "\"") + ", id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("hostOrganism".equals(fieldName)) {
            return hostOrganism;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("interactionDetectionMethods".equals(fieldName)) {
            return interactionDetectionMethods;
        }
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("participantIdentificationMethods".equals(fieldName)) {
            return participantIdentificationMethods;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.InteractionExperiment.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("hostOrganism".equals(fieldName)) {
            return hostOrganism;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("interactionDetectionMethods".equals(fieldName)) {
            return interactionDetectionMethods;
        }
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("interactions".equals(fieldName)) {
            return interactions;
        }
        if ("participantIdentificationMethods".equals(fieldName)) {
            return participantIdentificationMethods;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.InteractionExperiment.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("hostOrganism".equals(fieldName)) {
            hostOrganism = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("interactionDetectionMethods".equals(fieldName)) {
            interactionDetectionMethods = (java.util.Set) value;
        } else if ("comments".equals(fieldName)) {
            comments = (java.util.Set) value;
        } else if ("interactions".equals(fieldName)) {
            interactions = (java.util.Set) value;
        } else if ("participantIdentificationMethods".equals(fieldName)) {
            participantIdentificationMethods = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.InteractionExperiment.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("hostOrganism".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("interactionDetectionMethods".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("comments".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("interactions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("participantIdentificationMethods".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.InteractionExperiment.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.InteractionExperiment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.InteractionExperimentShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.InteractionExperiment");
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
        if (hostOrganism != null) {
            sb.append("$_^ahostOrganism$_^");
            String string = hostOrganism;
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
        if (!org.intermine.model.bio.InteractionExperimentShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.InteractionExperiment)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
            if ((i < notXml.length) && "ahostOrganism".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                hostOrganism = string == null ? notXml[i] : string.toString();
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
        interactionDetectionMethods = new ProxyCollection<org.intermine.model.bio.InteractionTerm>(os, this, "interactionDetectionMethods", org.intermine.model.bio.InteractionTerm.class);
        comments = new ProxyCollection<org.intermine.model.bio.Comment>(os, this, "comments", org.intermine.model.bio.Comment.class);
        interactions = new ProxyCollection<org.intermine.model.bio.InteractionDetail>(os, this, "interactions", org.intermine.model.bio.InteractionDetail.class);
        participantIdentificationMethods = new ProxyCollection<org.intermine.model.bio.InteractionTerm>(os, this, "participantIdentificationMethods", org.intermine.model.bio.InteractionTerm.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("interactionDetectionMethods".equals(fieldName)) {
            interactionDetectionMethods.add((org.intermine.model.bio.InteractionTerm) element);
        } else if ("comments".equals(fieldName)) {
            comments.add((org.intermine.model.bio.Comment) element);
        } else if ("interactions".equals(fieldName)) {
            interactions.add((org.intermine.model.bio.InteractionDetail) element);
        } else if ("participantIdentificationMethods".equals(fieldName)) {
            participantIdentificationMethods.add((org.intermine.model.bio.InteractionTerm) element);
        } else {
            if (!org.intermine.model.bio.InteractionExperiment.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("interactionDetectionMethods".equals(fieldName)) {
            return org.intermine.model.bio.InteractionTerm.class;
        }
        if ("comments".equals(fieldName)) {
            return org.intermine.model.bio.Comment.class;
        }
        if ("interactions".equals(fieldName)) {
            return org.intermine.model.bio.InteractionDetail.class;
        }
        if ("participantIdentificationMethods".equals(fieldName)) {
            return org.intermine.model.bio.InteractionTerm.class;
        }
        if (!org.intermine.model.bio.InteractionExperiment.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.InteractionExperiment.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
