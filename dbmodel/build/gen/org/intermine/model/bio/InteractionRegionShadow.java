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

public class InteractionRegionShadow implements InteractionRegion, ShadowClass
{
    public static final Class<InteractionRegion> shadowOf = InteractionRegion.class;
    // Attr: org.intermine.model.bio.InteractionRegion.startStatus
    protected java.lang.String startStatus;
    public java.lang.String getStartStatus() { return startStatus; }
    public void setStartStatus(final java.lang.String startStatus) { this.startStatus = startStatus; }

    // Attr: org.intermine.model.bio.InteractionRegion.endStatus
    protected java.lang.String endStatus;
    public java.lang.String getEndStatus() { return endStatus; }
    public void setEndStatus(final java.lang.String endStatus) { this.endStatus = endStatus; }

    // Ref: org.intermine.model.bio.InteractionRegion.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Ref: org.intermine.model.bio.InteractionRegion.ontologyTerm
    protected org.intermine.model.InterMineObject ontologyTerm;
    public org.intermine.model.bio.OntologyTerm getOntologyTerm() { if (ontologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) ontologyTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) ontologyTerm; }
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public org.intermine.model.InterMineObject proxGetOntologyTerm() { return ontologyTerm; }

    // Ref: org.intermine.model.bio.InteractionRegion.interaction
    protected org.intermine.model.InterMineObject interaction;
    public org.intermine.model.bio.InteractionDetail getInteraction() { if (interaction instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.InteractionDetail) ((org.intermine.objectstore.proxy.ProxyReference) interaction).getObject()); }; return (org.intermine.model.bio.InteractionDetail) interaction; }
    public void setInteraction(final org.intermine.model.bio.InteractionDetail interaction) { this.interaction = interaction; }
    public void proxyInteraction(final org.intermine.objectstore.proxy.ProxyReference interaction) { this.interaction = interaction; }
    public org.intermine.model.InterMineObject proxGetInteraction() { return interaction; }

    // Col: org.intermine.model.bio.InteractionRegion.locations
    protected java.util.Set<org.intermine.model.bio.Location> locations = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocations() { return locations; }
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations) { this.locations = locations; }
    public void addLocations(final org.intermine.model.bio.Location arg) { locations.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof InteractionRegion && id != null) ? id.equals(((InteractionRegion)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "InteractionRegion [endStatus=" + (endStatus == null ? "null" : "\"" + endStatus + "\"") + ", gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", id=" + id + ", interaction=" + (interaction == null ? "null" : (interaction.getId() == null ? "no id" : interaction.getId().toString())) + ", ontologyTerm=" + (ontologyTerm == null ? "null" : (ontologyTerm.getId() == null ? "no id" : ontologyTerm.getId().toString())) + ", startStatus=" + (startStatus == null ? "null" : "\"" + startStatus + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("startStatus".equals(fieldName)) {
            return startStatus;
        }
        if ("endStatus".equals(fieldName)) {
            return endStatus;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("ontologyTerm".equals(fieldName)) {
            if (ontologyTerm instanceof ProxyReference) {
                return ((ProxyReference) ontologyTerm).getObject();
            } else {
                return ontologyTerm;
            }
        }
        if ("interaction".equals(fieldName)) {
            if (interaction instanceof ProxyReference) {
                return ((ProxyReference) interaction).getObject();
            } else {
                return interaction;
            }
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.InteractionRegion.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("startStatus".equals(fieldName)) {
            return startStatus;
        }
        if ("endStatus".equals(fieldName)) {
            return endStatus;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return ontologyTerm;
        }
        if ("interaction".equals(fieldName)) {
            return interaction;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.InteractionRegion.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("startStatus".equals(fieldName)) {
            startStatus = (java.lang.String) value;
        } else if ("endStatus".equals(fieldName)) {
            endStatus = (java.lang.String) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("ontologyTerm".equals(fieldName)) {
            ontologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("interaction".equals(fieldName)) {
            interaction = (org.intermine.model.InterMineObject) value;
        } else if ("locations".equals(fieldName)) {
            locations = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.InteractionRegion.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("startStatus".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("endStatus".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("interaction".equals(fieldName)) {
            return org.intermine.model.bio.InteractionDetail.class;
        }
        if ("locations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.InteractionRegion.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.InteractionRegion.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.InteractionRegionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.InteractionRegion");
        if (startStatus != null) {
            sb.append("$_^astartStatus$_^");
            String string = startStatus;
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
        if (endStatus != null) {
            sb.append("$_^aendStatus$_^");
            String string = endStatus;
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
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
        }
        if (ontologyTerm != null) {
            sb.append("$_^rontologyTerm$_^").append(ontologyTerm.getId());
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
        if (!org.intermine.model.bio.InteractionRegionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.InteractionRegion)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "astartStatus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                startStatus = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aendStatus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                endStatus = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rontologyTerm".equals(notXml[i])) {
                i++;
                ontologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rinteraction".equals(notXml[i])) {
                i++;
                interaction = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.InteractionDetail.class);
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
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("locations".equals(fieldName)) {
            locations.add((org.intermine.model.bio.Location) element);
        } else {
            if (!org.intermine.model.bio.InteractionRegion.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("locations".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if (!org.intermine.model.bio.InteractionRegion.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.InteractionRegion.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
