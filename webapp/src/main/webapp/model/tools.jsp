<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im"%>

<tiles:importAttribute/>


<html:xhtml/>

<div class="body">

<!-- tools -->

<im:boxarea stylename="gradientbox"><p>
YeastMine is a flexible search interface that provides fast retrieval of chromosomal features, sequences, and GO-related annotations. 
 All data can be downloaded using the 'Export' button on the results toolbar. To view all template queries, click on the <a href="http://scone.stanford.edu:8080/yeastmine/templates.do"> 'Templates' </a> tab in the top menu bar. 
 <br>
 Please contact <a href="http://www.yeastgenome.org/suggestion">yeast-curator</a> if you have any questions.
<br>
</p></im:boxarea>


<h2>Retrieving data for a list of genes</h2>

<br>

Use the Search box in the upper right hand corner if you have a single gene but follow these steps if you have a list of genes:

<br><br>

<ol>
<li>Click on the <a href="/${WEB_PROPERTIES['webapp.path']}/bag.do"> 'Lists' </a> tab to type or upload your list.
<li>Save your list
<li>Use your gene list in a query by selecting the 'Use' button on the results toolbar, and apply the list as input to an existing template or to your own query.
</ol>

<br><br>


<h2>Query for features and chromosomal locations</h2>

<br>

Use one of the following queries to retrieve a list of genes based on a specific search criteria.  
Additional searches are available from the <a href="/${WEB_PROPERTIES['webapp.path']}/templates.do"> 'Templates' </a> tab.  All searches can be modified using the 'Edit Query' button. 
Customized searches can also be created using the <a href="/${WEB_PROPERTIES['webapp.path']}/customQuery.do"> 'QueryBuilder' </a> tab.

<br><br>

<ul>
    <li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=Chromosome_Gene_FeatureType">Chromosome --> All genes</a>
    <li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=ChromosomeRegion_AllGenes  ">Chromosomal Region --> All genes  </a>
	<li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=FeatureType_Gene">FeatureType-->Genes </a>
 	<li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=Gene_FeatureType_Introns">All genes of a selected Feature Type-->Genes with introns </a>
</ul>

<br><br>


<h2>Retrieve Gene Ontology (GO) annotations</h2>

<br>

Use one of the following queries to retrieve a list of GO annotations based on a specific search criteria. 
Additional searches are available from the <a href="/${WEB_PROPERTIES['webapp.path']}/templates.do"> 'Templates' </a> tab.  All searches can be modified using the 'Edit Query' button. 
Customized searches can also be created using the <a href="/${WEB_PROPERTIES['webapp.path']}/customQuery.do"> 'QueryBuilder' </a> tab.

<br><br>

	<ul>
		<li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=GOTerm_Genes">GO Term --> All genes </a></li>
		<li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=Gene_GO">Gene --> GO Terms</a></li>
		<li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=GOTerm_GeneOrganism">GO Term name [and children of this term] --> All genes in organism</a>
 	    <li><a href="/${WEB_PROPERTIES['webapp.path']}/template.do?name=GOSlimTerm_FeatureType_Gene">GO SlimTerm-->Genes of a selected Feature Type </a>


	</ul>
	
<br><br>


            
<!-- /tools.jsp -->

</div>
