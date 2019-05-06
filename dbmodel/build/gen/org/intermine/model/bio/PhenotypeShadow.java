package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class PhenotypeShadow implements Phenotype, ShadowClass
{
    public static final Class<Phenotype> shadowOf = Phenotype.class;
    // Attr: org.intermine.model.bio.Phenotype.mutantType
    protected java.lang.String mutantType;
    public java.lang.String getMutantType() { return mutantType; }
    public void setMutantType(final java.lang.String mutantType) { this.mutantType = mutantType; }

    // Attr: org.intermine.model.bio.Phenotype.strainBackground
    protected java.lang.String strainBackground;
    public java.lang.String getStrainBackground() { return strainBackground; }
    public void setStrainBackground(final java.lang.String strainBackground) { this.strainBackground = strainBackground; }

    // Attr: org.intermine.model.bio.Phenotype.experimentType
    protected java.lang.String experimentType;
    public java.lang.String getExperimentType() { return experimentType; }
    public void setExperimentType(final java.lang.String experimentType) { this.experimentType = experimentType; }

    // Attr: org.intermine.model.bio.Phenotype.allele
    protected java.lang.String allele;
    public java.lang.String getAllele() { return allele; }
    public void setAllele(final java.lang.String allele) { this.allele = allele; }

    // Attr: org.intermine.model.bio.Phenotype.observable
    protected java.lang.String observable;
    public java.lang.String getObservable() { return observable; }
    public void setObservable(final java.lang.String observable) { this.observable = observable; }

    // Attr: org.intermine.model.bio.Phenotype.qualifier
    protected java.lang.String qualifier;
    public java.lang.String getQualifier() { return qualifier; }
    public void setQualifier(final java.lang.String qualifier) { this.qualifier = qualifier; }

    // Attr: org.intermine.model.bio.Phenotype.experimentComment
    protected java.lang.String experimentComment;
    public java.lang.String getExperimentComment() { return experimentComment; }
    public void setExperimentComment(final java.lang.String experimentComment) { this.experimentComment = experimentComment; }

    // Attr: org.intermine.model.bio.Phenotype.chemical
    protected java.lang.String chemical;
    public java.lang.String getChemical() { return chemical; }
    public void setChemical(final java.lang.String chemical) { this.chemical = chemical; }

    // Attr: org.intermine.model.bio.Phenotype.reporter
    protected java.lang.String reporter;
    public java.lang.String getReporter() { return reporter; }
    public void setReporter(final java.lang.String reporter) { this.reporter = reporter; }

    // Attr: org.intermine.model.bio.Phenotype.assay
    protected java.lang.String assay;
    public java.lang.String getAssay() { return assay; }
    public void setAssay(final java.lang.String assay) { this.assay = assay; }

    // Attr: org.intermine.model.bio.Phenotype.reporterComment
    protected java.lang.String reporterComment;
    public java.lang.String getReporterComment() { return reporterComment; }
    public void setReporterComment(final java.lang.String reporterComment) { this.reporterComment = reporterComment; }

    // Attr: org.intermine.model.bio.Phenotype.details
    protected java.lang.String details;
    public java.lang.String getDetails() { return details; }
    public void setDetails(final java.lang.String details) { this.details = details; }

    // Attr: org.intermine.model.bio.Phenotype.condition
    protected java.lang.String condition;
    public java.lang.String getCondition() { return condition; }
    public void setCondition(final java.lang.String condition) { this.condition = condition; }

    // Attr: org.intermine.model.bio.Phenotype.alleleComment
    protected java.lang.String alleleComment;
    public java.lang.String getAlleleComment() { return alleleComment; }
    public void setAlleleComment(final java.lang.String alleleComment) { this.alleleComment = alleleComment; }

    // Col: org.intermine.model.bio.Phenotype.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Phenotype.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Phenotype && id != null) ? id.equals(((Phenotype)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Phenotype [allele=" + (allele == null ? "null" : "\"" + allele + "\"") + ", alleleComment=" + (alleleComment == null ? "null" : "\"" + alleleComment + "\"") + ", assay=" + (assay == null ? "null" : "\"" + assay + "\"") + ", chemical=" + (chemical == null ? "null" : "\"" + chemical + "\"") + ", condition=" + (condition == null ? "null" : "\"" + condition + "\"") + ", details=" + (details == null ? "null" : "\"" + details + "\"") + ", experimentComment=" + (experimentComment == null ? "null" : "\"" + experimentComment + "\"") + ", experimentType=" + (experimentType == null ? "null" : "\"" + experimentType + "\"") + ", id=" + id + ", mutantType=" + (mutantType == null ? "null" : "\"" + mutantType + "\"") + ", observable=" + (observable == null ? "null" : "\"" + observable + "\"") + ", qualifier=" + (qualifier == null ? "null" : "\"" + qualifier + "\"") + ", reporter=" + (reporter == null ? "null" : "\"" + reporter + "\"") + ", reporterComment=" + (reporterComment == null ? "null" : "\"" + reporterComment + "\"") + ", strainBackground=" + (strainBackground == null ? "null" : "\"" + strainBackground + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("mutantType".equals(fieldName)) {
            return mutantType;
        }
        if ("strainBackground".equals(fieldName)) {
            return strainBackground;
        }
        if ("experimentType".equals(fieldName)) {
            return experimentType;
        }
        if ("allele".equals(fieldName)) {
            return allele;
        }
        if ("observable".equals(fieldName)) {
            return observable;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("experimentComment".equals(fieldName)) {
            return experimentComment;
        }
        if ("chemical".equals(fieldName)) {
            return chemical;
        }
        if ("reporter".equals(fieldName)) {
            return reporter;
        }
        if ("assay".equals(fieldName)) {
            return assay;
        }
        if ("reporterComment".equals(fieldName)) {
            return reporterComment;
        }
        if ("details".equals(fieldName)) {
            return details;
        }
        if ("condition".equals(fieldName)) {
            return condition;
        }
        if ("alleleComment".equals(fieldName)) {
            return alleleComment;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("mutantType".equals(fieldName)) {
            return mutantType;
        }
        if ("strainBackground".equals(fieldName)) {
            return strainBackground;
        }
        if ("experimentType".equals(fieldName)) {
            return experimentType;
        }
        if ("allele".equals(fieldName)) {
            return allele;
        }
        if ("observable".equals(fieldName)) {
            return observable;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("experimentComment".equals(fieldName)) {
            return experimentComment;
        }
        if ("chemical".equals(fieldName)) {
            return chemical;
        }
        if ("reporter".equals(fieldName)) {
            return reporter;
        }
        if ("assay".equals(fieldName)) {
            return assay;
        }
        if ("reporterComment".equals(fieldName)) {
            return reporterComment;
        }
        if ("details".equals(fieldName)) {
            return details;
        }
        if ("condition".equals(fieldName)) {
            return condition;
        }
        if ("alleleComment".equals(fieldName)) {
            return alleleComment;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("mutantType".equals(fieldName)) {
            mutantType = (java.lang.String) value;
        } else if ("strainBackground".equals(fieldName)) {
            strainBackground = (java.lang.String) value;
        } else if ("experimentType".equals(fieldName)) {
            experimentType = (java.lang.String) value;
        } else if ("allele".equals(fieldName)) {
            allele = (java.lang.String) value;
        } else if ("observable".equals(fieldName)) {
            observable = (java.lang.String) value;
        } else if ("qualifier".equals(fieldName)) {
            qualifier = (java.lang.String) value;
        } else if ("experimentComment".equals(fieldName)) {
            experimentComment = (java.lang.String) value;
        } else if ("chemical".equals(fieldName)) {
            chemical = (java.lang.String) value;
        } else if ("reporter".equals(fieldName)) {
            reporter = (java.lang.String) value;
        } else if ("assay".equals(fieldName)) {
            assay = (java.lang.String) value;
        } else if ("reporterComment".equals(fieldName)) {
            reporterComment = (java.lang.String) value;
        } else if ("details".equals(fieldName)) {
            details = (java.lang.String) value;
        } else if ("condition".equals(fieldName)) {
            condition = (java.lang.String) value;
        } else if ("alleleComment".equals(fieldName)) {
            alleleComment = (java.lang.String) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("mutantType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("strainBackground".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experimentType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("allele".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("observable".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("qualifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("experimentComment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("chemical".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("reporter".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("assay".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("reporterComment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("details".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("condition".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("alleleComment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Phenotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.PhenotypeShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Phenotype");
        if (mutantType != null) {
            sb.append("$_^amutantType$_^");
            String string = mutantType;
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
        if (strainBackground != null) {
            sb.append("$_^astrainBackground$_^");
            String string = strainBackground;
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
        if (experimentType != null) {
            sb.append("$_^aexperimentType$_^");
            String string = experimentType;
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
        if (allele != null) {
            sb.append("$_^aallele$_^");
            String string = allele;
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
        if (observable != null) {
            sb.append("$_^aobservable$_^");
            String string = observable;
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
        if (qualifier != null) {
            sb.append("$_^aqualifier$_^");
            String string = qualifier;
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
        if (experimentComment != null) {
            sb.append("$_^aexperimentComment$_^");
            String string = experimentComment;
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
        if (chemical != null) {
            sb.append("$_^achemical$_^");
            String string = chemical;
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
        if (reporter != null) {
            sb.append("$_^areporter$_^");
            String string = reporter;
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
        if (assay != null) {
            sb.append("$_^aassay$_^");
            String string = assay;
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
        if (reporterComment != null) {
            sb.append("$_^areporterComment$_^");
            String string = reporterComment;
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
        if (details != null) {
            sb.append("$_^adetails$_^");
            String string = details;
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
        if (condition != null) {
            sb.append("$_^acondition$_^");
            String string = condition;
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
        if (alleleComment != null) {
            sb.append("$_^aalleleComment$_^");
            String string = alleleComment;
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
        if (!org.intermine.model.bio.PhenotypeShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Phenotype)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "amutantType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                mutantType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astrainBackground".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                strainBackground = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aexperimentType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                experimentType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aallele".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                allele = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aobservable".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                observable = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aqualifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                qualifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aexperimentComment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                experimentComment = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "achemical".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                chemical = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areporter".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                reporter = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aassay".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                assay = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "areporterComment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                reporterComment = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adetails".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                details = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acondition".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                condition = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aalleleComment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                alleleComment = string == null ? notXml[i] : string.toString();
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
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.Phenotype.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Phenotype.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
