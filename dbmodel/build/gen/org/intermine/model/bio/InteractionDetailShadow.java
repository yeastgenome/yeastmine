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

public class InteractionDetailShadow implements InteractionDetail, ShadowClass
{
    public static final Class<InteractionDetail> shadowOf = InteractionDetail.class;
    // Attr: org.intermine.model.bio.InteractionDetail.phenotype
    protected java.lang.String phenotype;
    public java.lang.String getPhenotype() { return phenotype; }
    public void setPhenotype(final java.lang.String phenotype) { this.phenotype = phenotype; }

    // Attr: org.intermine.model.bio.InteractionDetail.role2
    protected java.lang.String role2;
    public java.lang.String getRole2() { return role2; }
    public void setRole2(final java.lang.String role2) { this.role2 = role2; }

    // Attr: org.intermine.model.bio.InteractionDetail.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Attr: org.intermine.model.bio.InteractionDetail.confidenceText
    protected java.lang.String confidenceText;
    public java.lang.String getConfidenceText() { return confidenceText; }
    public void setConfidenceText(final java.lang.String confidenceText) { this.confidenceText = confidenceText; }

    // Attr: org.intermine.model.bio.InteractionDetail.role1
    protected java.lang.String role1;
    public java.lang.String getRole1() { return role1; }
    public void setRole1(final java.lang.String role1) { this.role1 = role1; }

    // Attr: org.intermine.model.bio.InteractionDetail.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.InteractionDetail.confidence
    protected java.lang.Double confidence;
    public java.lang.Double getConfidence() { return confidence; }
    public void setConfidence(final java.lang.Double confidence) { this.confidence = confidence; }

    // Attr: org.intermine.model.bio.InteractionDetail.annotationType
    protected java.lang.String annotationType;
    public java.lang.String getAnnotationType() { return annotationType; }
    public void setAnnotationType(final java.lang.String annotationType) { this.annotationType = annotationType; }

    // Attr: org.intermine.model.bio.InteractionDetail.relationshipType
    protected java.lang.String relationshipType;
    public java.lang.String getRelationshipType() { return relationshipType; }
    public void setRelationshipType(final java.lang.String relationshipType) { this.relationshipType = relationshipType; }

    // Attr: org.intermine.model.bio.InteractionDetail.shortName
    protected java.lang.String shortName;
    public java.lang.String getShortName() { return shortName; }
    public void setShortName(final java.lang.String shortName) { this.shortName = shortName; }

    // Attr: org.intermine.model.bio.InteractionDetail.modification
    protected java.lang.String modification;
    public java.lang.String getModification() { return modification; }
    public void setModification(final java.lang.String modification) { this.modification = modification; }

    // Ref: org.intermine.model.bio.InteractionDetail.experiment
    protected org.intermine.model.InterMineObject experiment;
    public org.intermine.model.bio.InteractionExperiment getExperiment() { if (experiment instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.InteractionExperiment) ((org.intermine.objectstore.proxy.ProxyReference) experiment).getObject()); }; return (org.intermine.model.bio.InteractionExperiment) experiment; }
    public void setExperiment(final org.intermine.model.bio.InteractionExperiment experiment) { this.experiment = experiment; }
    public void proxyExperiment(final org.intermine.objectstore.proxy.ProxyReference experiment) { this.experiment = experiment; }
    public org.intermine.model.InterMineObject proxGetExperiment() { return experiment; }

    // Ref: org.intermine.model.bio.InteractionDetail.interaction
    protected org.intermine.model.InterMineObject interaction;
    public org.intermine.model.bio.Interaction getInteraction() { if (interaction instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Interaction) ((org.intermine.objectstore.proxy.ProxyReference) interaction).getObject()); }; return (org.intermine.model.bio.Interaction) interaction; }
    public void setInteraction(final org.intermine.model.bio.Interaction interaction) { this.interaction = interaction; }
    public void proxyInteraction(final org.intermine.objectstore.proxy.ProxyReference interaction) { this.interaction = interaction; }
    public org.intermine.model.InterMineObject proxGetInteraction() { return interaction; }

    // Col: org.intermine.model.bio.InteractionDetail.interactingRegions
    protected java.util.Set<org.intermine.model.bio.InteractionRegion> interactingRegions = new java.util.HashSet<org.intermine.model.bio.InteractionRegion>();
    public java.util.Set<org.intermine.model.bio.InteractionRegion> getInteractingRegions() { return interactingRegions; }
    public void setInteractingRegions(final java.util.Set<org.intermine.model.bio.InteractionRegion> interactingRegions) { this.interactingRegions = interactingRegions; }
    public void addInteractingRegions(final org.intermine.model.bio.InteractionRegion arg) { interactingRegions.add(arg); }

    // Col: org.intermine.model.bio.InteractionDetail.allInteractors
    protected java.util.Set<org.intermine.model.bio.Interactor> allInteractors = new java.util.HashSet<org.intermine.model.bio.Interactor>();
    public java.util.Set<org.intermine.model.bio.Interactor> getAllInteractors() { return allInteractors; }
    public void setAllInteractors(final java.util.Set<org.intermine.model.bio.Interactor> allInteractors) { this.allInteractors = allInteractors; }
    public void addAllInteractors(final org.intermine.model.bio.Interactor arg) { allInteractors.add(arg); }

    // Col: org.intermine.model.bio.InteractionDetail.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof InteractionDetail && id != null) ? id.equals(((InteractionDetail)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "InteractionDetail [annotationType=" + (annotationType == null ? "null" : "\"" + annotationType + "\"") + ", confidence=" + confidence + ", confidenceText=" + (confidenceText == null ? "null" : "\"" + confidenceText + "\"") + ", experiment=" + (experiment == null ? "null" : (experiment.getId() == null ? "no id" : experiment.getId().toString())) + ", id=" + id + ", interaction=" + (interaction == null ? "null" : (interaction.getId() == null ? "no id" : interaction.getId().toString())) + ", modification=" + (modification == null ? "null" : "\"" + modification + "\"") + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", phenotype=" + (phenotype == null ? "null" : "\"" + phenotype + "\"") + ", relationshipType=" + (relationshipType == null ? "null" : "\"" + relationshipType + "\"") + ", role1=" + (role1 == null ? "null" : "\"" + role1 + "\"") + ", role2=" + (role2 == null ? "null" : "\"" + role2 + "\"") + ", shortName=" + (shortName == null ? "null" : "\"" + shortName + "\"") + ", type=" + (type == null ? "null" : "\"" + type + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("phenotype".equals(fieldName)) {
            return phenotype;
        }
        if ("role2".equals(fieldName)) {
            return role2;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("confidenceText".equals(fieldName)) {
            return confidenceText;
        }
        if ("role1".equals(fieldName)) {
            return role1;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("confidence".equals(fieldName)) {
            return confidence;
        }
        if ("annotationType".equals(fieldName)) {
            return annotationType;
        }
        if ("relationshipType".equals(fieldName)) {
            return relationshipType;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("modification".equals(fieldName)) {
            return modification;
        }
        if ("experiment".equals(fieldName)) {
            if (experiment instanceof ProxyReference) {
                return ((ProxyReference) experiment).getObject();
            } else {
                return experiment;
            }
        }
        if ("interaction".equals(fieldName)) {
            if (interaction instanceof ProxyReference) {
                return ((ProxyReference) interaction).getObject();
            } else {
                return interaction;
            }
        }
        if ("interactingRegions".equals(fieldName)) {
            return interactingRegions;
        }
        if ("allInteractors".equals(fieldName)) {
            return allInteractors;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.InteractionDetail.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("phenotype".equals(fieldName)) {
            return phenotype;
        }
        if ("role2".equals(fieldName)) {
            return role2;
        }
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("confidenceText".equals(fieldName)) {
            return confidenceText;
        }
        if ("role1".equals(fieldName)) {
            return role1;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("confidence".equals(fieldName)) {
            return confidence;
        }
        if ("annotationType".equals(fieldName)) {
            return annotationType;
        }
        if ("relationshipType".equals(fieldName)) {
            return relationshipType;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("modification".equals(fieldName)) {
            return modification;
        }
        if ("experiment".equals(fieldName)) {
            return experiment;
        }
        if ("interaction".equals(fieldName)) {
            return interaction;
        }
        if ("interactingRegions".equals(fieldName)) {
            return interactingRegions;
        }
        if ("allInteractors".equals(fieldName)) {
            return allInteractors;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.InteractionDetail.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("phenotype".equals(fieldName)) {
            phenotype = (java.lang.String) value;
        } else if ("role2".equals(fieldName)) {
            role2 = (java.lang.String) value;
        } else if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("confidenceText".equals(fieldName)) {
            confidenceText = (java.lang.String) value;
        } else if ("role1".equals(fieldName)) {
            role1 = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("confidence".equals(fieldName)) {
            confidence = (java.lang.Double) value;
        } else if ("annotationType".equals(fieldName)) {
            annotationType = (java.lang.String) value;
        } else if ("relationshipType".equals(fieldName)) {
            relationshipType = (java.lang.String) value;
        } else if ("shortName".equals(fieldName)) {
            shortName = (java.lang.String) value;
        } else if ("modification".equals(fieldName)) {
            modification = (java.lang.String) value;
        } else if ("experiment".equals(fieldName)) {
            experiment = (org.intermine.model.InterMineObject) value;
        } else if ("interaction".equals(fieldName)) {
            interaction = (org.intermine.model.InterMineObject) value;
        } else if ("interactingRegions".equals(fieldName)) {
            interactingRegions = (java.util.Set) value;
        } else if ("allInteractors".equals(fieldName)) {
            allInteractors = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.InteractionDetail.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("phenotype".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("role2".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("confidenceText".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("role1".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("confidence".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("annotationType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("relationshipType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("shortName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("modification".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experiment".equals(fieldName)) {
            return org.intermine.model.bio.InteractionExperiment.class;
        }
        if ("interaction".equals(fieldName)) {
            return org.intermine.model.bio.Interaction.class;
        }
        if ("interactingRegions".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("allInteractors".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.InteractionDetail.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.InteractionDetail.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.InteractionDetailShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.InteractionDetail");
        if (phenotype != null) {
            sb.append("$_^aphenotype$_^");
            String string = phenotype;
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
        if (role2 != null) {
            sb.append("$_^arole2$_^");
            String string = role2;
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
        if (confidenceText != null) {
            sb.append("$_^aconfidenceText$_^");
            String string = confidenceText;
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
        if (role1 != null) {
            sb.append("$_^arole1$_^");
            String string = role1;
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
        if (confidence != null) {
            sb.append("$_^aconfidence$_^").append(confidence);
        }
        if (annotationType != null) {
            sb.append("$_^aannotationType$_^");
            String string = annotationType;
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
        if (relationshipType != null) {
            sb.append("$_^arelationshipType$_^");
            String string = relationshipType;
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
        if (shortName != null) {
            sb.append("$_^ashortName$_^");
            String string = shortName;
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
        if (modification != null) {
            sb.append("$_^amodification$_^");
            String string = modification;
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
        if (experiment != null) {
            sb.append("$_^rexperiment$_^").append(experiment.getId());
        }
        if (interaction != null) {
            sb.append("$_^rinteraction$_^").append(interaction.getId());
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
        if (!org.intermine.model.bio.InteractionDetailShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.InteractionDetail)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aphenotype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                phenotype = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arole2".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                role2 = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aconfidenceText".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                confidenceText = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arole1".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                role1 = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aconfidence".equals(notXml[i])) {
                i++;
                confidence = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aannotationType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                annotationType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "arelationshipType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                relationshipType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ashortName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                shortName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amodification".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                modification = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rexperiment".equals(notXml[i])) {
                i++;
                experiment = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.InteractionExperiment.class);
                i++;
            };
            if ((i < notXml.length) &&"rinteraction".equals(notXml[i])) {
                i++;
                interaction = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Interaction.class);
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
        interactingRegions = new ProxyCollection<org.intermine.model.bio.InteractionRegion>(os, this, "interactingRegions", org.intermine.model.bio.InteractionRegion.class);
        allInteractors = new ProxyCollection<org.intermine.model.bio.Interactor>(os, this, "allInteractors", org.intermine.model.bio.Interactor.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("interactingRegions".equals(fieldName)) {
            interactingRegions.add((org.intermine.model.bio.InteractionRegion) element);
        } else if ("allInteractors".equals(fieldName)) {
            allInteractors.add((org.intermine.model.bio.Interactor) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.InteractionDetail.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("interactingRegions".equals(fieldName)) {
            return org.intermine.model.bio.InteractionRegion.class;
        }
        if ("allInteractors".equals(fieldName)) {
            return org.intermine.model.bio.Interactor.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.InteractionDetail.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.InteractionDetail.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
