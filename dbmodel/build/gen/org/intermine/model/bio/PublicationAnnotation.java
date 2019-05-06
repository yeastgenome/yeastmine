package org.intermine.model.bio;

public interface PublicationAnnotation extends org.intermine.model.InterMineObject
{
    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.LiteratureTopic> getLiteratureTopics();
    public void setLiteratureTopics(final java.util.Set<org.intermine.model.bio.LiteratureTopic> literatureTopics);
    public void addLiteratureTopics(final org.intermine.model.bio.LiteratureTopic arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

}
